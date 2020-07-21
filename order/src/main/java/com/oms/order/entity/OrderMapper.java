package com.oms.order.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ORDER_MANAGEMENT_ORDERDETAILS")
public class OrderMapper implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ORDER_ID")
	private int orderId;
	
	@Column(name="SERIES_ID")
	private int seriesId;
	
	@Column(name="MODEL_ID")
	private int modelId;
	
	@Column(name="PRICE")
	private long price;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name ="ORDER_ID")
	private List<AccessoryMapper> accMapper;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name ="ORDER_ID")
    private List<ColorMapper> colorMapper;
    
	

	public List<ColorMapper> getColorMapper() {
		return colorMapper;
	}

	public void setColorMapper(List<ColorMapper> colorMapper) {
		this.colorMapper = colorMapper;
	}

	public List<AccessoryMapper> getAccMapper() {
		return accMapper;
	}

	public void setAccMapper(List<AccessoryMapper> accMapper) {
		this.accMapper = accMapper;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getSeriesId() {
		return seriesId;
	}

	public void setSeriesId(int seriesId) {
		this.seriesId = seriesId;
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

	

	public OrderMapper( int seriesId, int modelId, long price) {
		super();
		this.seriesId = seriesId;
		this.modelId = modelId;
		this.price = price;
	}

	
	
	
	

}
