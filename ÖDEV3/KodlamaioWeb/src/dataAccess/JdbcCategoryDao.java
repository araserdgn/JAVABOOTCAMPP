package dataAccess;

import entities.Category;

public class JdbcCategoryDao implements CategoryDao  {

	@Override
	public void add(Category category) {
		// TODO Auto-generated method stub
		System.out.println("Jdbc ile veritabanına eklendi");
	}

}
