package com.desd.exception;

import com.desd.constant.ErrorType;

/**
 * 业务异常类
 *
 */
public class BusinessException extends RuntimeException{
	private ErrorType errorType;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public BusinessException(ErrorType errorType){
		super(errorType.toString());
		this.errorType = errorType;
	}

	public ErrorType getErrorType() {
		return errorType;
	}

}
