package interfaces;

public class MySqlCustomerDal implements ICustomerDal,IRepository{ // birden falza interface imp. edilebilir

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("My sql eklendii");
	}

	
	
}
