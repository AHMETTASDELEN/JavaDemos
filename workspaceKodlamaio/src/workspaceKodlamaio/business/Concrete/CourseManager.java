package workspaceKodlamaio.business.Concrete;

import workspaceKodlamaio.business.Abstract.CourseService;
import workspaceKodlamaio.core.logging.Logger;
import workspaceKodlamaio.dataAccess.Abstract.CourseDao;
import workspaceKodlamaio.entities.Course;

public class CourseManager implements CourseService {
	private CourseDao courseDao;
	private Logger[] loggers;
	

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	

	public void add(Course course) throws Exception {

		if (course.getPrice() <= 0) {
			throw new Exception("Course price can not be lower than zero!");
		} 
		else if (course.getName().trim().isEmpty()) {
			throw new Exception("Course name can not be empty!");
		} 
		else if (course.getDescription().trim().isEmpty()) {
			throw new Exception("Course description can not be empty!");
		}
		
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}

		courseDao.add(course);
	}

}
