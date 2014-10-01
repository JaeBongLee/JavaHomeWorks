package station;

import java.util.LinkedList;

import client.Client;

public class DaejeonStation extends Station implements AlgorithmPolicy{
	public DaejeonStation(){                                                                                                                                                                                                                                                 
		this.stationName = "Daejeon";
		this.platformQueue = new LinkedList<Client>();
		this.waitTicketingQueue = new LinkedList<Client>();
	}
	
public int goingTo(String stationName) {
		
		if (stationName.equals("Chuncheon"))
		{
			return 45;
		}
		else if(stationName.equals("Asan"))
		{
			return 35;
		}
		else if(stationName.equals("Gwangju"))
		{
			return 12;
		}
		else if (stationName.equals("Gyeongju"))
		{
			return 15;
		}
		else if (stationName.equals("Seoul"))
		{
			return 29;
		}
		else if (stationName.equals("Wonju"))
		{
			return 23;
		}
		else 
			return 0;
	}
	
	
}
