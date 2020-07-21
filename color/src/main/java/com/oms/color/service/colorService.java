package com.oms.color.service;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.oms.color.Dto.ColorDto;
import com.oms.color.repository.colorRepository;
import com.oms.color.serviceImplimation.ColorServiceImplimation;


@Service
@Transactional
public class colorService implements ColorServiceImplimation {
	
	@Autowired
	colorRepository colorRepo;

	public List<ColorDto> getColorDetails(int modelId) {
		
		final Logger logger =LoggerFactory.getLogger(colorService.class);
		
		List<ColorDto> color=null;
		try {
			color=colorRepo.getColorList(modelId);
		}
		catch(Exception e){
			logger.debug("No modelId present");
			System.out.println(e);
		}
		return color;
	}
	

	
}
