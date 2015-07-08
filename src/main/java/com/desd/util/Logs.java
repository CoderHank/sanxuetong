package com.desd.util;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logs {

	static {
		PropertyConfigurator.configure(Logs.class.getClassLoader().getResource("log4j.properties"));
	}

	public static Logger getLogger() {
		return Logger.getRootLogger();
	}

}