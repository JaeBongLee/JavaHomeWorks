package carcompany;

public class CarPriceSum {
	static final int CARMAX = 100;
	private int length = 0;
	
	private Car[] carList = new Car[CARMAX];
	
	public CarPriceSum(){};
	public CarPriceSum(Car[] cars, int size){
		this.carList = cars;
		this.length = size;
	}
	
	public int getSum(){
		int i;
		int sum = 0;
		for (i = 0 ; i < this.length ; i++){
			sum += this.carList[i].getPrice();
		}
		return sum;
	}

}
