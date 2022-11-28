package com.ssafy.happyhouse.service;

import java.util.List;

import com.ssafy.happyhouse.dto.Board;
import com.ssafy.happyhouse.dto.Comment;

public interface CommentService {
	public List<Comment> retrieveComment(int articleno);
	public boolean writeComment(Comment comment);
	public boolean deleteComment(int commentno);
}