package staticDemo;

public class Main {

	public static void main(String[] args) { // newleyemeyiz bu sınıfı Main.main sek. cagırabilirz
		// TODO Auto-generated method stub
		
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.Name="";
		product.Price=10;
		
		manager.add(product);
		
		// static sınıf metodları böyle cagırlır
		DatabaseHelper.Crud.Create();

	}

}
