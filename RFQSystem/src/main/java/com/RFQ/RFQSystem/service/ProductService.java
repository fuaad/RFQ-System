/**
 * 
 */
package com.RFQ.RFQSystem.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RFQ.RFQSystem.exception.UserNotFoundException;
import com.RFQ.RFQSystem.model.Product;
import com.RFQ.RFQSystem.repo.ProductRepo;

/**
 * @author Fuhad Ali
 *
 */
@Service
@Transactional
public class ProductService {

	private final ProductRepo productRepo;

	@Autowired
	public ProductService(ProductRepo productRepo) {
		this.productRepo = productRepo;
	}
	
	public Product addProduct(Product product) {
		return productRepo.save(product);
	}
	
	public List<Product> getAllProducts(){
		return productRepo.findAll();
	}
	
	public Product findProductById(Long id) {
		return productRepo.findProductById(id).orElseThrow(() -> new UserNotFoundException("product by id " + id + " was not found") );
	}
	
	public void delProductById(Long id) {
		 productRepo.deleteProductById(id);
	}
	
	public Product updateProduct(Product product) {
		return productRepo.save(product);
	}
}
