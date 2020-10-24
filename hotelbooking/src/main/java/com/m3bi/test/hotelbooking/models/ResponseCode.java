package com.m3bi.test.hotelbooking.models;

public enum ResponseCode {
	Success(200),
	ProcessFail(201),
	RequireParam(202),
	Duplicate(203);
	
	ResponseCode(int val)
	{
		this.val=val;
	}
	
	private final int val;
	
	public int value()
	{
		return val;
	}
}
