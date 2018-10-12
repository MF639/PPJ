package ppj.zadania;

public class Salary {
	
	private String name;				//Worker name
	private double hours;				//Hours worked
	public double minWage = 12;		//Minimum Wage: 12zl/h
	public double weekStandard = 40;	//Weekly hours standard: 40h
	public double maxHours = 60;		//Max number of hours
	public double overtime = 1.5;		//Overtime rate: 150%
	
	public Salary(String name, double hours) {		//Class constructor
		this.name = name;
		this.hours = hours;
	}
	
	public void setName(String name) {				//Use this method to set a name
		this.name = name;
	}
	
	public String getName() {						//Use this method to return name value
		return name;
	}
	
	public void setHours(double hours) {
		this.hours = hours;
	}
	
	public double getHours() {
		return hours;
	}

	

}
