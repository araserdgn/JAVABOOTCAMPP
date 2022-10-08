
public class Customer {

	public int Id;

	public String city;
	
	
	
	

	/*
	 * public String getTaxNumber() { return taxNumber; }
	 * 
	 * public void setTaxNumber(String taxNumber) { this.taxNumber = taxNumber; }
	 */

	public Customer() {
		System.out.println("Müşteri nesne calıstı");
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getId() { // degisiklikler burada yapılır
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}



}
