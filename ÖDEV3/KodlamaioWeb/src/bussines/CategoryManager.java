package bussines;

import java.util.List;

import coreLogging.Logger;
import dataAccess.CategoryDao;
import entities.Category;

public class CategoryManager {
	
		private CategoryDao categoryDao;
		private Logger[] loggers;
		
		
		public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
			
			this.categoryDao = categoryDao;
			this.loggers = loggers;
			
		}
		
		public void Add(Category category, Category[] categor) throws Exception {
			
			for(Category categ: categor) {
				if(categ.getCategoryName()==category.getCategoryName()) {
					throw new Exception ("Kategori isimleri aynı olamaz");
				}
			}
			
			categoryDao.add(category);

			for(Logger log: loggers) {
				log.Log(category.getCategoryName());
			}
			
		}
		
		
}
