package com.oms.Accessory.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ORDER_MANAGEMENT_ACCESSORY")
public class Accessory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ACCESSORY_ID")
	private int accessoryId;
	
	@Column(name="ACCESSORY_NAME")
	private String accessoryName;
	
	@Column(name="MODEL_ID")
	private int modelId;
	
	@Column(name="PRICE")
	private long price;
	
	@Column(name="IS_ACTIVE")
	protected char isActive;

	

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



	public char getIsActive() {
		return isActive;
	}



	public void setIsActive(char isActive) {
		this.isActive = isActive;
	}



	public Accessory(int accessoryId, String accessoryName, int modelId, long price, char isActive) {
		super();
		this.accessoryId = accessoryId;
		this.accessoryName = accessoryName;
		this.modelId = modelId;
		this.price = price;
		this.isActive = isActive;
	}



	public Accessory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
