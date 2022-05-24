package com.ssafy.happyhouse.service;

import java.util.List;

import com.ssafy.happyhouse.dto.Board;
import com.ssafy.happyhouse.dto.LikeAptDto;

public interface LikeAptService {
	public List<LikeAptDto> getLikeAptList(String userid);
	public boolean addLikeApt(LikeAptDto apt);
	public boolean deleteLikeApt(String serialno);
	public List<LikeAptDto> getAllLikeAptList();
}