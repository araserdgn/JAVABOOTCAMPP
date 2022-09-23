package inheritence;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer= new Customer();
		Employeer employeer= new Employeer();
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		
		customerManager.Add(); // ORTAK OLAN METHOD
		employeeManager.BestEmployee(); // SADECE EMPLOYEDE OLAN
		employeeManager.Add();

	}

}
