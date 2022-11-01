package Kodlama.io.Devs.entities.concretes;
//CONCRETE somut nesneleri tutar, dilleri ttucaz yani

public class Languages {
	private int id;
	private String name;
	
	public Languages(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Languages() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
}
