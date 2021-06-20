/**
 * 
 */
package com.RFQ.RFQSystem.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.sun.el.parser.AstFalse;

/**
 * @author Fuhad Ali
 *
 */
@Entity
public class Product implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false , updatable = false)
	private Long id;
	private String productName;
	private String productCode;
	private float unitPrice;
	private String UOM;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "category_id" , referencedColumnName = "id")
	private Category category;

	

	public Product(Long id, String productName, String productCode, float unitPrice, String uOM, Category category) {
		super();
		this.id = id;
		this.productName = productName;
		this.productCode = productCode;
		this.unitPrice = unitPrice;
		this.UOM = uOM;
		this.category = category;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getUOM() {
		return UOM;
	}

	public void setUOM(String uOM) {
		UOM = uOM;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product {id=" + id + ", productName=" + productName + ", productCode=" + productCode + ", unitPrice="
				+ unitPrice + ", UOM=" + UOM + ", category=" + category + "}";
	}


	
	
	
	
	
	
}
