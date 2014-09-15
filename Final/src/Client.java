
public class Client {
	String id;
	String name;
	String time_arrival;
	String time_ticketing;
	String station_start;
	String station_arrival;
	
	public Client(String id , String name, String time_arrival, String time_ticketing, String station_start, String station_arrival){
		this. id = id;
		this. name = name;
		this.time_arrival = time_arrival;
		this.time_ticketing = time_ticketing;
		this.station_start = station_start;
		this.station_arrival = station_arrival;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTime_arrival() {
		return time_arrival;
	}

	public void setTime_arrival(String time_arrival) {
		this.time_arrival = time_arrival;
	}

	public String getTime_ticketing() {
		return time_ticketing;
	}

	public void setTime_ticketing(String time_ticketing) {
		this.time_ticketing = time_ticketing;
	}

	public String getStation_start() {
		return station_start;
	}

	public void setStation_start(String station_start) {
		this.station_start = station_start;
	}

	public String getStation_arrival() {
		return station_arrival;
	}

	public void setStation_arrival(String station_arrival) {
		this.station_arrival = station_arrival;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", time_arrival="
				+ time_arrival + ", time_ticketing=" + time_ticketing
				+ ", station_start=" + station_start + ", station_arrival="
				+ station_arrival + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getTime_arrival()=" + getTime_arrival()
				+ ", getTime_ticketing()=" + getTime_ticketing()
				+ ", getStation_start()=" + getStation_start()
				+ ", getStation_arrival()=" + getStation_arrival()
				+ "]";
	}
	
	
	
}
