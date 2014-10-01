package thread;

import java.util.Queue;

import station.Station;
import client.Client;

public class TrainThread extends Thread{
	public Queue<Client> platformQueue;
	private int trainStartTime = 0;
	private Station station;
	
	public TrainThread(Station station)
	{
		this.station = station;
		this.platformQueue = station.platformQueue;
	}
	
	public synchronized void trainStart()
	{
		while(!platformQueue.isEmpty())
		{
			Client inTrainClient = platformQueue.poll();
			int a = station.goingTo(inTrainClient.getArrivalStaion());
			inTrainClient.setTrainStartTime(""+trainStartTime);
			inTrainClient.setTrainArrivalTime(""+ (a + trainStartTime));
			inTrainClient.setConsumeTime(""+ (Integer.parseInt(inTrainClient.getTrainArrivalTime()) - (Integer.parseInt(inTrainClient.getArrivalTime()) + station.goingTo(inTrainClient.getArrivalStaion()))));
			MainThread.finalQueue.add(inTrainClient);
			System.out.println(MainThread.finalQueue.toString());
		}
		
		trainStartTime += 3;
		
	}
	
	public synchronized void  run()
	{
		while(true)
		{
			try{
				trainStart();
				Thread.sleep(3000);
			}catch(Exception e){};
			if(MainThread.finalQueue.size() >= 50)
				break;
			
		}
	}
}
