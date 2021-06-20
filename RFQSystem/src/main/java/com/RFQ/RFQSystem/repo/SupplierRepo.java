/**
 * 
 */
package com.RFQ.RFQSystem.repo;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RFQ.RFQSystem.model.Supplier;

/**
 * @author Fuhad Ali
 *
 */
public interface SupplierRepo extends JpaRepository<Supplier,Long>{
	Optional<Supplier> findSuppliersById(Long id);
	void deleteSupplierById(Long id);
}
