package com.ssafy.happyhouse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.happyhouse.dto.Board;
import com.ssafy.happyhouse.dto.LikeAptDto;
import com.ssafy.happyhouse.mapper.BoardMapper;
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
	public List<LikeAptDto> getAllLikeAptList() {
		return likeAptMapper.selectAllLikeAptList();
	}
}