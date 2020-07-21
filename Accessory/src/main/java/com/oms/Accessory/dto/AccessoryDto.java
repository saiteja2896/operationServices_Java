package com.oms.Accessory.dto;

public class AccessoryDto {
	
	private int accessoryId;
	
	private String accessoryName;
	
	private int modelId;
	
	private long price;

	public int getAccessoryId() {
		return accessoryId;
	}

	public void setAccessoryId(int accessoryId) {
		this.accessoryId = accessoryId;
	}

	public String getAccessoryName() {
		return accessoryName;
	}

	public void setAccessoryName(String accessoryName) {
		this.accessoryName = accessoryName;
	}

	public int getModelId() {
		return modelId;
	}

	public void setModelId(int modelId) {
		this.modelId = modelId;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public AccessoryDto(int accessoryId, String accessoryName, int modelId, long price) {
		super();
		this.accessoryId = accessoryId;
		this.accessoryName = accessoryName;
		this.modelId = modelId;
		this.price = price;
	}

	public AccessoryDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	

}
