package com.qfedu.service.impl;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.RecordMapper;
import com.qfedu.entity.Record;
import com.qfedu.entity.User;
import com.qfedu.entity.VUser;
import com.qfedu.service.RecordService;

@Service
public class RecordServiceImpl implements RecordService{
	@Autowired
	private RecordMapper recordDao;
	@Override
	public Record selectByUserId(String userId) {
		// TODO Auto-generated method stub
		
		Record record = recordDao.selectByUserId(userId);
		
		return record;
	}
	
	@Override
	public void updateByPrimaryKeyWithBLOBs(Record record) {
		// TODO Auto-generated method stub
		recordDao.updateByPrimaryKeyWithBLOBs(record);
	}
	@Override
	public void insertSelective(Record record) {
		// TODO Auto-generated method stub
		recordDao.insertSelective(record);
	}

	@Override
	public List<Record> selectMoreUserId(String userId) {
		// TODO Auto-generated method stub
		return recordDao.selectMoreUserId(userId);
	}

	@Override
	public Map<String, Object> findUserByPage(HttpSession session, int page) {
		// TODO Auto-generated method stub
				// TODO Auto-generated method stub
				User user =  (User) session.getAttribute("user");
				String  userId = user.getUserid();
						
				
				
				
				// 分页插件中提供的方法
						// 第一个参数，页码；第二个参数，每页显示记录个数
						// startPage()方法后，一定要直接写查询的方法，中间不要有其他逻辑
						
				
				
				PageHelper.startPage(page, 5);
						// 正常的查询操作
				List<Record> list	= recordDao.selectMoreUserId(userId);
				Map<String, Object> map = new HashMap<>();
						// 获取总记录数
				map.put("total", ((Page)list).getTotal());
						// 当前页显示的记录
				map.put("rows", list);
						
						
						return map;
	}

	
	


}
