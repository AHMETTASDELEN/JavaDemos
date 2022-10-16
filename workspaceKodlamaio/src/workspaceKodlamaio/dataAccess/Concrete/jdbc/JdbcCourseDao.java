package workspaceKodlamaio.dataAccess.Concrete.jdbc;

import workspaceKodlamaio.dataAccess.Abstract.CourseDao;
import workspaceKodlamaio.entities.Course;

public class JdbcCourseDao implements CourseDao{
	public void add(Course course) {
		System.out.println("Jdbc ile veritabanına kurs eklendi");
	}
}
