package com.qfedu.entity;

import java.sql.Timestamp;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;






public class Record {
    private Integer rid;
   
    
    private Date time;

    private Integer outmoney;

    private Integer inmoney;

    private Integer remainmoney;

    private String type;

    private String explain;
    
    private String userid;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    public Date getTime() {
        return time;
    }
   @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getOutmoney() {
        return outmoney;
    }

    public void setOutmoney(Integer outmoney) {
        this.outmoney = outmoney;
    }

    public Integer getInmoney() {
        return inmoney;
    }

    public void setInmoney(Integer inmoney) {
        this.inmoney = inmoney;
    }

    public Integer getRemainmoney() {
        return remainmoney;
    }

    public void setRemainmoney(Integer remainmoney) {
        this.remainmoney = remainmoney;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}



}