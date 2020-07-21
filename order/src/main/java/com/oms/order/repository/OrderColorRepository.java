package com.oms.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oms.order.entity.ColorMapper;

@Repository
public interface OrderColorRepository extends JpaRepository<ColorMapper, Integer> {

}
