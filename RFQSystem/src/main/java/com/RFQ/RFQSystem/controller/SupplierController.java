/**
 * 
 */
package com.RFQ.RFQSystem.controller;

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

import com.RFQ.RFQSystem.model.Supplier;
import com.RFQ.RFQSystem.service.SupplierService;

/**
 * @author Fuhad Ali
 *
 */
@RestController
@RequestMapping("/supplier")
public class SupplierController {

	private final SupplierService supplierService;

	public SupplierController(SupplierService supplierService) {
		this.supplierService = supplierService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<Supplier> addSupplier(@RequestBody Supplier supplier){
		Supplier newSupplier = supplierService.addSupplier(supplier);
		return new ResponseEntity<Supplier>(newSupplier,HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Supplier>> getAllSupplier(){
		List<Supplier> suppliers = supplierService.getAllSuppliers();
		return new ResponseEntity<>(suppliers , HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Supplier> getSupplerById(@PathVariable("id") Long id){
		Supplier supplier = supplierService.getSuppliersById(id);
		return new ResponseEntity<>(supplier,HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Supplier> updateSupplier(@RequestBody Supplier supplier){
		Supplier newSupplier = supplierService.updateSupplier(supplier);
		return new ResponseEntity<Supplier>(newSupplier,HttpStatus.OK);
	}
	
	public ResponseEntity<Supplier> deleteSupplier(@PathVariable("id")Long id){
		supplierService.deleteSupplier(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
