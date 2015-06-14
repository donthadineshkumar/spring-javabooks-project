package com.bshop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Book {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;	
	
	@Column(name="TITLE",unique=true)
	@Size(max =25, min=3)
	@NotNull
	private String name;
	
	@Column(name ="AUTHOR")
	@Size(max =25, min=3)
	@NotNull
	private String authorName;
	
	@Column(name ="PRICE")
	@NotNull
	private Float price;
	
	@Column(name ="DESCRIPTION",length=1000)
	private String description;
	
	@Column(name ="ISBN")
	private String isbn;

	public Book() {
	}

	public Book(String name, String authorName, Float price) {
		this.name = name;
		this.authorName = authorName;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
}
