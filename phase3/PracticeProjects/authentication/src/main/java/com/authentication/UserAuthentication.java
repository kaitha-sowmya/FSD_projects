package com.authentication;


public class UserAuthentication {
	
	
public String userAuthentication(String username,String password) {
	String uname="sowmya";
	String pwd="sowmya";
	if(uname.equals(username)&&pwd.equals(password)) {
		return "loginsuccessfull";
	}
	else 
		return "check the credentials";
}
}
