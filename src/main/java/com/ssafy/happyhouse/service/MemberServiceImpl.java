package com.ssafy.happyhouse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.happyhouse.dto.MemberDto;
import com.ssafy.happyhouse.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper memberMapper;
	
	@Override
	public MemberDto login(MemberDto memberDto) throws Exception {
		if(memberDto.getUserid() == null || memberDto.getUserpwd() == null)
			return null;
		return memberMapper.login(memberDto);
	}

	@Override
	public MemberDto userInfo(String userid) throws Exception {
		return memberMapper.userInfo(userid);
	}

	@Override
	public boolean deleteMember(String userid) {
		return memberMapper.deleteInfo(userid);
	}

	@Override
	public boolean updateMember(MemberDto member) {
		return memberMapper.updateInfo(member);
	}

	@Override
	public int checkId(String userid) {
		return memberMapper.checkId(userid);
	}

	@Override
	public boolean createMember(MemberDto member) {
		return memberMapper.insertInfo(member);
	}

}
