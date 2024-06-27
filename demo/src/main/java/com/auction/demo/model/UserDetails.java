package com.auction.demo.model;

public class UserDetails {
int id;
String email;
String userName;
String password;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public UserDetails(int id, String email, String userName, String password) {
	super();
	this.id = id;
	this.email = email;
	this.userName = userName;
	this.password = password;
}
public UserDetails()
{
	
}
@Override
public String toString() {
	return "Input [id=" + id + ", email=" + email + ", userName=" + userName + ", password=" + password + "]";
}


}
