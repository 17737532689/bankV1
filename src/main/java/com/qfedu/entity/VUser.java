package com.qfedu.entity;

import java.util.Date;

public class VUser {
	
	   private String userid;
	   private Date time;
	   private Integer outmoney;
	   private Integer inmoney;
	   private Integer remainmoney;
	   private String type;
	   private String explain;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public Date getTime() {
		return time;
	}
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
		this.type = type;
	}
	public String getExplain() {
		return explain;
	}
	public void setExplain(String explain) {
		this.explain = explain;
	}
	    
	   
	   
}
