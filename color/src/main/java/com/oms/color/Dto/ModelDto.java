package com.oms.color.Dto;

public class ModelDto {
	
	 private int modelId;
	    
	 private String modelName;
	 
	 private long price;

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public int getModelId() {
		return modelId;
	}

	public void setModelId(int modelId) {
		this.modelId = modelId;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	

	public ModelDto(int modelId, String modelName, long price) {
		super();
		this.modelId = modelId;
		this.modelName = modelName;
		this.price = price;
	}

	public ModelDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 
	

}
