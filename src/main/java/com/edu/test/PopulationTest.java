package com.edu.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.edu.MySpringBootApplication;
import com.edu.domain.DeptInfo;
import com.edu.domain.Population;
import com.edu.domain.PopulationInfo;
import com.edu.mapper.DeptMapper;
import com.edu.mapper.PopulationMapper;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MySpringBootApplication.class)
public class PopulationTest {

	@Autowired
	private PopulationMapper populationMapper;

	@Test
	public void populationListTest() {
		List<PopulationInfo> list = populationMapper.getPopulationList();
		for (PopulationInfo population : list)
			System.out.println(population);
	}
}
