package com.auction.demo.dao;
import  com.auction.demo.mapper.Mapper;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


import com.auction.demo.model.UserDetails;
@Component
public class UserImple implements UserDAO {
@Autowired
JdbcTemplate jdbcTemplate;
@Override
public void insert(UserDetails input) 
{
	String query="insert into input(email,user_name,password) values(?,?,?)";
	Object[] params= {input.getEmail(),input.getUserName(),input.getPassword()};
	int rows=jdbcTemplate.update(query, params);
	
}
public List<UserDetails> view() 
{
	String input="select id,email,user_name,password from input where is_deleted=false";
	return  jdbcTemplate.query(input,new Mapper());
	
	
	
}
public void delete(int id)
{
	String deleteId="update input set is_deleted=true where id=?";
	
	jdbcTemplate.update(deleteId,id); 
}
public UserDetails find(int id)
{
	String updateId="select * from  input where id=? and is_deleted=false";
	
	return jdbcTemplate.queryForObject(updateId,new Mapper(),id); 
}
public void update(UserDetails input)
{
	String update="update input set email=?,user_name=?,password=?   where id=?";
	Object[] params= {input.getEmail(),input.getUserName(),input.getPassword(),input.getId()};
	jdbcTemplate.update(update, params);
}
public List<UserDetails> search(String name)
{
	String search="select id,email,user_name,password from input where user_name like ? and is_deleted=false";
	List<UserDetails> user= jdbcTemplate.query(search, new Mapper(), name);
	return user;
}
}
