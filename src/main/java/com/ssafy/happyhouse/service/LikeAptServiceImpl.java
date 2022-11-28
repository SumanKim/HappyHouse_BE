package com.ssafy.happyhouse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.happyhouse.dto.AllLikeAptResultDto;
import com.ssafy.happyhouse.dto.LikeAptDto;
import com.ssafy.happyhouse.mapper.LikeAptMapper;

@Service
public class LikeAptServiceImpl implements LikeAptService {
	
    @Autowired
	private LikeAptMapper likeAptMapper;

	@Override
	public List<LikeAptDto> getLikeAptList(String userid) {
		return likeAptMapper.selectLikeAptList(userid);
	}

	@Override
	public boolean addLikeApt(LikeAptDto apt) {
		return likeAptMapper.insertLikeApt(apt);
	}

	@Override
	public boolean deleteLikeApt(String serialno) {
		return likeAptMapper.deleteLikeApt(serialno);
	}

	@Override
	public List<AllLikeAptResultDto> getAllLikeAptList() {
		return likeAptMapper.selectAllLikeAptList();
	}
}