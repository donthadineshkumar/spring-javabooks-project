package com.bshop.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class OrderLine {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="ORDER_LINE_ID")
	private Long id;
	
	@Column(name="ITEM_NAME")
	private String itemName;
	
	@Column(name="ITEM_PRICE")
	private Float itemPrice;
	
	@Column(name="SHIPPING_ADDR")	
	@Embedded
	private Address delivery_addr;
	
	@ManyToOne
	private CustomerOrder order;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Float getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Float itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Address getDelivery_addr() {
		return delivery_addr;
	}

	public void setDelivery_addr(Address delivery_addr) {
		this.delivery_addr = delivery_addr;
	}

}
