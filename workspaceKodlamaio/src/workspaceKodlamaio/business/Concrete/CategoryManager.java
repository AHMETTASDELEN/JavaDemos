package workspaceKodlamaio.business.Concrete;

import java.util.Objects;

import workspaceKodlamaio.business.Abstract.CategoryService;
import workspaceKodlamaio.core.logging.Logger;
import workspaceKodlamaio.dataAccess.Abstract.CategoryDao;
import workspaceKodlamaio.entities.Category;

public class CategoryManager implements CategoryService {
	private CategoryDao categoryDao;
	private Logger[] loggers;

	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	

	public void add(Category category) throws Exception {
		
		if (category.getName().trim().isEmpty()) {
			throw new Exception("Category name can not be empty!");
		}
//		else if (Objects.equals(category.getName(), category.getName())) {
//        	throw new Exception("You can not enter same category name twice!");
//		}
		
		for (Logger logger : loggers) {
			logger.log(category.getName());
		}

		categoryDao.add(category);
	}

}
