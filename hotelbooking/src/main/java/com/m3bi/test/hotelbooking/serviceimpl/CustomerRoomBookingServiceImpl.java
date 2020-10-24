package com.m3bi.test.hotelbooking.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m3bi.test.hotelbooking.dataaccess.CustomerRoomBookingRepository;
import com.m3bi.test.hotelbooking.models.BaseResponse;
import com.m3bi.test.hotelbooking.models.CustomerRoomBooking;
import com.m3bi.test.hotelbooking.service.CustomerRoomBookingService;



@Service
public class CustomerRoomBookingServiceImpl implements CustomerRoomBookingService{

	@Autowired
	CustomerRoomBookingRepository customerRoomBookingRepository;
	
	@Override
	public BaseResponse<CustomerRoomBooking> bookRoomForCustomer(CustomerRoomBooking customerBooking) {
		// TODO Auto-generated method stub
		try {
			customerBooking= customerRoomBookingRepository.save(customerBooking);
			BaseResponse<CustomerRoomBooking> baseBooking = new BaseResponse<CustomerRoomBooking>();
			Double bonusPoints = Double.valueOf(customerBooking.getCustomer().getBonusPoints());
			Double roomRate = customerBooking.getRoom().getRate();
			customerBooking.setBookingStatus(bonusPoints<roomRate ? "PENDING APPROVAL":"BOOKED");
			baseBooking.setResponseData(customerBooking);
			return baseBooking;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return null;
	}

}
