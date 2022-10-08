
public class CustomerManager {
	
	private Customer _customer;
	private ICreditManager _creditManager;
	
	public CustomerManager (Customer customer, ICreditManager creditManager) { // diger metodlara ulasmak için
		_customer=customer;
		_creditManager= creditManager;
	}
	
	public void Save() {
		System.out.println("Müşteri Kaydedildi:  "  );
	}
	
	public void Delete() {
		System.out.println("Müşteri Silindi: " );
	}

	public void GiveCredit() {
		_creditManager.Hesapla();
		System.out.println("Kredi verildi");
	}
}
