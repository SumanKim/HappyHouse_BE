package com.ssafy.happyhouse.mapper;

import java.sql.SQLException;
import java.util.List;

import com.ssafy.happyhouse.dto.MemberDto;


public interface MemberMapper {

	public MemberDto login(MemberDto memberDto) throws SQLException;
	public MemberDto userInfo(String userid) throws SQLException;
	public boolean deleteInfo(String userid);
	public boolean updateInfo(MemberDto member);
	public int checkId(String userid);
	public boolean insertInfo(MemberDto member);
	public List<MemberDto> selectAllInfo();
}