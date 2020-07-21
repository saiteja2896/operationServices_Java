package com.oms.color.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oms.color.Dto.ColorDto;
import com.oms.color.Dto.ModelDto;
import com.oms.color.service.colorService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value="/color")
public class colorController {

	
	@Autowired
	colorService colorService;
	
	@RequestMapping(value="/getcolors")
	public List<ColorDto> getColorList(@RequestBody ModelDto modelId){
		
		return colorService.getColorDetails(modelId.getModelId());
		
	}

}
