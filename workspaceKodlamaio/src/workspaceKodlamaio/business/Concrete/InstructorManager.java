package workspaceKodlamaio.business.Concrete;

import workspaceKodlamaio.core.logging.Logger;
import workspaceKodlamaio.dataAccess.Abstract.InstructorDao;
import workspaceKodlamaio.entities.Instructor;

public class InstructorManager implements InstructorDao{
	private InstructorDao instructorDao;
	private Logger[] loggers;
	
	
	public InstructorManager(InstructorDao instructorDao , Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}


	public void add(Instructor instructor) throws Exception {
		
		if (instructor.getFirstName().trim().isEmpty()) {
			throw new Exception("Instructor first name can not be empty!");
		}
		else if (instructor.getLastName().trim().isEmpty()) {
			throw new Exception("Instructor last name can not be empty!");
		}
		
		for (Logger logger : loggers) {
			logger.log(instructor.getFirstName());
		}
		
		instructorDao.add(instructor);
		
	}

}
