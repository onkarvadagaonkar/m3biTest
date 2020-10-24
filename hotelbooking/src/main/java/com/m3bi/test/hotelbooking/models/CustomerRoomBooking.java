package com.m3bi.test.hotelbooking.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table( name = "tbtrncustomerroombooking")
public class CustomerRoomBooking {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "CUSTOMERROOMBOOKINGID")
	private Integer customerRoomBookingId;
	
	@Column(name= "BOOKINGSTATUS")
	private String bookingStatus;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name= "ROOMID")
	private Rooms room;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name= "CUSTOMERID")
	private Customers customer;

	public Integer getCustomerRoomBookingId() {
		return customerRoomBookingId;
	}

	public void setCustomerRoomBookingId(Integer customerRoomBookingId) {
		this.customerRoomBookingId = customerRoomBookingId;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public Rooms getRoom() {
		return room;
	}

	public void setRoom(Rooms room) {
		this.room = room;
	}

	public Customers getCustomer() {
		return customer;
	}

	public void setCustomer(Customers customer) {
		this.customer = customer;
	}
	
	
}
