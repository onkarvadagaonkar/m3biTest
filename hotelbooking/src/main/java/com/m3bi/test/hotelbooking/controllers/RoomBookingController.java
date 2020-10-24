package com.m3bi.test.hotelbooking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.m3bi.test.hotelbooking.models.BaseResponse;
import com.m3bi.test.hotelbooking.models.CustomerRoomBooking;
import com.m3bi.test.hotelbooking.service.CustomerRoomBookingService;

@RestController
@CrossOrigin
public class RoomBookingController {
	
	@Autowired
	 CustomerRoomBookingService customerRoomBookingService; 
	
	@RequestMapping(value="/customerroombooking",method=RequestMethod.POST)
	public ResponseEntity<BaseResponse<CustomerRoomBooking>> bookRoom(@RequestBody CustomerRoomBooking customerRoomBooking)
	{
		return new ResponseEntity<BaseResponse<CustomerRoomBooking>>(customerRoomBookingService.bookRoomForCustomer(customerRoomBooking), HttpStatus.OK);
	}
	
}
