package com.oms.order.entity;

import java.io.Serializable;
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
@Table(name="ORDER_MANAGEMENT_COLORDETAILS")
public class ColorMapper  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ORDER_COLOR_ID")
	private int orderColorId;
	
	
	@Column(name="COLOR_ID")
	private int colorId;
	
	@Column(name="COLOR_NAME")
	private String colorName;
	


	public int getOrderColorId() {
		return orderColorId;
	}

	public void setOrderColorId(int orderColorId) {
		this.orderColorId = orderColorId;
	}


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

	public ColorMapper(int colorId, String colorName) {
		super();
		this.colorId = colorId;
		this.colorName = colorName;
	}

	public ColorMapper(List<ColorMapper> list) {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
