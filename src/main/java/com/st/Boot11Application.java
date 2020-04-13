package com.st;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Boot11Application {
//	创建springboot项目,添加springmvc框架,定义一个方法,接受前台传递的User信息
//	在spring容器中添加一个User,并赋予属性,前台传递的信息和容器中的User完全一致则返回登陆成功
//	,否则登陆失败
	public static void main(String[] args) {
		SpringApplication.run(Boot11Application.class, args);
	}

}
