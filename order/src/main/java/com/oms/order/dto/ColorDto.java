package com.oms.order.dto;

public class ColorDto {

	private int colorId;
	
	private String colorName;

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

	public ColorDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ColorDto(int colorId, String colorName) {
		super();
		this.colorId = colorId;
		this.colorName = colorName;
	}
	
	
}
