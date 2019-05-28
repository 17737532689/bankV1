package com.qfedu.Controll;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.xml.crypto.Data;

import com.sun.tools.doclint.Entity;
import jdk.nashorn.tools.ShellFunctions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qfedu.entity.Record;
import com.qfedu.entity.User;
import com.qfedu.entity.VUser;
import com.qfedu.service.RecordService;
import com.qfedu.vo.JsonBean;

import static com.sun.tools.doclint.Entity.ne;

@Controller
@ResponseBody
public class selectRemain {

	@Autowired
	private RecordService recordSerice;
	@RequestMapping("/remain.do")
	public JsonBean remain(HttpSession session) {

		User user =  (User) session.getAttribute("user");
		String  userId = user.getUserid();
		List<Record> list =  recordSerice.selectMoreUserId(userId);

		Record record = list.get(list.size()-1);





		try {

			return new JsonBean(1,record);
		} catch (Exception e) {
			// TODO: handle exception
			return new JsonBean(0,e.getMessage());
		}
	}
}
