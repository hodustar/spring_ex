package org.hodu.mapper;

import java.util.List;

import org.hodu.domain.BoardVO;
import org.hodu.domain.Criteria;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {

	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
	/*@Test
	public void testGetList(){
		mapper.getList().forEach(board -> log.info(board));
		
	}
	
	@Test
	public void testInsert(){
		BoardVO board = new BoardVO();
		board.setTitle("새글이얌");
		board.setContent("지금 일곱시 반이얌");
		board.setWriter("유진이얌");
		
		mapper.insert(board);
		log.info(board);
	}
	
	@Test
	public void testInsertSelectKey(){
		
		BoardVO board = new BoardVO();
		board.setTitle("새글이얌 select key");
		board.setContent("지금 일곱시 반이얌 select key");
		board.setWriter("유진이얌");
		
		mapper.insertSelectKey(board);
		log.info(board);
	}
	
	@Test
	public void testRead(){
		//존재하는 게시물 번호로 테스트
		BoardVO board = mapper.read(5L);
		
		log.info(board);
	}
	
	@Test
	public void testdelete(){
	
		log.info("DELETE COUNT: "+mapper.delete(3L));
	
	}
	
	@Test
	public void testUpdate(){
		BoardVO board = new BoardVO();
		//실행 전 존재하는 번호인지 확인할 것
		board.setBno(5L);
		board.setTitle("수정이얌");
		board.setContent("수정된 내용이얌");
		board.setWriter("수정님");
		
		int count = mapper.update(board);
		log.info("UPDATE COUNT: "+count);
	}
	

	
	@Test
	public void testPaging(){
		
		Criteria cri = new Criteria();
		//10개씩 3페이지
		
		cri.setAmount(10);
		cri.setPageNum(3);
		
		List<BoardVO> list = mapper.getListWithPaging(cri);
		
		list.forEach(board -> log.info(board.getBno()));
		
		
	}
		*/
	
	@Test
	public void testSearch(){
		
		Criteria cri = new Criteria();
		cri.setKeyword("새로");
		cri.setType("TC");
		
		List<BoardVO> list = mapper.getListWithPaging(cri);
		
		list.forEach(board -> log.info(board));
	}
	
	
	
	
	
	
	
	
	
	
}
