package station;

import java.util.LinkedList;

import client.Client;

public class WonjuStation extends Station implements AlgorithmPolicy{
	public WonjuStation(){                                                                                                                                                                                                                                                 
		this.stationName = "Wonju";
		this.platformQueue = new LinkedList<Client>();
		this.waitTicketingQueue = new LinkedList<Client>();
	}
	
	
public int goingTo(String stationName) {
		
		if (stationName.equals("Chuncheon"))
		{
			return 28;
		}
		else if(stationName.equals("Daejeon"))
		{
			return 23;
		}
		else if(stationName.equals("Gwangju"))
		{
			return 35;
		}
		else if (stationName.equals("Gyeongju"))
		{
			return 32;
		}
		else if (stationName.equals("Seoul"))
		{
			return 22;
		}
		else if (stationName.equals("Asan"))
		{
			return 42;
		}
		else 
			return 0;
	}
	
	
}
