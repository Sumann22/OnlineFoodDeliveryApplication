package com.capgemini.project.models;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import java.util.List;

@Entity
public class Item {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long itemId;
	private String itemName;
	private int quantity;
	private double cost;
	@ManyToMany(targetEntity=Restaurant.class,cascade={CascadeType.PERSIST, CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH})
	
	private List<Restaurant> res;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="catId")
	private Category cat;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="cartId",referencedColumnName="id")
	private FoodCart foodcart;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(Long itemId, String itemName, int quantity, double cost, List<Restaurant> res,Category cat,FoodCart foodcart) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.quantity = quantity;
		this.cost = cost;
		this.res = res;
		this.cat=cat;
		this.foodcart=foodcart;
	}
	
	public FoodCart getFoodcart() {
		return foodcart;
	}
	public void setFoodcart(FoodCart foodcart) {
		this.foodcart = foodcart;
	}
	public Category getCat() {
		return cat;
	}
	public void setCat(Category cat) {
		this.cat = cat;
	}
	public Long getItemId() {
		return itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public List<Restaurant> getRes() {
		return res;
	}
	public void setRes(List<Restaurant> res) {
		this.res = res;
	}
	
	

}