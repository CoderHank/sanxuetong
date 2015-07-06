package com.desd.domain;

import java.util.Date;

/**
 * 
 * 帖子举报
 *
 */
public class PostReport {
	// 举报ID
	private long report_id;
	// 举报内容
	private String content;
	// 举报时间
	private Date report_time;
	// 举报者
	private long user_id;
	// 被举报帖子Id
	private long post_id;
	
	public long getReport_id() {
		return report_id;
	}
	public void setReport_id(long report_id) {
		this.report_id = report_id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getReport_time() {
		return report_time;
	}
	public void setReport_time(Date report_time) {
		this.report_time = report_time;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public long getPost_id() {
		return post_id;
	}
	public void setPost_id(long post_id) {
		this.post_id = post_id;
	}
	
}
