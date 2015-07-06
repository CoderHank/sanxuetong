package com.desd.domain;

import java.util.Date;

/**
 * 
 * 评论中的图片资源
 *
 */
public class CommentPic {
	// ID
	private long commentpic_id;
	// 所属评论ID
	private long comment_id;
	// 图片地址
	private String pic_path;
	// 图片添加时间
	private Date create_time;
	
	public long getCommentpic_id() {
		return commentpic_id;
	}
	public void setCommentpic_id(long commentpic_id) {
		this.commentpic_id = commentpic_id;
	}
	public long getComment_id() {
		return comment_id;
	}
	public void setComment_id(long comment_id) {
		this.comment_id = comment_id;
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
