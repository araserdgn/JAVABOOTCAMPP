package dataAccess;

import entities.Course;

public class JdbcCourseDao implements CourseDao  {

	@Override
	public void add(Course course) {
		// TODO Auto-generated method stub
		System.out.println("Jdbc ile veritabanına eklendi");
	}

}
