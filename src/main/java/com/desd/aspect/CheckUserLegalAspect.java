package com.desd.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.desd.constant.ErrorType;
import com.desd.exception.BusinessException;
import com.desd.param.BaseParam;

@Component("CheckUserLegalAspect")
@Aspect
public class CheckUserLegalAspect {
	@Before("@annotation(com.desd.annotation.CheckUserLegal)")
	public void checkUserLegal(JoinPoint jp){

		if(jp.getArgs() != null
				&& jp.getArgs().length > 0){
			Object arg = jp.getArgs()[0];
			if(arg != null && arg instanceof BaseParam){
				BaseParam<?> param = (BaseParam<?>)arg;
				if(param.getData() == null){
					throw new BusinessException(ErrorType.errorCheckToken);
				}
			}
		}

	}
}
