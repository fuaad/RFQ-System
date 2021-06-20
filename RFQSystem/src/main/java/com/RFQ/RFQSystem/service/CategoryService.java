package com.RFQ.RFQSystem.service;
/**
 * @author Fuhad Ali
 *
 */
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RFQ.RFQSystem.exception.UserNotFoundException;
import com.RFQ.RFQSystem.model.Category;
import com.RFQ.RFQSystem.repo.CategoryRepo;

@Service
@Transactional
public class CategoryService {
	
	private final CategoryRepo categoryRepo;
	
	
	@Autowired
    public CategoryService(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }
    
	
	 public Category addCategory(Category category) {
	        
	        return categoryRepo.save(category);
	    }
	 
	 
	 public List<Category> findAllCategory() {
	        return categoryRepo.findAll();
	    }

	 public Category findCategoryById(Long id) {
		 return categoryRepo.findCategoryById(id).orElseThrow(() -> new UserNotFoundException("category  " + id + " was not found"));
		 
	 }
	 
	 public void deleteCategoryById(Long id) {
		 categoryRepo.deleteCategoryById(id);
	 }
	 
	 public Category updateCategory(Category category) {
		 return categoryRepo.save(category);
	 }
}
