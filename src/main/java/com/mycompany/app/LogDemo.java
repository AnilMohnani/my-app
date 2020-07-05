package com.mycompany.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LogDemo {

	private static Logger log=LogManager.getLogger(LogDemo.class.getName());
	public static void main(String[] args) {
		
		log.info("click done");
		log.error("Error happens");	
		log.fatal("fatal error");
	}
}
