package interfaces;

public class Main {

	public static void main(String[] args) {
		
		// İnterface new yapılamaz
		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
		customerManager.add();

	}

}
