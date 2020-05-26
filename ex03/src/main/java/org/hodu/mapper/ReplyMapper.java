package org.hodu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.hodu.domain.Criteria;
import org.hodu.domain.ReplyVO;

public interface ReplyMapper {

	public int insert(ReplyVO vo);
	
	public ReplyVO read(Long bno);
	
	public int delete(Long rno);
	
	public int update(ReplyVO vo);
	
	public List<ReplyVO> getListWithPaging(
			@Param("cri") Criteria cri,
			@Param("bno") Long bno);
	
	public int getCountByBno(Long bno);
	
	
	
	
	
	
	
	
	
}
