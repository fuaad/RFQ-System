/**
 * 
 */
package com.RFQ.RFQSystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/app")
public class HomepageController {

	 @GetMapping
	    public ModelAndView frontend(){
	    	  return new ModelAndView("index.html");
	    	}
	 
	 @GetMapping("/RFQ")
	    public ModelAndView RFQPage(){
	    	  return new ModelAndView("quotation.html");
	    	}
	 
	 @GetMapping("/suppliers")
	    public ModelAndView suppliersPage(){
	    	  return new ModelAndView("Suppliers.html");
	    	}
	 
	 @GetMapping("/products")
	    public ModelAndView productsPage(){
	    	  return new ModelAndView("Products.html");
	    	}
	 
	 @GetMapping("/products_Category")
	    public ModelAndView productsCatPage(){
	    	  return new ModelAndView("ProductsByCat.html");
	    	}
	 @GetMapping("/Purchase_Order")
	    public ModelAndView purchaseOrder(){
	    	  return new ModelAndView("PO.html");
	    	}
	 
	 
}
