package com.oms.order.dto;

public class AccessoryDto {
	
	private int orderAccessoryId;
	
	private String accessoryName;

	public int getOrderAccessoryId() {
		return orderAccessoryId;
	}

	public void setOrderAccessoryId(int orderAccessoryId) {
		this.orderAccessoryId = orderAccessoryId;
	}

	public String getAccessoryName() {
		return accessoryName;
	}

	public void setAccessoryName(String accessoryName) {
		this.accessoryName = accessoryName;
	}

	public AccessoryDto(int orderAccessoryId, String accessoryName) {
		super();
		this.orderAccessoryId = orderAccessoryId;
		this.accessoryName = accessoryName;
	}

	public AccessoryDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
