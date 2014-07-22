package carcompany;

public class CarCompayMain {
	public static void main(String[] args){
		int i;
		
		carCompany company1 = carCompany.getInstance();
		CarPriceSum sum1;
		
		for(i = 0 ; i < 3;i++){
			company1.addCar(new Sonata());
			System.out.println(company1.getCarNumber()+ ":");
			company1.getCarList()[company1.getCarNumber()-1].printDetail();
		}
		
		for(i = 0 ; i < 2;i++){
			company1.addCar(new Granduer());
			System.out.println(company1.getCarNumber()+ ":");
			company1.getCarList()[company1.getCarNumber()-1].printDetail();
		}
		
		for(i = 0 ; i < 1;i++){
			company1.addCar(new Genesis());
			System.out.println(company1.getCarNumber()+ ":");
			company1.getCarList()[company1.getCarNumber()-1].printDetail();
		}
		
		sum1 = new CarPriceSum(company1.getCarList(),company1.getCarNumber());
		System.out.println("sum of every cars' prices :" + sum1.getSum());
	}

}
