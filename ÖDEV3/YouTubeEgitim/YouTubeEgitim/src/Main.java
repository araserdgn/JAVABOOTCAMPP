
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomerManager customerMaanger = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerMaanger.GiveCredit();
		
		CustomerManager customerManager2= new CustomerManager(new Person(), new CarCreditManager() );
		customerManager2.GiveCredit();
		
	}

}
