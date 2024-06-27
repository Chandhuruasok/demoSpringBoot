package com.auction.demo.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.auction.demo.dao.UserDAO;
import com.auction.demo.dao.UserImple;
import com.auction.demo.model.UserDetails;

@Controller
public class DemoController {
	@Autowired
	UserDAO data;
	
	@RequestMapping("/")
	public String home()
	{
		
		return "landing.jsp";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("email") String email,@RequestParam("username") String userName,@RequestParam("password") String password,Model model) 
	{
		
		UserDetails input=new UserDetails();
		input.setEmail(email);
		input.setUserName(userName);
		input.setPassword(password);
		data.insert(input);
		List<UserDetails> view=data.view();
		model.addAttribute("view",view);
		return "success.jsp";
	}
	@GetMapping("/delete")
	public String deleteId(@RequestParam("deleteid") int id,Model model)
	{
		
		data.delete(id);
		List<UserDetails> view=data.view();
		model.addAttribute("view",view);
		return "success.jsp";
	}
	@PostMapping("/find")
	public String updateId(@RequestParam("findid") int id,Model model)
	{
		
		UserDetails input=data.find(id);
		
		model.addAttribute("input",input);
		return "update.jsp";
	}
	@PostMapping("/update")
	public String update(@RequestParam("updateid") int id,@RequestParam("email") String email,@RequestParam("username") String userName,@RequestParam("password") String password,Model model)
	{
		UserDetails input=new UserDetails();
		
		input.setId(id);
		
		
		input.setEmail(email);
		input.setUserName(userName);
		input.setPassword(password);
		data.update(input);
		List<UserDetails> view=data.view();
		model.addAttribute("view",view);
		return "success.jsp";
	}
	@PostMapping("/Search")
	public String search(@RequestParam("search") String name,Model model)
	{
		
		List<UserDetails> searchUser=data.search(name);
		model.addAttribute("view", searchUser);
		return "success.jsp";
	}
}
