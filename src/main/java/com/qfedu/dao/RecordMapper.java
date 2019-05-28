package com.qfedu.dao;

import java.util.List;

import com.qfedu.entity.Record;
import com.qfedu.entity.VUser;

public interface RecordMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(Record record);
    
    int insertSelective(Record record);

    Record selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(Record record);

    int updateByPrimaryKeyWithBLOBs(Record record);

    int updateByPrimaryKey(Record record);
    
    //查找余额
    Record selectByUserId(String userId);
    //查找多个
    List<Record> selectMoreUserId(String userId);
    //用户和记录表联合
    
    VUser selectByVUserId(String userId);
    
   
}