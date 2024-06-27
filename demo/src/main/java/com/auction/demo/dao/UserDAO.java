package com.auction.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.auction.demo.model.UserDetails;
@Repository
public interface UserDAO {
	public void insert(UserDetails input) ;
	public List<UserDetails> view();
	public void delete(int id);
	public UserDetails find(int id);
	public void update(UserDetails input);
	public List<UserDetails> search(String name);
}
