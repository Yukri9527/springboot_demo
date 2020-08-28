package com.edu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edu.domain.DeptInfo;

@Mapper
public interface DeptMapper {

	@Select("select * from dept") // limit 10
	@RequestMapping("deptInfoResult")
	List<DeptInfo> getDeptList();

	@Select("select * from dept where deptno=#{deptno}")
	@RequestMapping("deptInfoResult")
	DeptInfo getDeptById(@Param("deptno") Integer deptno); // ͨ��id ��ȡdeptno

	@Select("select count(*) from dept")
	Integer getDeptCount();

	@Select("select * from dept limit #{cursor}, #{offset}")
	@RequestMapping("deptInfoResult")
	List<DeptInfo> getDeptPage(@Param("cursor") Integer cursor, @Param("offset") Integer offset);

	Integer addDept(DeptInfo dept);

	Integer updateDept(DeptInfo dept);

	@Delete("delete from dept where deptno=#{deptno}")
	Integer deleteDept(@Param("deptno") Integer deptno);

}
