package com.oms.color.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER_MANAGEMENT_COLOR")
public class Color {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "COLOR_ID")
	private int colorId;
	
	@Column(name = "COLOR_NAME")
	private String colorName;
	
	@Column(name ="MODEL_ID")
	private int modelId;
	
	
	@Column(name ="PRICE")
	private long price;
	
	@Column(name ="AVAILABLE")
	private int available;
	
	@Column(name ="isAvailable")
	protected char isAvailable;

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

	public char getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(char isAvailable) {
		this.isAvailable = isAvailable;
	}

	public Color(int colorId, String colorName, int modelId, long price, int available, char isAvailable) {
		super();
		this.colorId = colorId;
		this.colorName = colorName;
		this.modelId = modelId;
		this.price = price;
		this.available = available;
		this.isAvailable = isAvailable;
	}

	public Color() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
