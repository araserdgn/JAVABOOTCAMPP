package bussines;

import coreLogging.Logger;
import dataAccess.TeacherDao;
import dataAccess.TeacherDao;
import entities.Teacher;

public class TeacherManager {
	private TeacherDao teacherDao;
	private Logger[] loggers;
	
	public TeacherManager (TeacherDao teacherDao,Logger[] logger) {
		this.teacherDao= teacherDao;
		this.loggers=logger;
	}
	
	public void Add(Teacher teacher) throws Exception {
		teacherDao.add(teacher);
		
		for(Logger logger: loggers) {
			logger.Log(teacher.getFirstName());
		}
	}
}
