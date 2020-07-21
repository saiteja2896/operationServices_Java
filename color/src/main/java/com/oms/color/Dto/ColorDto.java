package com.oms.color.Dto;

public class ColorDto {
	
	private int colorId;
	
	private String colorName;
	
	private int modelId;
	
	private long price;
	
	private int available;

	public int getColorId() {
		return colorId;
	}

	public void setColorId(int colorId) {
		this.colorId = colorId;
	}

	public String getColorName() {
		return colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
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

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

	

	public ColorDto(int colorId, String colorName, int modelId, long price, int available) {
		super();
		this.colorId = colorId;
		this.colorName = colorName;
		this.modelId = modelId;
		this.price = price;
		this.available = available;
	}
	

	public ColorDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
