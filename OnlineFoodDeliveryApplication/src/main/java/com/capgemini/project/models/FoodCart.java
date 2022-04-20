package com.capgemini.project.models;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="food_cart")
public class FoodCart {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="customerId")
	private Customer cust;
	@OneToMany(cascade=CascadeType.ALL,orphanRemoval=true,targetEntity=Item.class)
	
	private List<Item> item=new ArrayList<>();
	public FoodCart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FoodCart(Long id, Customer cust, List<Item> item) {
		super();
		this.id = id;
		this.cust = cust;
		this.item = item;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Customer getCust() {
		return cust;
	}
	public void setCust(Customer cust) {
		this.cust = cust;
	}
	public List<Item> getItem() {
		return item;
	}
	public void setItem(List<Item> item) {
		this.item = item;
	}
	
	

}
