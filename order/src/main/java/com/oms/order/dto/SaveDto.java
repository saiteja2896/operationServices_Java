package com.oms.order.dto;



import java.util.List;

import com.oms.order.entity.AccessoryMapper;
import com.oms.order.entity.ColorMapper;



public class SaveDto {
	
	private int orderId;
	
	

	private int series;
	
	private int model;
	
	private List<AccessoryMapper> accessory;
	
	private List<ColorMapper> color;
	
	private long price;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public int getSeries() {
		return series;
	}

	public void setSeries(int series) {
		this.series = series;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	

	public List<ColorMapper> getColor() {
		return color;
	}

	public void setColor(List<ColorMapper> color) {
		this.color = color;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
	
	

	public List<AccessoryMapper> getAccessory() {
		return accessory;
	}

	public void setAccessory(List<AccessoryMapper> accessory) {
		this.accessory = accessory;
	}

	public SaveDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SaveDto(int orderId, int series, int model, List<AccessoryMapper> accessory, List<ColorMapper> color,
			long price) {
		super();
		this.orderId = orderId;
		this.series = series;
		this.model = model;
		this.accessory = accessory;
		this.color = color;
		this.price = price;
	}

	
	

	

	

	
	
	
	
	

	
	
	
	
	

}
