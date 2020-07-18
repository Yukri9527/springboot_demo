package com.edu.domain;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // 实体标签
@Table(name = "test_user")
public class TestUser {
	
	// Indicates that the persistence provider must assignprimary keys for the
	// entity using a database identity column.
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(length = 20)
	private String name;

	private Date birthday; // java.util

	public TestUser(Integer id, String name, Date birthday) { // 自动生成的有参构造函数
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
	}

	public TestUser() {  //  无参构造函数

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	@Override
	public String toString() {
		return "TestUser [id=" + id + ", name=" + name + ", birthday=" + birthday + "]";
	}


}
