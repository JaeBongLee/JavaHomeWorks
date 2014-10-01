package station;

import java.util.LinkedList;

import client.Client;

public class GyeongjuStation extends Station implements AlgorithmPolicy{
	public GyeongjuStation(){                                                                                                                                                                                                                                                 
		this.stationName = "Gyeongju";
		this.platformQueue = new LinkedList<Client>();
		this.waitTicketingQueue = new LinkedList<Client>();
	}
	
public int goingTo(String stationName) {
		
		if (stationName.equals("Chuncheon"))
		{
			return 31;
		}
		else if(stationName.equals("Daejeon"))
		{
			return 15;
		}
		else if(stationName.equals("Gwangju"))
		{
			return 18;
		}
		else if (stationName.equals("Asan"))
		{
			return 43;
		}
		else if (stationName.equals("Seoul"))
		{
			return 47;
		}
		else if (stationName.equals("Wonju"))
		{
			return 32;
		}
		else 
			return 0;
	}
	
	
	
}
