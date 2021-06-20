/**
 * 
 */
package com.RFQ.RFQSystem.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RFQ.RFQSystem.exception.UserNotFoundException;
import com.RFQ.RFQSystem.model.Supplier;
import com.RFQ.RFQSystem.repo.SupplierRepo;

/**
 * @author Fuhad Ali
 *
 */
@Service
@Transactional
public class SupplierService {

	private final SupplierRepo supplierRepo ;

	@Autowired
	public SupplierService(SupplierRepo supplierRepo) {
		super();
		this.supplierRepo = supplierRepo;
	}
	
	public Supplier addSupplier(Supplier supplier) {
		return supplierRepo.save(supplier);
	}
	
	public List<Supplier> getAllSuppliers(){
		return supplierRepo.findAll();
	}
	public Supplier getSuppliersById(Long id){
		return supplierRepo.findSuppliersById(id).orElseThrow(() -> new UserNotFoundException("Supplier by id " + id + " was not found") );
	}
	
	public Supplier updateSupplier(Supplier supplier) {
		return supplierRepo.save(supplier);
	}
	
	public void deleteSupplier(Long id) {
		 supplierRepo.deleteSupplierById(id);
	}
	
}
