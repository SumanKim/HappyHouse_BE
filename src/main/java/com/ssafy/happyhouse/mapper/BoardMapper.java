package com.ssafy.happyhouse.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.happyhouse.dto.Board;
@Mapper
public interface BoardMapper {
	public List<Board> selectBoard();
	public List<Board> getBoardList(String text);
	public Board selectBoardByNo(int articleno);
	public void updateHit(int articleno);
	public int insertBoard(Board board);
	public int updateBoard(Board board);
	public int deleteBoard(int articleno);
}