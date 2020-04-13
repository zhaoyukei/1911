package com.st;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.st.bean.User;
@Controller
public class TestAction {

	@Autowired
	User user;//容器中的user
	
	@RequestMapping("/login")
	@ResponseBody
	public String login (User user) {//前台传递的user
		String str="";
		if(user.equals(this.user)) {
			str="登陆成功";
		}else {
			str="登陆失败";
		}
		return str;
	}
}
