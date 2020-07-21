package com.oms.Accessory.entity;


public class Series {
	
	private int seriesId;
	
	private String seriesCode;
	
   private String seriesName;
	
	protected char isActive;

	public int getSeriesId() {
		return seriesId;
	}

	public void setSeriesId(int seriesId) {
		this.seriesId = seriesId;
	}

	public String getSeriesCode() {
		return seriesCode;
	}

	public void setSeriesCode(String seriesCode) {
		this.seriesCode = seriesCode;
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public char getIsActive() {
		return isActive;
	}

	public void setIsActive(char isActive) {
		this.isActive = isActive;
	}

	public Series() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Series(int seriesId, String seriesCode, String seriesName, char isActive) {
		super();
		this.seriesId = seriesId;
		this.seriesCode = seriesCode;
		this.seriesName = seriesName;
		this.isActive = isActive;
	}

	
}
