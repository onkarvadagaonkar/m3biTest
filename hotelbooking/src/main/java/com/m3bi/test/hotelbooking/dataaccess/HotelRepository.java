package com.m3bi.test.hotelbooking.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.m3bi.test.hotelbooking.models.Hotels;

public interface HotelRepository  extends JpaRepository<Hotels, Integer>{
	

}
