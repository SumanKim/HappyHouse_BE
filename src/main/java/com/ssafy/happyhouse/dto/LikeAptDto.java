package com.ssafy.happyhouse.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "LikeApt(관심매물정보)", description = "아파트번호, 유저아이디, 매물주소, 작성일을 가진  Class")
public class LikeAptDto {
	@ApiModelProperty(value = "아파트번호")
	private String serialno;
	@ApiModelProperty(value = "유저아이디")
	private String userid;
	@ApiModelProperty(value = "매물주소")
	private String address;
	@ApiModelProperty(value = "층수")
	private String floor;
	@ApiModelProperty(value = "가격")
	private String price;
	@ApiModelProperty(value = "면적")
	private String area;
	@ApiModelProperty(value = "작성일")
	private String regtime;
	@ApiModelProperty(value = "건축년도")
	private Integer year;
	
	public String getSerialno() {
		return serialno;
	}
	public void setSerialno(String serialno) {
		this.serialno = serialno;
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
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getRegtime() {
		return regtime;
	}
	public void setRegtime(String regtime) {
		this.regtime = regtime;
	}
	
	public LikeAptDto() {
		
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public LikeAptDto(String serialno, String userid, String address, String floor, String price, String area,
			String regtime, Integer year) {
		super();
		this.serialno = serialno;
		this.userid = userid;
		this.address = address;
		this.floor = floor;
		this.price = price;
		this.area = area;
		this.regtime = regtime;
		this.year = year;
	}
}