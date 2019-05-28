package com.qfedu.Controll;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qfedu.entity.Record;
import com.qfedu.entity.User;
import com.qfedu.service.RecordService;
import com.qfedu.vo.JsonBean;
@RestController
public class selectRecord {

	@Autowired
	private RecordService recordService;
	@RequestMapping("/record.do")
	public JsonBean record(int page,HttpSession session) {

		System.out.println("4");
		
		Map<String, Object> map = recordService.findUserByPage(session, page);
		try {
			return new JsonBean(1,map);
		} catch (Exception e) {
			// TODO: handle exception
			return new JsonBean(0,e.getMessage());
		}
		 
		 
	}
}
