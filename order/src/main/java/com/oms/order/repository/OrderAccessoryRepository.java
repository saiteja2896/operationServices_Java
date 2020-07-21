package com.oms.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oms.order.entity.AccessoryMapper;

@Repository
public interface OrderAccessoryRepository extends JpaRepository<AccessoryMapper, Integer> {
	
	

}
