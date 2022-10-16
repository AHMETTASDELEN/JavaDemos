package workspaceKodlamaio.dataAccess.Concrete.jdbc;

import workspaceKodlamaio.dataAccess.Abstract.InstructorDao;
import workspaceKodlamaio.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{
	public void add(Instructor instructor) {
		System.out.println("Jdbc ile veritabanına eğitmen eklendi");
	}
}
