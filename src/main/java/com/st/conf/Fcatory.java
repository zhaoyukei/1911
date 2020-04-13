package com.st.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.st.bean.User;

@Configuration
public class Fcatory {

	@Bean
	public User user() {
		User user=new User();
		user.setName("tom");
		user.setPass("123");
		return user;
	}
}
