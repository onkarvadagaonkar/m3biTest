package com.m3bi.test.hotelbooking.service;

import java.util.List;

import com.m3bi.test.hotelbooking.models.BaseResponse;
import com.m3bi.test.hotelbooking.models.Customers;

public interface CustomerService {

	public BaseResponse<List<Customers>> getAllCustomers();
	
	public BaseResponse<Customers> addCustomer(Customers customer);
	
}
