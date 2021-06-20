/**
 * 
 */
package com.RFQ.RFQSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Fuhad Ali
 *
 */
@Entity
public class Supplier {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
	private Long id;
	
	private String SupplierName;
	
	private String Place;

	public Supplier() {
		// TODO Auto-generated constructor stub
	}

	public Supplier(Long id, String supplierName, String place) {
		super();
		this.id = id;
		SupplierName = supplierName;
		Place = place;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSupplierName() {
		return SupplierName;
	}

	public void setSupplierName(String supplierName) {
		SupplierName = supplierName;
	}

	public String getPlace() {
		return Place;
	}

	public void setPlace(String place) {
		Place = place;
	}

	@Override
	public String toString() {
		return "Supplier {id=" + id + ", SupplierName=" + SupplierName + ", Place=" + Place + "}";
	}

	
	
}
