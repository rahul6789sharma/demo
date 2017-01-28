package com.learn.test;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class MyDao  {

	private String url;
	private String userName;
	private String password;
	
	@PostConstruct
	public void myInit() {
		System.out.println("Open Connection with With DB");
		System.out.println("url : " + url);
		System.out.println("userName : " + userName);
		System.out.println("password : " + password);
	}

	@PreDestroy
	public void myDestroy() throws Exception {
		System.out.println("***********");
		System.out.println("Close Connection");
	}

	public String getUrl() {
		return url;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
