/**
 * 
 */
package com.RFQ.RFQSystem.controller;

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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.RFQ.RFQSystem.model.Product;
import com.RFQ.RFQSystem.service.ProductService;

/**
 * @author Fuhad Ali
 *
 */
@RestController
@RequestMapping("/product")
public class ProductController {

	
	public final ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Product>> getAllProduct(){
		List<Product> products = productService.getAllProducts();
		return new ResponseEntity<>(products , HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Product> addProduct(@RequestBody Product product){
		Product newProduct = productService.addProduct(product);
		return new ResponseEntity<>(newProduct , HttpStatus.CREATED);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Product> findProductById(@PathVariable("id") Long id){
		Product product = productService.findProductById(id);
		return new ResponseEntity<>(product , HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Product> updateProduct(@RequestBody Product product){
		Product updateProduct = productService.updateProduct(product);
		return new ResponseEntity<>(updateProduct , HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Product> deleteProduct(@PathVariable("id") Long id){
		 productService.delProductById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
