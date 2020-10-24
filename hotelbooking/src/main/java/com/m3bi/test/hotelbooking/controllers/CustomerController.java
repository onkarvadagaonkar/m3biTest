package com.m3bi.test.hotelbooking.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.m3bi.test.hotelbooking.models.BaseResponse;
import com.m3bi.test.hotelbooking.models.Customers;
import com.m3bi.test.hotelbooking.service.CustomerService;

@RestController
@CrossOrigin
public class CustomerController {
	
	@Autowired
	CustomerService customerService; 
	
	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public ResponseEntity<BaseResponse<List<Customers>>> getAllCustomers(){
		BaseResponse<List<Customers>> resData = customerService.getAllCustomers();
		return new ResponseEntity<BaseResponse<List<Customers>>>(resData,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/customers", method = RequestMethod.POST)
	public ResponseEntity<BaseResponse<Customers>> addCustomer(@RequestBody Customers customer)
	{
		return new ResponseEntity<BaseResponse<Customers>>(customerService.addCustomer(customer),HttpStatus.OK);
	}
	
	
}
