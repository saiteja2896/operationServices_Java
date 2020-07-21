package com.oms.color.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.oms.color.Dto.ColorDto;
import com.oms.color.entity.Color;

public interface colorRepository extends JpaRepository<Color, Integer>{
	
	@Query("select new com.oms.color.Dto.ColorDto(c.colorId,c.colorName,c.modelId,c.price,c.available) from Color c where c.modelId=:modelId")
	public List<ColorDto> getColorList(@Param("modelId") Integer modelId); 

}
