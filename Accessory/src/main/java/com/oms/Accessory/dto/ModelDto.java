package com.oms.Accessory.dto;

public class ModelDto {
	
	 private int modelId;
	    
	 private String modelName;

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

	public ModelDto(int modelId, String modelName) {
		super();
		this.modelId = modelId;
		this.modelName = modelName;
	}

	public ModelDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 
	

}
