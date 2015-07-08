package com.desd.param;

import java.io.Serializable;

import com.alibaba.fastjson.JSON;

public class ResponseParam<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	private String statusCode = "OK";
	private String msg;
	private T data;
	
	public String toJson(){
		return JSON.toJSONString(this);
	}
	
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}

}
