package com.desd.domain;

import java.util.Date;

public class User {
	// 用户ID
	private long user_id;
	// 用户名
	private String user_name;
	// 昵称
	private String nick_name;
	// 真实姓名
	private String real_name;
	// 所在地
	private String location;
	// 电子邮箱
	private String email;
	// 手机
	private String mobile;
	// 头像地址
	private String icon;
	// 性别 (M/F)
	private String gender;
	// 出生日期
	private Date birthday;
	// 在线状态
	private int online_status;
	// 用户类型(手机、邮箱、QQ、微博等)
	private int user_type;
	// 用户标识(第三方登陆用)
	private String user_flag;
	// 自我描述
	private String description;
	// 账号创建时间
	private Date create_time;
	
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getNick_name() {
		return nick_name;
	}
	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}
	public String getReal_name() {
		return real_name;
	}
	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public int getOnline_status() {
		return online_status;
	}
	public void setOnline_status(int online_status) {
		this.online_status = online_status;
	}
	public int getUser_type() {
		return user_type;
	}
	public void setUser_type(int user_type) {
		this.user_type = user_type;
	}
	public String getUser_flag() {
		return user_flag;
	}
	public void setUser_flag(String user_flag) {
		this.user_flag = user_flag;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	
}
