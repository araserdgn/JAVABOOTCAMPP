package entities;

public class Category {

	private int CategoryId;
	private String CategoryName;
	

	public Category(int categoryId, String categoryName) {
		
		CategoryId = categoryId;
		CategoryName = categoryName;
	}

	public int getCategoryId() {
		return CategoryId;
	}

	public void setCategoryId(int categoryId) {
		CategoryId = categoryId;
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

	public String getCourseName() {
		// TODO Auto-generated method stub
		return null;
	}
}
