package com.oms.color.serviceImplimation;

import java.util.List;

import com.oms.color.Dto.ColorDto;

public interface ColorServiceImplimation {
	
	public List<ColorDto> getColorDetails(int modelId);

}
