package workspaceKodlamaio.dataAccess.Concrete.hibernate;

import workspaceKodlamaio.dataAccess.Abstract.InstructorDao;
import workspaceKodlamaio.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile veritabanına eğitmen eklendi");
	}

}
