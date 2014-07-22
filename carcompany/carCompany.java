package carcompany;

public class carCompany {
	static final int CARMAX = 100;
	
	private Car[] carList = new Car[CARMAX];
	private int carNumber = 0;
	
	private static carCompany instance = new carCompany();
	
	private carCompany(){};
	public static carCompany getInstance(){
		if(instance == null)
		{
			instance = new carCompany();
		}
		return instance;
	}
	
	public Car[] getCarList(){
		return this.carList;
	}
	
	public int getCarNumber(){
		return this.carNumber;
	}
	
	public void addCar(Car newCar){
		if(carNumber < carList.length){
			this.carList[carNumber++] = newCar;
		}
		else{
			System.out.println("더 이상 추가 불가능");
		}
	}
	
	public void addCar(Car newCar, int num){
		int i;
		for(i = 0 ; i < num ; i++)
		{
			this.addCar(newCar);
		}
	}
	
}
