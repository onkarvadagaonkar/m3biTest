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
import com.m3bi.test.hotelbooking.models.Hotels;
import com.m3bi.test.hotelbooking.service.HotelService;

@RestController
@CrossOrigin
public class HotelController {
	
	@Autowired
	HotelService hotelService;

	@RequestMapping(value = "/hotels",method = RequestMethod.GET)
	public ResponseEntity<BaseResponse<List<Hotels>>> getHotels()
	{
		BaseResponse<List<Hotels>> hotels = hotelService.getHotels();
		return new ResponseEntity<BaseResponse<List<Hotels>>>(hotels, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/hotels",method = RequestMethod.POST)
	public ResponseEntity<BaseResponse<Hotels>>addHotel(@RequestBody Hotels hotel){
		BaseResponse<Hotels> baseHotel = hotelService.addHotel(hotel);
		return new ResponseEntity<BaseResponse<Hotels>>(baseHotel,HttpStatus.OK);
	}
}
