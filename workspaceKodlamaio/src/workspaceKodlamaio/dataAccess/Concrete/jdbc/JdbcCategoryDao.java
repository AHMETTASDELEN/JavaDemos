package workspaceKodlamaio.dataAccess.Concrete.jdbc;

import workspaceKodlamaio.dataAccess.Abstract.CategoryDao;
import workspaceKodlamaio.entities.Category;

public class JdbcCategoryDao implements CategoryDao{
	public void add(Category category) {
		System.out.println("Jdbc ile veritabanına kategori eklendi");
	}
}
