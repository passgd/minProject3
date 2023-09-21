package com.kosa.pro7.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kosa.pro7.domain.CommentDTO;

@Mapper
public interface CommentDAO {
	
	//더보기
	public List<CommentDTO> commentList(CommentDTO boardId) throws Exception;
	public List<CommentDTO> commentList(int boardId) throws Exception;
	
	//댓글 등록
	public int insertComment(CommentDTO comment)throws Exception;
	
	//더보기 전체 건수 얻기
	public int totalCount(int boardId)throws Exception;
	public int totalCount(CommentDTO boardId)throws Exception;

}
