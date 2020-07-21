package com.oms.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oms.order.entity.OrderMapper;

@Repository
public interface OrderRepository extends JpaRepository<OrderMapper, Integer> {
	
	

}
