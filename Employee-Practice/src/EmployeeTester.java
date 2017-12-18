import java.util.ArrayList;

public class EmployeeTester {

	public static void main(String[] args) {
		
ArrayList<HourlyPaidEmployee> hourlyEmployees = new ArrayList<HourlyPaidEmployee>(); 


		HourlyPaidEmployee emp1 = new HourlyPaidEmployee();
		emp1.setEmpID(1);
		emp1.setName("Jim Morris");
		emp1.setAddress("123 Ormeau Road");
		emp1.setAge(52);
		emp1.setHourlyRate(10);
		emp1.setHoursWorked(12);
		hourlyEmployees.add(emp1);
		
			
		
		HourlyPaidEmployee emp2 = new HourlyPaidEmployee();
		emp2.setEmpID(2);
		emp2.setName("Kerry Mildren");
		emp2.setAddress("111 Malone Road");
		emp2.setAge(59);
		emp2.setHourlyRate(10);
		emp2.setHoursWorked(12);
		hourlyEmployees.add(emp2);
		
		
		
		HourlyPaidEmployee emp3 = new HourlyPaidEmployee();
		emp3.setEmpID(3);
		emp3.setName("Ryan Magee");
		emp3.setAddress("12 Mount Merrion Avenue");
		emp3.setAge(23);
		emp3.setHourlyRate(10);
		hourlyEmployees.add(emp3);
		
		HourlyPaidEmployee emp4 = new HourlyPaidEmployee();
		emp4.setEmpID(4);
		emp4.setName("Dearbhla O'Neill");
		emp4.setAddress("143 Springfield Road");
		emp4.setAge(18);
		emp4.setHourlyRate(10);
		emp4.setHoursWorked(12);
		hourlyEmployees.add(emp4);
		
		HourlyPaidEmployee emp5 = new HourlyPaidEmployee();
		emp5.setEmpID(5);
		emp5.setName("Shelia McCann");
		emp5.setAddress("11 Deramore Road");
		emp5.setAge(67);
		emp5.setHourlyRate(10);
		emp5.setHoursWorked(12);
		hourlyEmployees.add(emp5);

		//System.out.println(getOldestEmployee(hourlyEmployees));
		
		System.out.println(hourlyEmployees);
		
	}
		
	
	public static String getOldestEmployee(ArrayList<HourlyPaidEmployee> hourlyEmployees) {
		int maxAge = 0;
		String oldestEmployee = "";
		
		for (int i = 0; i < hourlyEmployees.size(); i++) {
			
			HourlyPaidEmployee currentEmployee = hourlyEmployees.get(i);
			if (currentEmployee.getAge()> maxAge) {
				maxAge = currentEmployee.getAge();
				oldestEmployee = currentEmployee.getName();
			}
		
		}		
		
		return oldestEmployee;
		
		
	}
	


}
