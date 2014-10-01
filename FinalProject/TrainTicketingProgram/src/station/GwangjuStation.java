package station;

import java.util.LinkedList;

import client.Client;

public class GwangjuStation extends Station implements AlgorithmPolicy{
	public GwangjuStation(){                                                                                                                                                                                                                                                 
		this.stationName = "Gwangju";
		this.platformQueue = new LinkedList<Client>();
		this.waitTicketingQueue = new LinkedList<Client>();
	}
	
public int goingTo(String stationName) {
		
		if (stationName.equals("Chuncheon"))
		{
			return 49;
		}
		else if(stationName.equals("Daejeon"))
		{
			return 12;
		}
		else if(stationName.equals("Asan"))
		{
			return 25;
		}
		else if (stationName.equals("Gyeongju"))
		{
			return 18;
		}
		else if (stationName.equals("Seoul"))
		{
			return 41;
		}
		else if (stationName.equals("Wonju"))
		{
			return 35;
		}
		else 
			return 0;
	}
	
}

