
public class HourlyPaidEmployee extends Employee {
	
	public double hourlyRate, hoursWorked;
	
	public HourlyPaidEmployee() {
		super();
	}


	public HourlyPaidEmployee(int empID, String name, String address, int age, int hourlyRate, int hoursWorked) {
		super(empID, name, address, age);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}


	public double getHoursWorked() {
		return hoursWorked;
	}


	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}


	public void printPaySlip()


	{
		
		double grossPay = (hourlyRate*hoursWorked);
		
		System.out.printf("\nGross Pay: £%.2f", grossPay);
	}


	@Override
	public String toString() {
	return "Employee ID: " + this.getEmpID() +  "\t" +
			"Age: " + this.getAge() +   "\n" +
			"Name: " + this.getName() +   "\n" +
			"Address: " + this.getAddress() +   "\n" +
			"Hourly Rate: " + this.getHourlyRate() + "\n" +
			"Hours Worked: " + this.getHoursWorked();
				
				
				
			
	}


	
	
	
		
	
	}

	
	
	
	
	
