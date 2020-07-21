package com.oms.Accessory.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oms.Accessory.dto.AccessoryDto;
import com.oms.Accessory.repository.AccessoryRepository;
import com.oms.Accessory.serviceImplimation.AccessoryImplimation;

@Service
@Transactional
public class AccessoryService implements AccessoryImplimation{
	
	final Logger logger =LoggerFactory.getLogger(AccessoryService.class);
	
	@Autowired
	AccessoryRepository accessoryrepo;
	
	public List<AccessoryDto> getAccessory(int id){
	
		List<AccessoryDto> accessoryList=null;
		
		try {
			accessoryList=accessoryrepo.getAccessoryDetails(id);
		}
	   catch(Exception e) {
		   logger.debug("Invalid id"+e);
	   }
		return accessoryList;
		}

	
	
}
