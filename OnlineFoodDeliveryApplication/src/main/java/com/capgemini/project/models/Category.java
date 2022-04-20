package com.capgemini.project.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long catId;
    private String catName;
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(Long catId, String catName) {
		super();
		this.catId = catId;
		this.catName = catName;
	}
	public Long getCatId() {
		return catId;
	}
	public void setCatId(Long catId) {
		this.catId = catId;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
}
