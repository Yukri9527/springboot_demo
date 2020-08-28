package com.edu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.edu.domain.DeptInfo;
import com.edu.domain.PopulationInfo;
import com.edu.mapper.PopulationMapper;
import com.edu.service.PopulationService;

@Component //  或者是@Service
public class PopulationServiceImpl implements PopulationService {
	
	@Autowired
	private PopulationMapper populationMapper; //注入

	@Override
	public PopulationInfo getPopulationById(Integer lid) {
		return populationMapper.getPopulationById(lid);
	}

	@Override
	public List<PopulationInfo> getPopulationList() {
		// TODO Auto-generated method stub
		return populationMapper.getPopulationList();
	}

}
