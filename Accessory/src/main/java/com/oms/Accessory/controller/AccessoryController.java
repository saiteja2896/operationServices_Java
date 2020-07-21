package com.oms.Accessory.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.oms.Accessory.dto.AccessoryDto;
import com.oms.Accessory.dto.ModelDto;
import com.oms.Accessory.serviceImplimation.AccessoryImplimation;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value="/accessory")
public class AccessoryController {
	
	@Autowired
	AccessoryImplimation accessoryService;
	
	
	@RequestMapping(value="/getaccessory")
	public List<AccessoryDto> getAccessoryList(@RequestBody ModelDto modelId){
		
		return accessoryService.getAccessory(modelId.getModelId());
	}
	
	 /*  @Autowired
	   RestTemplate restTemplate;
	   
	   @RequestMapping("/getacc")
	   public List<Object> getSeriesDetails(){
		   String url="http://localhost:8081/series/alldata";
		   
		   Object[] object = restTemplate.getForObject(url, Object[].class);
		   
		   return Arrays.asList(object);
	   }*/
	
	
	   
	   

}
