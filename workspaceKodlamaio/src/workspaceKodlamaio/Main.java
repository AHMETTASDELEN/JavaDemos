package workspaceKodlamaio;

import workspaceKodlamaio.business.Concrete.CategoryManager;
import workspaceKodlamaio.business.Concrete.CourseManager;
import workspaceKodlamaio.core.logging.DatabaseLogger;
import workspaceKodlamaio.core.logging.FileLogger;
import workspaceKodlamaio.core.logging.Logger;
import workspaceKodlamaio.core.logging.MailLogger;
import workspaceKodlamaio.dataAccess.Concrete.hibernate.HibernateCategoryDao;
import workspaceKodlamaio.dataAccess.Concrete.hibernate.HibernateCourseDao;
import workspaceKodlamaio.dataAccess.Concrete.jdbc.JdbcCategoryDao;
import workspaceKodlamaio.entities.Category;
import workspaceKodlamaio.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Course course1 = new Course(1, "Yazılım geliştirici yetiştirme kampı", "JAVA+REACT", 1000);
		
		Logger[] loggers= {new FileLogger(),new MailLogger(),new DatabaseLogger()};
		
		CourseManager courseManager=new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course1);
		
		
		
		
//		Category category1=new Category(1,"Programlama");
//		
//		Logger[] loggers= {new FileLogger(),new MailLogger(),new DatabaseLogger()};
//		
//		CategoryManager categoryManager=new CategoryManager(new JdbcCategoryDao(), loggers);
//		categoryManager.add(category1);
	}

}
