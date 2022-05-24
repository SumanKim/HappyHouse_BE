package com.ssafy.happyhouse.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "AllLikeAptResult(모든 관심매물정보)", description = "좋아요 수를 가진 아파트  Class")
public class AllLikeAptResultDto {
	@ApiModelProperty(value = "아파트번호")
	private String serialno;
	@ApiModelProperty(value = "매물주소")
	private String address;
	@ApiModelProperty(value = "층수")
	private String floor;
	@ApiModelProperty(value = "가격")
	private String price;
	@ApiModelProperty(value = "면적")
	private String area;
	@ApiModelProperty(value = "좋아요 수")
	private int likecnt;
	public String getSerialno() {
		return serialno;
	}
	public void setSerialno(String serialno) {
		this.serialno = serialno;
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
	public int getLikecnt() {
		return likecnt;
	}
	public void setLikecnt(int likecnt) {
		this.likecnt = likecnt;
	}
	
	public AllLikeAptResultDto() {
	}
	
	public AllLikeAptResultDto(String serialno, String address, String floor, String price, String area, int likecnt) {
		super();
		this.serialno = serialno;
		this.address = address;
		this.floor = floor;
		this.price = price;
		this.area = area;
		this.likecnt = likecnt;
	}
}