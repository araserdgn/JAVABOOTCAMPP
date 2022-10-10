package bussines;

import java.util.List;

import coreLogging.Logger;
import dataAccess.CourseDao;
import entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		
		this.courseDao = courseDao;
		this.loggers = loggers;
		
	}
	
	public void add(Course course, Course[] courses) throws Exception{
		for (Course course1 : courses) {
			if(course1.getCourseName() == course.getCourseName()) {
				throw new Exception("Ayni isimde farkli bir kurs bulunamaz!");
			}
			if(course.getCoursePrice() < 0) {
				throw new Exception("Kurs fiyati 0'dan kucuk olamaz!");
			}
			courseDao.add(course);
			for (Logger logger : loggers) {
				logger.Log(course.getCourseName());
			}
		}
	}
	
	
}
