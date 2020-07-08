package com.springbook.biz.board.impl;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;

@Repository("boardDAO")//()이하는 생략가능
public class BoardDAO {
	/*private Connection con;
	private PreparedStatement st;
	private ResultSet rs;*/
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private final String BOARD_INSERT = "insert into board(seq, title, writer, content) values( (select nvl(max(seq),0)+1 from board),?,?,?)";
	private final String BOARD_UPDATE = "update board set title = ?, content = ? where seq = ?";
	private final String BOARD_DELETE = "delete from board where seq = ?";
	private final String BOARD_GET = "select * from board where seq = ?";
	private final String BOARD_LIST = "select * from board order by seq desc";

	public void insertBoard(BoardVO vo) {
		jdbcTemplate.update(BOARD_INSERT,vo.getTitle(),vo.getWriter(),vo.getContent());	
	}
	
	public void updateBoard(BoardVO vo) {
		jdbcTemplate.update(BOARD_UPDATE,vo.getTitle(),vo.getContent(),vo.getSeq());
	}
	
	public void deleteBoard(BoardVO vo) {
		jdbcTemplate.update(BOARD_DELETE,vo.getSeq());
	}
	
	public BoardVO getBoard(int seq) {
		Object[] args = {seq};
		return jdbcTemplate.queryForObject(BOARD_GET, args, new RowMapper<BoardVO>() {
			
			@Override
			public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException{
				
				BoardVO vo = new BoardVO();
				vo.setSeq(rs.getInt("seq") );
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("Content"));
				vo.setRegdate(rs.getDate("regdate"));
				vo.setWriter(rs.getString("writer"));
				return vo;
			}});
	}
	
	public List<BoardVO> getBoardList(){
		return jdbcTemplate.query(BOARD_LIST, new BoardRowMapper());
	}
	
	class BoardRowMapper implements RowMapper<BoardVO>{

		@Override
		public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
			BoardVO vo = new BoardVO();
			vo.setSeq(rs.getInt("seq") );
			vo.setTitle(rs.getString("title"));
			vo.setContent(rs.getString("Content"));
			vo.setRegdate(rs.getDate("regdate"));
			vo.setWriter(rs.getString("writer"));
			return vo;
		}
		
	}
}
