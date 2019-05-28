package com.qfedu.Controll;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.qfedu.entity.Record;
import com.qfedu.entity.VUser;
import com.qfedu.service.RecordService;
import com.qfedu.vo.JsonBean;

@RestController
public class TransferController {
	@Autowired
	private RecordService recordSerice;
	@RequestMapping("/transfer.do")
	public JsonBean transfer(String  userId, int inMoney) throws ParseException {
			
     int sum =0;
	 
	 List<Record> list =  recordSerice.selectMoreUserId(userId);

	 if(list==null) {
			throw new RuntimeException("该用户不存在");
		}
		
	 Record record1 = list.get(list.size()-1);
	int remain = record1.getRemainmoney();
	sum = remain+inMoney;
	 

		Record record2 = new Record();
		record2.setInmoney(inMoney);
		record2.setRemainmoney(sum);
		record2.setType("转账");
	//	record2.setExplain("你好");
		record2.setUserid(userId);
	//	Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//yyyy-MM-ddHH:mm:ss
		Date now = new Date();
		String time = sdf.format(now);
		Date  date = sdf.parse(time);
		record2.setTime(date);
		recordSerice.insertSelective(record2);
		System.out.println(record2);
	
	try {
		 return new JsonBean(1,record2);
	} catch (Exception e) {
		// TODO: handle exception
		
		return new JsonBean(0,e.getMessage());
	}
	
	}
}
