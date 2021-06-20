/**
 * 
 */
package com.RFQ.RFQSystem.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.RFQ.RFQSystem.model.Product;

/**
 * @author Fuhad Ali
 *
 */
public interface ProductRepo extends JpaRepository<Product, Long>{

	 Optional<Product> findProductById(Long id);
	 void deleteProductById (Long id);
	 
}
