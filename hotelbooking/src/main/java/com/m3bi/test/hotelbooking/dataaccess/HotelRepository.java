package com.m3bi.test.hotelbooking.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.m3bi.test.hotelbooking.models.Hotels;

@Repository
public interface HotelRepository  extends JpaRepository<Hotels, Integer>{
	

}
