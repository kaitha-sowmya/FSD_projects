package com.authentication;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserAuthenticationTest2 {

	@Test
	public void test() {
		UserAuthentication ua=new UserAuthentication();
		assertEquals("check the credentials",ua.userAuthentication("sowmya","sowmya"));
	}
	
	@Test
	public void test1() {
		UserAuthentication ua=new UserAuthentication();
		assertEquals("check the credentials",ua.userAuthentication("sowmya","kaitha"));
	}
}