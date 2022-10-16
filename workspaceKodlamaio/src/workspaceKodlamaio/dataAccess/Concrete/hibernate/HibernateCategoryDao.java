package workspaceKodlamaio.dataAccess.Concrete.hibernate;

import workspaceKodlamaio.dataAccess.Abstract.CategoryDao;
import workspaceKodlamaio.entities.Category;

public class HibernateCategoryDao implements CategoryDao{
	public void add(Category category) {
		System.out.println("Hibernate ile veritabanına kategori eklendi");
	}

}
