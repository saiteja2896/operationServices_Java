package com.oms.Accessory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.oms.Accessory.dto.AccessoryDto;
import com.oms.Accessory.entity.Accessory;

@Repository
public interface AccessoryRepository extends JpaRepository<Accessory, Integer> {
	
	
	
	@Query("select new com.oms.Accessory.dto.AccessoryDto(a.accessoryId,a.accessoryName,a.modelId,a.price) from Accessory a where a.modelId=:modelId")
	public List<AccessoryDto> getAccessoryDetails(@Param("modelId") Integer modelId);

}
