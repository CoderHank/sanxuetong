package com.desd.domain;

import java.util.Date;

public class UserLogin {
	// 用户ID
	private long user_id;
	// 用户密码hash
	private String password_hash;
	// 最后登录时间
	private Date last_login;
	// 客户端类型
	private int client_type;
	// 登录次数
	private int login_num;
	
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public String getPassword_hash() {
		return password_hash;
	}
	public void setPassword_hash(String password_hash) {
		this.password_hash = password_hash;
	}
	public Date getLast_login() {
		return last_login;
	}
	public void setLast_login(Date last_login) {
		this.last_login = last_login;
	}
	public int getClient_type() {
		return client_type;
	}
	public void setClient_type(int client_type) {
		this.client_type = client_type;
	}
	public int getLogin_num() {
		return login_num;
	}
	public void setLogin_num(int login_num) {
		this.login_num = login_num;
	}
	
}
