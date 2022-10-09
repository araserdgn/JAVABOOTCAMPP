package abstractDemo;

public class CustomerManager {

	BaseDatabaseManager dataBaseManager; // iki sınıfın da annesi old. için cagırdık alan oolusturdk
	
	public void getCutomers() {
		
		dataBaseManager.getData();
		
	}
}
