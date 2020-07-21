package com.oms.order.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oms.order.dto.AccessoryDto;
import com.oms.order.dto.SaveDto;
import com.oms.order.entity.AccessoryMapper;
import com.oms.order.entity.ColorMapper;
import com.oms.order.entity.OrderMapper;
import com.oms.order.orderImplimation.OrderServiceImplimation;
import com.oms.order.repository.OrderAccessoryRepository;
import com.oms.order.repository.OrderColorRepository;
import com.oms.order.repository.OrderRepository;

@Service
@Transactional
public class OrderService implements OrderServiceImplimation {
	
	@Autowired
	OrderRepository orderrepo;
	
	
	public boolean saveData(SaveDto savedto) {
		try {
			List<AccessoryMapper> accMap=new ArrayList<>();
			List<ColorMapper> colorMapper=new ArrayList<>();
			OrderMapper order =new OrderMapper(savedto.getSeries(),savedto.getModel(),savedto.getPrice());
			savedto.getAccessory().forEach(accessory->{
				AccessoryMapper accObj =new AccessoryMapper(accessory.getAccessoryId(),accessory.getAccessoryName());
				accMap.add(accObj);
			});
			
			savedto.getColor().forEach(color->{
				ColorMapper colObj=new ColorMapper(color.getColorId(),color.getColorName());
				colorMapper.add(colObj);
			});
			order.setColorMapper(colorMapper);
			order.setAccMapper(accMap);
			orderrepo.save(order);
		}
		catch(Exception e) {
			System.out.println(e);
			return false;
		}
		return true;
	}
	
	
}
