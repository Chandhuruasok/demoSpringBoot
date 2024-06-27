package com.auction.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.auction.demo.model.UserDetails;

public class Mapper implements RowMapper<UserDetails> {

	@Override
	public UserDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserDetails input=new UserDetails();
		input.setId(rs.getInt("id"));
		input.setEmail(rs.getString("email"));
		input.setUserName(rs.getString("user_name"));
		input.setPassword(rs.getString("password"));
		return input;
	}

}
