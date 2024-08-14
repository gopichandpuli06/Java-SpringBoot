package com.spring_rest_api.spring_rest_api.binding;

import lombok.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//@Data
@Entity
@Table(name = "COURSE_DTLS")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cid;
    private String name;
    private Double price;

    // Lombok-generated constructor
    public Course() {
    }

    // Lombok-generated constructor with all fields
    public Course(String name, Double price) {
    	super();
        this.name = name;
        this.price = price;
    }

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
    
    
}
