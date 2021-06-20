package com.RFQ.RFQSystem.model;
/**
 * @author Fuhad Ali
 *
 */
import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Category implements Serializable{

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String categoryName;
    
    @JsonIgnore
    @OneToMany(mappedBy = "category")
    private List<SubCategory> subCategories;
    
    @JsonIgnore
    @OneToMany(mappedBy = "category")
    private List<Product> products;

    public Category() {}
    
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<SubCategory> getSubCategories() {
		return subCategories;
	}

	public void setSubCategories(List<SubCategory> subCategories) {
		this.subCategories = subCategories;
	}


	public List<Product> getProducts() {
		return products;
	}


	public void setProducts(List<Product> products) {
		this.products = products;
	}


	public Category(Long id, String categoryName, List<SubCategory> subCategories, List<Product> products) {
		super();
		this.id = id;
		this.categoryName = categoryName;
		this.subCategories = subCategories;
		this.products = products;
	}


	@Override
	public String toString() {
		return "Category {id=" + id + ", categoryName=" + categoryName + ", subCategories=" + subCategories
				+ ", products=" + products + "}";
	}

	
    
}
