package com.RFQ.RFQSystem.repo;
/**
 * @author Fuhad Ali
 *
 */
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RFQ.RFQSystem.model.Category;

public interface CategoryRepo extends JpaRepository<Category, Long> {
	
	 Optional<Category> findCategoryById(Long id);
	 void deleteCategoryById(Long id);

}
