package com.oms.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oms.order.dto.SaveDto;
import com.oms.order.orderImplimation.OrderServiceImplimation;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value="/data")
public class OrderController {

	@Autowired
	OrderServiceImplimation orderService;
	
	@RequestMapping(value="/savedata")
	public boolean saveOrderDetails(@RequestBody SaveDto saveDto) {
		
		return orderService.saveData(saveDto);
	}
	
}
