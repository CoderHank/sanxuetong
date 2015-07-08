package com.desd.param;

import com.alibaba.fastjson.JSON;

public class BaseParam<T> implements IParam {
	private T data;
	
	public String toJson(){
		return JSON.toJSONString(this);
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
