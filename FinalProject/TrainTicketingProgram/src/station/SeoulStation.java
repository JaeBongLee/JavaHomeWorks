package station;

import java.util.LinkedList;

import client.Client;

public class SeoulStation extends Station implements AlgorithmPolicy{
	public SeoulStation(){
		this.stationName = "Seoul";
		this.platformQueue = new LinkedList<Client>();
		this.waitTicketingQueue = new LinkedList<Client>();
	}
	
public int goingTo(String stationName) {
		
		if (stationName.equals("Chuncheon"))
		{
			return 16;
		}
		else if(stationName.equals("Daejeon"))
		{
			return 29;
		}
		else if(stationName.equals("Gwangju"))
		{
			return 41;
		}
		else if (stationName.equals("Gyeongju"))
		{
			return 47;
		}
		else if (stationName.equals("Asan"))
		{
			return 20;
		}
		else if (stationName.equals("Wonju"))
		{
			return 22;
		}
		else 
			return 0;
	}
	
	
}
