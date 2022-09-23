package classesWithAttribute;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product product = new Product(1, "Laptop", "Asus Laptop", 50700, 10, "Siyah", "5785");

		

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.get_kod());

	}

}
