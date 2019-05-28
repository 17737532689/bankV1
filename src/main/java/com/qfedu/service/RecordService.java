package com.qfedu.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import com.qfedu.entity.Record;


public interface RecordService {
	//查找余额
    Record selectByUserId(String userId);
    
    void insertSelective(Record record);
 
    
    void updateByPrimaryKeyWithBLOBs(Record record);
    
    //查找多个record
    List<Record> selectMoreUserId(String userId);
   //分页
    public Map<String, Object> findUserByPage(HttpSession session, int page);
}
