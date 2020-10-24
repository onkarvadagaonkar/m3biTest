package com.m3bi.test.hotelbooking.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table( name = "tbmstcustomer")
public class Customers {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "CUSTOMERID")
	private Integer customerId;
	
	@Column(name= "CUSTOMERNAME")
	private String customerName;
	
	@Column(name= "BONUSPOINTS")
	private String bonusPoints;
	
	@LazyCollection(LazyCollectionOption.TRUE)
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL,orphanRemoval = true)
	private List<CustomerRoomBooking> bookedRooms;
	
	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getBonusPoints() {
		return bonusPoints;
	}

	public void setBonusPoints(String bonusPoints) {
		this.bonusPoints = bonusPoints;
	}
	
}
