package client;

public class Client {
	public String getClientName() {
		return ClientName;
	}


	public void setClientName(String clientName) {
		ClientName = clientName;
	}
	
	private String ID;
	private String ClientName;
	private String ArrivalTime;
	private String TicketingTime;
	private String startStation;
	private String ArrivalStaion;
	private String ConsumeTime;
	private boolean HasTicket;
	private String trainStartTime;
	private String trainArrivalTime;
	Client(){};
	
	
	
	

	
	//Getter and Setter
	
	public boolean isHasTicket() {
		return HasTicket;
	}


	public void setHasTicket(boolean hasTicket) {
		HasTicket = hasTicket;
	}


	public String getTrainStartTime() {
		return trainStartTime;
	}


	public void setTrainStartTime(String trainStartTime) {
		this.trainStartTime = trainStartTime;
	}


	public String getTrainArrivalTime() {
		return trainArrivalTime;
	}


	public void setTrainArrivalTime(String trainArrivalTime) {
		this.trainArrivalTime = trainArrivalTime;
	}


	


	@Override
	public String toString() {
		return "Client [ID=" + ID + ", ClientName=" + ClientName
				+ ", ArrivalTime=" + ArrivalTime + ", TicketingTime="
				+ TicketingTime + ", startStation=" + startStation
				+ ", ArrivalStaion=" + ArrivalStaion + ", ConsumeTime="
				+ ConsumeTime + ", HasTicket=" + HasTicket
				+ ", trainStartTime=" + trainStartTime + ", trainArrivalTime="
				+ trainArrivalTime + "]";
	}


	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getArrivalTime() {
		return ArrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		ArrivalTime = arrivalTime;
	}
	public String getTicketingTime() {
		return TicketingTime;
	}
	public void setTicketingTime(String ticketingTime) {
		TicketingTime = ticketingTime;
	}
	public String getStartStation() {
		return startStation;
	}
	public void setStartStation(String startStation) {
		this.startStation = startStation;
	}
	public String getArrivalStaion() {
		return ArrivalStaion;
	}
	public void setArrivalStaion(String arrivalStaion) {
		ArrivalStaion = arrivalStaion;
	}
	public String getConsumeTime() {
		return ConsumeTime;
	}
	public void setConsumeTime(String consumeTime) {
		ConsumeTime = consumeTime;
	}
	public boolean getTicket() {
		return HasTicket;
	}
	public void setTicket(boolean ticket) {
		HasTicket = ticket;
	}
	
	
	
}
