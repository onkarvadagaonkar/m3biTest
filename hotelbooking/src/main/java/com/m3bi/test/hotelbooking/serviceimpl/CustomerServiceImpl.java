package com.m3bi.test.hotelbooking.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m3bi.test.hotelbooking.dataaccess.CustomerRepository;
import com.m3bi.test.hotelbooking.models.BaseResponse;
import com.m3bi.test.hotelbooking.models.Customers;
import com.m3bi.test.hotelbooking.service.CustomerService;

 

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public BaseResponse<List<Customers>> getAllCustomers() {
		// TODO Auto-generated method stub
		BaseResponse<List<Customers>> baseCustomers = new BaseResponse<List<Customers>>();
		
		List<Customers> customers= customerRepository.findAll();
		if(customers.isEmpty())
		{
			baseCustomers.setEmptyResponse();
		}
		else
		{
			baseCustomers.setResponseData(customers);
		}
		return baseCustomers;
	}

	@Override
	public BaseResponse<Customers> addCustomer(Customers customer) {
		// TODO Auto-generated method stub
		try {
			BaseResponse<Customers> baseCustomer =new BaseResponse<Customers>();
			customer = customerRepository.save(customer);
			baseCustomer.setSuccessResponse(customer);
			return baseCustomer;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

}
