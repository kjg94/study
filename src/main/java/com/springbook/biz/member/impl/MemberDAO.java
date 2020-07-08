package com.springbook.biz.member.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springbook.biz.member.MemberVO;

public class MemberDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insertMember(MemberVO vo) {
		String query = "insert into Members values(?,?,?,?)";
		
		jdbcTemplate.update(query,vo.getId(),vo.getPassword(),vo.getName(), vo.getRole());	
	}


	public void updateMember(MemberVO vo) {
		String query = "update Members set password=?, name=?, role=? where id = ?";
		jdbcTemplate.update(query,vo.getPassword(), vo.getName(), vo.getRole(), vo.getId() );
		
	}

	public void deleteMember(MemberVO vo) {
		String query = "delete from Members where id = ?";
		jdbcTemplate.update(query,vo.getId() );
	}
	
	
	class MemberRowMapper implements RowMapper<MemberVO>{

		@Override
		public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {
			MemberVO vo = new MemberVO();
			vo.setId(rs.getString("id"));
			vo.setPassword(rs.getString("password"));
			vo.setName(rs.getString("name"));
			vo.setRole(rs.getString("role"));
			
			return vo;
		}
		
	}
	public MemberVO getMember(String id) {
		String query = "select * from Members where id = ?";
		return jdbcTemplate.queryForObject(query, new Object[] {id}, new MemberRowMapper() );
		
	}
	
	public List<MemberVO> getMemberList(){
		String query = "select * from Members order by id desc";
		return jdbcTemplate.query(query, new MemberRowMapper());
	}
}
