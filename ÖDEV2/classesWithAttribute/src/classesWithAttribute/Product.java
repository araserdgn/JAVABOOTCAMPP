package classesWithAttribute;

public class Product {
		
	public Product(int id, String name, String description, double price, int stockamount, String _renk, String _kod) {
		
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockamount = stockamount;
		this._renk = _renk;
		this._kod = _kod;
	}
	
	public Product() {
		
	}



	// attribute & fielt
	private int id; // urunu tanımlayan essiz deger
	private String name;
	private String description;
	private double price;
	private int stockamount;
	private String _renk;
	private String _kod;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getStockamount() {
		return stockamount;
	}
	public void setStockamount(int stockamount) {
		this.stockamount = stockamount;
	}
	public String get_renk() {
		return _renk;
	}
	public void set_renk(String _renk) {
		this._renk = _renk;
	}
	public String get_kod() {
		return this.name.substring(0,1) + id;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id; // this bulundugu alandaki id gösterir
	}
	
}
