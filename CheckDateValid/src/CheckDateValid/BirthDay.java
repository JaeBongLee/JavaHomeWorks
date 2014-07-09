package CheckDateValid;

public class BirthDay {
	public int year;
	public int month;
	public int day;
	

	public BirthDay(){};
	public BirthDay(int year, int month, int day) {
		// TODO Auto-generated constructor stub
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	
	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}

	public void setDate(int year, int month,int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public boolean checkValidate()
	{
		int year = this.year;
		int month = this.month;
		int day = this.day;
		
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month ==12)
		{
			if (day >= 1 && day <= 31)
				return true;
			return false;
		}
		else if(month == 4 || month == 6 || month == 9 || month == 11)
		{
			if (day >= 1 && day <= 30)
				return true;
			return false;
		}
		
		else if(month == 2){
			if (year % 4 == 0 && (year % 100 !=0 || year % 400 == 0))//윤년일때
			{
				if(day >= 1 && day <= 29)
					return true;
				return false;
			}
			else
			{
				if(day >= 1 && day <=28)
					return true;
				return false;
			}
		}
		else
			return false;
	}
}
