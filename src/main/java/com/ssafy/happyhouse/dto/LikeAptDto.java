package com.ssafy.happyhouse.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "LikeApt(관심매물정보)", description = "아파트번호, 유저아이디, 매물주소, 작성일을 가진  Class")
public class LikeAptDto {
	@ApiModelProperty(value = "아파트번호")
	private int aptno;
	@ApiModelProperty(value = "유저아이디")
	private String userid;
	@ApiModelProperty(value = "매물주소")
	private String address;
	@ApiModelProperty(value = "작성일")
	private String regtime;
	public int getAptno() {
		return aptno;
	}
	public void setAptno(int aptno) {
		this.aptno = aptno;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRegtime() {
		return regtime;
	}
	public void setRegtime(String regtime) {
		this.regtime = regtime;
	}
	
	public LikeAptDto() {
		
	}
	public LikeAptDto(int aptno, String userid, String address, String regtime) {
		super();
		this.aptno = aptno;
		this.userid = userid;
		this.address = address;
		this.regtime = regtime;
	}
}