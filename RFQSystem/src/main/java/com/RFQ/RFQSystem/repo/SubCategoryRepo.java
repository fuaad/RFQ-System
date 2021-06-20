package com.RFQ.RFQSystem.repo;
/**
 * @author Fuhad Ali
 *
 */
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RFQ.RFQSystem.model.Category;
import com.RFQ.RFQSystem.model.SubCategory;

@Repository
public interface SubCategoryRepo extends JpaRepository<SubCategory, Long> {
	
	Optional<SubCategory>findAllSubCategoryById(Long  id);

	

}
