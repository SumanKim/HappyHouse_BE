package com.ssafy.happyhouse.service;

import java.util.List;

import com.ssafy.happyhouse.dto.MemberDto;

public interface MemberService {

	public MemberDto login(MemberDto memberDto) throws Exception;
	public MemberDto userInfo(String userid) throws Exception;
	public boolean deleteMember(String userid);
	public boolean updateMember(MemberDto member);
	public int checkId(String userid);
	public boolean createMember(MemberDto member);
	public List<MemberDto> getAllMember();
	
}
