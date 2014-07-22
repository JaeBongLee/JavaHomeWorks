package carcompany;

public class Car {
	protected int price;
	protected String name;
	
	public Car(){
		
	}
	
	public Car(String name, int price){
		this.name = name;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public void printDetail(){
		System.out.println(this.name + "," + this.price);
	}
	
}