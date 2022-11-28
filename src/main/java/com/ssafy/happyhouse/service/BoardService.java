package com.ssafy.happyhouse.service;

import java.util.List;

import com.ssafy.happyhouse.dto.Board;

public interface BoardService {
	public List<Board> retrieveBoard();
	public List<Board> getBoardList(String text);
	public Board detailBoard(int articleno);
	public boolean updateHit(int articleno);
	public boolean writeBoard(Board board);
	public boolean updateBoard(Board board);
	public boolean deleteBoard(int articleno);
}