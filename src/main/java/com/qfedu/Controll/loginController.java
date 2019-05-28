package com.qfedu.Controll;

import javax.servlet.http.HttpSession;

import com.qfedu.entity.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qfedu.entity.User;
import com.qfedu.service.UserService;
import com.qfedu.vo.JsonBean;

import java.sql.Time;

@Controller
@ResponseBody
public class loginController {

	@Autowired
	private UserService userService;
	@RequestMapping("/login.do")
	public JsonBean login(String userId,String password ,HttpSession session) {

		System.out.println("ni");

		try {
		User user = userService.selectUserByUserId(userId, password);
		session.setAttribute("user", user);
		return new JsonBean(1,user);
		} catch (Exception e) {
			// TODO: handle exception
			return new JsonBean(0,e.getMessage());
		}
		
	}

}
