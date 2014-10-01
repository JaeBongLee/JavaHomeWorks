package station;

import java.util.LinkedList;

import client.Client;

public class AsanStation extends Station implements AlgorithmPolicy{
	public AsanStation(){                                                                                                                                                                                                                                                 
		this.stationName = "Asan";
		this.platformQueue = new LinkedList<Client>();
		this.waitTicketingQueue = new LinkedList<Client>();
	}

	@Override
	public int goingTo(String stationName) {
		
		if (stationName.equals("Chuncheon"))
		{
			return 36;
		}
		else if(stationName.equals("Daejeon"))
		{
			return 35;
		}
		else if(stationName.equals("Gwangju"))
		{
			return 25;
		}
		else if (stationName.equals("Gyeongju"))
		{
			return 43;
		}
		else if (stationName.equals("Seoul"))
		{
			return 20;
		}
		else if (stationName.equals("Wonju"))
		{
			return 42;
		}
		else 
			return 0;
	}
	
	
}
