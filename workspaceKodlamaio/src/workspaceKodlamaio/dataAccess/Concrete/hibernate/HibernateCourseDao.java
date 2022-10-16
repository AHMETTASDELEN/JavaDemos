package workspaceKodlamaio.dataAccess.Concrete.hibernate;

import workspaceKodlamaio.dataAccess.Abstract.CourseDao;
import workspaceKodlamaio.entities.Course;

public class HibernateCourseDao implements CourseDao{
	public void add(Course course) {
		System.out.println("Hibernate ile veritabanına kurs eklendi");
	}

}
