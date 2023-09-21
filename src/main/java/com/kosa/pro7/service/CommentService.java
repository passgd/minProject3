package com.kosa.pro7.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kosa.pro7.domain.CommentDTO;
import com.kosa.pro7.mappers.CommentDAO;

@Service
public class CommentService {

	@Autowired
	public CommentDAO commentDAO;
	
	//더보기
	public List<CommentDTO> commentListDTO(CommentDTO boardId) throws Exception{
		System.out.println("service 더보기 ");
		return commentDAO.commentList(boardId);
	}
	public List<CommentDTO> commentList(int boardId) throws Exception{
		System.out.println("service 더보기 ");	
		return commentDAO.commentList(boardId);
	}
	
	//댓글 등록
	@Transactional
	public boolean insert(CommentDTO comment)throws Exception{
		System.out.println("Service의 댓글 등록");
		return 0 != commentDAO.insertComment(comment);
	}
	
	public int totalCommentCount(int boardId) throws Exception{
		return commentDAO.totalCount(boardId);
	}
}
