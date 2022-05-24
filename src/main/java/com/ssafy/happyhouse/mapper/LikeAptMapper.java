package com.ssafy.happyhouse.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.happyhouse.dto.Board;
import com.ssafy.happyhouse.dto.LikeAptDto;
@Mapper
public interface LikeAptMapper {
	public List<LikeAptDto> selectLikeAptList(String userid);
	public boolean insertLikeApt(LikeAptDto apt);
	public boolean deleteLikeApt(String serialno);
}