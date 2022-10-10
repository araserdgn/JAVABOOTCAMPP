package dataAccess;

import entities.Course;

public class HibernateCourseDao implements CourseDao  {

	@Override
	public void add(Course course) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile veritabanına eklendi");
	}

}
