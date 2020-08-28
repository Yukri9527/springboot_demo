package com.edu.service;

import java.util.List;

import com.edu.domain.DeptInfo;
import com.edu.domain.Population;
import com.edu.domain.PopulationInfo;

public interface PopulationService {

	PopulationInfo getPopulationById(Integer lid);
	
	List<PopulationInfo> getPopulationList();
	
}
