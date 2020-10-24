package com.m3bi.test.hotelbooking.service;

import java.util.List;

import com.m3bi.test.hotelbooking.models.BaseResponse;
import com.m3bi.test.hotelbooking.models.Hotels;

public interface HotelService {

	public BaseResponse<List<Hotels>> getHotels();
	
	public BaseResponse<Hotels> addHotel(Hotels hotel);

}
