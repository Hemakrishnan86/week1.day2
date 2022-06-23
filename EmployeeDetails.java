package week1.day2;

public class EmployeeDetails {


	//Arguments

	//Functions (Public void getEmployeeDetails(String empName, int empId))

	public void getEmployeeDetails(String empName, int empId) {

		System.out.println(empName + '-' + empId);


	}

	public String getAddress() {

		String address = "3rd Main Road, Chennai ";
		return address;

	}
	public static void main(String[] args) {

		EmployeeDetails emp = new EmployeeDetails();
		emp.getEmployeeDetails("Hema", 11341338);
		
		String address = emp.getAddress();
		System.out.println(address);	// Storing the value to a variable
		
		// OR System.out.println(emp.getAddress()); //without storing the value 


	}

}
