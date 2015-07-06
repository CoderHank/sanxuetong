package com.desd.domain;

import java.util.Date;

/**
 * 
 * 帖子图片资源
 *
 */
public class PostPic {
	// 主键
	private long postpic_id;
	// 帖子ID
	private long post_id;
	// 图片地址
	private String pic_path;
	// 图片添加时间
	private Date create_time;
	
	public long getPostpic_id() {
		return postpic_id;
	}
	public void setPostpic_id(long postpic_id) {
		this.postpic_id = postpic_id;
	}
	public long getPost_id() {
		return post_id;
	}
	public void setPost_id(long post_id) {
		this.post_id = post_id;
	}
	public String getPic_path() {
		return pic_path;
	}
	public void setPic_path(String pic_path) {
		this.pic_path = pic_path;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	
}
