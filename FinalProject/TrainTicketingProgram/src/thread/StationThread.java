package thread;

import station.Station;

public class StationThread extends Thread{
	Station station;
	public StationThread(Station station){
		this.station = station;
	}
	
	public void run()
	{
		while(true)
		{
			station.ticketingStart();
			if(MainThread.finalQueue.size() >= 50)
				break;
		}
	}
}
