package com.RFQ.RFQSystem.controller;
/**
 * @author Fuhad Ali
 *
 */
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RFQ.RFQSystem.model.Category;
import com.RFQ.RFQSystem.model.SubCategory;
import com.RFQ.RFQSystem.service.CategoryService;
import com.RFQ.RFQSystem.service.SubCategoryService;

@RestController
@RequestMapping("/sub_category")
public class SubCategoryController {
	
	private final SubCategoryService subCategoryService;
	
	private final CategoryService categoryService;

	public SubCategoryController(SubCategoryService subCategoryService, CategoryService categoryService) {
		this.subCategoryService = subCategoryService;
		this.categoryService = categoryService;
		
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<SubCategory>> getAllSubCategories(){
		List<SubCategory> subCategories = subCategoryService.findAllSubCategories();
		return new ResponseEntity<>(subCategories , HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<SubCategory> addSubCategory(@RequestBody SubCategory subCategory) {
		SubCategory newSubCategory = subCategoryService.addsubCategory(subCategory);
		return  new ResponseEntity<>(subCategory , HttpStatus.CREATED);
	}
	
	 @PutMapping("/{categoryId}/subCategory/{subCategoryId}")
	 public ResponseEntity<SubCategory> categorySubCategory( @PathVariable Long categoryId, @PathVariable Long subCategoryId) {
		 
		 	Category category = categoryService.findCategoryById(categoryId);
		 	SubCategory subCategory = subCategoryService.findSubCategoryById(subCategoryId);
		 	subCategory.setCategory(category);
		 	subCategoryService.addsubCategory(subCategory);
		 	return  new ResponseEntity<>(subCategory , HttpStatus.OK);
	    }
	 
}