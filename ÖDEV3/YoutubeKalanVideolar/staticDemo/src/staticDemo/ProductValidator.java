package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("Yapıcı static blok calıstı");
	}
	
	public ProductValidator() {
		System.out.println("Yapıcı blok calıstı");
	} // yapıcı blok NEW yapınca calısır

	public static boolean isValid(Product product) { // Static 1 kere olusur herkes kullanır
												// bir metod STATİC yapınca CLAS ismi ile direkt cagırılır 
		if(product.Price>0 && !product.Name.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
		
	};
	
	public void bisey() { // bu metod için ProdVali NEW yapmamız lazım
		
	}
	

	
}
