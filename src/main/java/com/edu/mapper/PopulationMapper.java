package com.edu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edu.domain.Population;
import com.edu.domain.PopulationInfo;

@Mapper
public interface PopulationMapper {
	
	@Select("select * from population limit 10")
	@RequestMapping("populationInfoResult")
	List<PopulationInfo> getPopulationList();
	
	
	@Select("select * from population where lid=#{lid}")
	@RequestMapping("populationInfoResult")
	PopulationInfo getPopulationById(@Param("lid") Integer lid);
}
