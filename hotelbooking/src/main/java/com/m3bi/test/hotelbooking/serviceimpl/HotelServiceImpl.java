package com.m3bi.test.hotelbooking.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m3bi.test.hotelbooking.dataaccess.HotelRepository;
import com.m3bi.test.hotelbooking.models.BaseResponse;
import com.m3bi.test.hotelbooking.models.Hotels;
import com.m3bi.test.hotelbooking.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService{
	
	@Autowired
	HotelRepository hotelRepository;

	@Transactional
	@Override
	public BaseResponse<List<Hotels>> getHotels() {
		// TODO Auto-generated method stub
		List<Hotels> hotels = hotelRepository.findAll();  
		BaseResponse<List<Hotels>>baseResponse =new BaseResponse<List<Hotels>>();
		
		if(hotels.isEmpty())
		{
			baseResponse.setEmptyResponse();
		}
		else
		{
			baseResponse.setResponseData(hotels);
		}
		return baseResponse;
	}

	@Transactional
	@Override
	public BaseResponse<Hotels> addHotel(Hotels hotel) {
		// TODO Auto-generated method stub
		BaseResponse<Hotels>baseResponse =new BaseResponse<Hotels>();
		hotel= hotelRepository.save(hotel);
		baseResponse.setSuccessResponse(hotel);
		return baseResponse;
	}

}
