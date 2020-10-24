package com.m3bi.test.hotelbooking.service;

import com.m3bi.test.hotelbooking.models.BaseResponse;
import com.m3bi.test.hotelbooking.models.CustomerRoomBooking;

public interface CustomerRoomBookingService {

	public BaseResponse<CustomerRoomBooking> bookRoomForCustomer(CustomerRoomBooking customerBooking);
}
