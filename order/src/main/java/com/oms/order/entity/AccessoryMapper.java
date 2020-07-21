package com.oms.order.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ORDER_MANAGEMENT_ACCYDETAILS")
public class AccessoryMapper {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ORDER_ACCESSORY_ID")
	private int orderAccessoryId;
	
	
	@Column(name="ACCESSORY_ID")
	private int accessoryId;
	
	@Column(name="ACCESSORY_NAME")
	private String accessoryName;

	public int getOrderAccessoryId() {
		return orderAccessoryId;
	}

	public void setOrderAccessoryId(int orderAccessoryId) {
		this.orderAccessoryId = orderAccessoryId;
	}

	

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

	public AccessoryMapper(List<AccessoryMapper> list) {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public AccessoryMapper(int accessoryId, String accessoryName) {
		super();
		this.accessoryId = accessoryId;
		this.accessoryName = accessoryName;
	}
	
	

}
