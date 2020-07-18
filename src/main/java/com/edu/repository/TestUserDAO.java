package com.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.domain.TestUser;

@Repository // 继承JpaRepository 现成的很多方法
public interface TestUserDAO extends JpaRepository<TestUser, Integer> {
	
	// where x.firstname like?1
	TestUser findByNameLike(String name);
	
}
