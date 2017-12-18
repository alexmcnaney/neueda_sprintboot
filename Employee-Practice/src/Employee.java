
public class Employee {
	
	
	private int  empID, age;
	private String name, address;
	
	
	
	public Employee() {
		super();
	}

	public Employee (int empID, String name, String address, int age) {
		
		this.empID = empID;
		this.name = name;
		this.address = address;
		this.age = age;

	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public String toString() {
		return "Employee ID: " + getEmpID() +  "\t" +
					"Age: " + getAge() +   "\n" +
					"Name: " + getName() +   "\n" +
					"Address: " + getAddress();
	}



	
	

}
