package thread;

import client.Client;

public class TicketingHelper extends Thread{
	private boolean nowTicketing;
	public Client nowClient;
	
	public TicketingHelper(){};
	public void newClient(Client client)
	{
		if(client != null)
			nowClient = client;
		else
			return;
	}
	
	public boolean getNowTicketing()
	{
		return nowTicketing;
	}
	
	public synchronized void run()
	{
		nowTicketing = true;
		int clientTicketingTime = Integer.parseInt(nowClient.getTicketingTime());
		try {
			Thread.sleep(clientTicketingTime * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Ticketing for "+ nowClient.getClientName() +"complete");
		nowClient.setTicket(true);
		nowTicketing = false;
	}
	
	
	
}