package com.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringBootApplication {
	//springboot引导类
	public static void main(String[] args) {
		SpringApplication.run(MySpringBootApplication.class);
	}
	//SpringApplication 只能在最外层包中使用 扫描只会扫描SpringApplication下级的包
}
