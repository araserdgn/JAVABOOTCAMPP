package dataAccess;

import entities.Teacher;

public class JdbcTeacherDao implements TeacherDao {

	@Override
	public void add(Teacher teacher) {
		// TODO Auto-generated method stub
		System.out.println("Jdbc ile veri tabanına eklendi");
	}

}
