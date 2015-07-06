package com.desd.domain;

import java.util.Date;

public class PostVote {
	// 帖子ID
	private long post_id;
	// 点赞人ID
	private long user_id;
	// 点赞时间
	private Date vote_date;
	
	public long getPost_id() {
		return post_id;
	}
	public void setPost_id(long post_id) {
		this.post_id = post_id;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public Date getVote_date() {
		return vote_date;
	}
	public void setVote_date(Date vote_date) {
		this.vote_date = vote_date;
	}
	
}
