package com.authentication;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserAuthenticationTest {
	UserAuthentication ua=new UserAuthentication();
	@Test
	public void test() {
		UserAuthentication ua=new UserAuthentication();
		assertEquals("loginsuccessfull",ua.userAuthentication("sowmya","sowmya"));
	}
	
//	@Test
//	public void test1() {
	//UserAuthentication ua1=new UserAuthentication();
//		assertEquals("loginsuccessfull",ua1.userAuthentication("sowmya","kaitha"));
//	}


}
