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
import com.RFQ.RFQSystem.model.SubCategory;
import com.RFQ.RFQSystem.repo.SubCategoryRepo;

@Service
@Transactional
public class SubCategoryService {

	
	private final SubCategoryRepo subCategoryRepo;

	@Autowired
	public SubCategoryService(SubCategoryRepo subCategoryRepo) {
		this.subCategoryRepo = subCategoryRepo;
	}
	
	public SubCategory addsubCategory(SubCategory subCategory) {
		return subCategoryRepo.save(subCategory);
	}
	
	public List<SubCategory> findAllSubCategories (){
		return subCategoryRepo.findAll();
	}
	
	public SubCategory findSubCategoryById(Long id) {
		return subCategoryRepo.findAllSubCategoryById(id).orElseThrow(() -> new UserNotFoundException("SubCategory  " + id + " was not found"));
	}
}
