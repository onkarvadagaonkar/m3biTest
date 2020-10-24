package com.m3bi.test.hotelbooking.models;

import java.io.Serializable;
import java.util.List;



public class BaseResponse<T> implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer responseCode;
	
	private String responseMessage;
	
	private T responseData;
	
	private List<T> responseDataList;

	public BaseResponse()
	{
		super();
	}
	
	public void setSuccessResponse(T data)
	{
		this.setResponseCode(ResponseCode.Success.value());
		this.setResponseMessage(CodeMessage.Success.value());
		this.setResponseData(data);
	}
	
	public void setSuccessResponseList(List<T> data)
	{
		this.setResponseCode(ResponseCode.Success.value());
		this.setResponseMessage(CodeMessage.Success.value());
		this.setResponseDataList(data);
	}
	
	public void setEmptyResponse()
	{
		this.setResponseCode(ResponseCode.Success.value());
		this.setResponseMessage(CodeMessage.RecordNotFound.value());
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public Integer getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}

	public T getResponseData() {
		return responseData;
	}

	public void setResponseData(T responseData) {
		this.responseData = responseData;
	}
	public List<T> getResponseDataList() {
		return responseDataList;
	}

	public void setResponseDataList(List<T> responseDataList) {
		this.responseDataList = responseDataList;
	}
}
