package dataAccess;

import entities.Teacher;

public class HibernateTeacherDao implements TeacherDao{

	@Override
	public void add(Teacher teacher) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile veri tabanına eklendi");
	}

}
