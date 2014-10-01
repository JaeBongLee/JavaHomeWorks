package station;

import java.util.Queue;

import thread.TicketingHelper;
import client.Client;

public abstract class Station implements AlgorithmPolicy{
	public String stationName;
	public Queue<Client> platformQueue;
	public Queue<Client> waitTicketingQueue;
	
	TicketingHelper ticketingHelper1 = new TicketingHelper();
	TicketingHelper ticketingHelper2 = new TicketingHelper();
	TicketingHelper ticketingHelper3 = new TicketingHelper();
	
	Client nowTicketingClient1;
	Client nowTicketingClient2;
	Client nowTicketingClient3;
	
	public void ticketingStart()
	{
		
		
		if(!ticketingHelper1.getNowTicketing())
		{
			if(!waitTicketingQueue.isEmpty()){
				nowTicketingClient1 = waitTicketingQueue.poll();
				ticketingHelper1.newClient(nowTicketingClient1);
				Thread th1 = new Thread(ticketingHelper1);
				th1.start();
			}
		}
		
		if(!ticketingHelper2.getNowTicketing())
		{
			if(!waitTicketingQueue.isEmpty()){
				nowTicketingClient2 = waitTicketingQueue.poll();	
				ticketingHelper2.newClient(nowTicketingClient2);
				Thread th2 = new Thread(ticketingHelper2);
				th2.start();
			}
		}
		
		if(!ticketingHelper3.getNowTicketing())
		{
			if(!waitTicketingQueue.isEmpty()){
				nowTicketingClient3 = waitTicketingQueue.poll();
				ticketingHelper3.newClient(nowTicketingClient3);
				Thread th3 = new Thread(ticketingHelper3);
				th3.start();
			}
		}
		
		try{
			if(nowTicketingClient1.getTicket())
			{
				platformQueue.add(nowTicketingClient1);
				nowTicketingClient1.setTicket(false);
				System.out.println(nowTicketingClient1.getClientName()+ "on platform");
			}
			
			if(nowTicketingClient2.getTicket())
			{
				platformQueue.add(nowTicketingClient2);
				nowTicketingClient2.setTicket(false);
				System.out.println(nowTicketingClient2.getClientName()+ "on platform");
			}
			
			if(nowTicketingClient3.getTicket())
			{
				platformQueue.add(nowTicketingClient3);
				nowTicketingClient3.setTicket(false);
				System.out.println(nowTicketingClient3.getClientName()+ "on platform");
			}	
		}catch(Exception e){};
		
		
	}
	
}
