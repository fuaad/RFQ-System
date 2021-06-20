package com.RFQ.RFQSystem.controller;
/**
 * @author Fuhad Ali
 *
 */
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RFQ.RFQSystem.model.Category;
import com.RFQ.RFQSystem.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	private final CategoryService categoryService;
	
	 public CategoryController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	@GetMapping("/all")
	public ResponseEntity<List<Category>> getAllCategory () {
        List<Category> categories = categoryService.findAllCategory();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }
	
	@PostMapping("/add")
    public ResponseEntity<Category> addCategory(@RequestBody Category category) {
		Category newCategory = categoryService.addCategory(category);
        return new ResponseEntity<>(newCategory, HttpStatus.CREATED);
    }
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Category> getCategoryById(@PathVariable ("id")Long id){
		Category category = categoryService.findCategoryById(id);
		return new ResponseEntity<>(category,HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Category> updateCategory(@RequestBody Category category){
		Category updateCategory = categoryService.updateCategory(category);
		return new ResponseEntity<>(updateCategory , HttpStatus.OK);
	}
	
	@DeleteMapping("delete/{id}")
	public ResponseEntity<Category> deleteCategory(@PathVariable("id") Long id) {
		categoryService.deleteCategoryById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
