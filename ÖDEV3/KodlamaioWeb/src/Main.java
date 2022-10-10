import java.util.List;

import bussines.CategoryManager;
import bussines.CourseManager;
import bussines.TeacherManager;
import coreLogging.DatabaseLogger;
import coreLogging.FileLogger;
import coreLogging.Logger;
import coreLogging.MailLogger;
import dataAccess.HibernateCategoryDao;
import dataAccess.HibernateCourseDao;
import dataAccess.JdbcCourseDao;
import dataAccess.JdbcTeacherDao;
import entities.Category;
import entities.Course;
import entities.Teacher;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Teacher teacher = new Teacher("Engin","Demiroğ","Java");
		
		Logger[] loggers = {new DatabaseLogger(),new FileLogger(),new MailLogger()};
		
		TeacherManager teacherManager = new TeacherManager(new JdbcTeacherDao(), loggers);
		teacherManager.Add(teacher);
		
		///////////////////////////////////////////////////////////////////
		
		Course[] courses = new Course[] {new Course(3,"Geliştirme kampı (C#)",5)};
		
		Course course1 = new Course(1,"c#",100);
		Course course3 = new Course(3,"javascript",6);
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		CourseManager courseManager1 = new CourseManager(new JdbcCourseDao(), loggers);
		courseManager.add(course1, courses);
		courseManager1.add(course3, courses);
		
		////////////////////////////////////////////////////////
		
		Category[] categories = new Category[] {new Category(3, "Otomasyon")};
		
		Category category1 = new Category(1,"Backend");
		Category category2 = new Category(2,"Otomasyon");
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.Add(category2, categories);
		
	}

}
