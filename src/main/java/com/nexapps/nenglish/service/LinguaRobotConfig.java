package com.nexapps.nenglish.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LinguaRobotConfig {

	@Value("${access.lingua.robot.host}")
	private String host;

	@Value("${access.lingua.robot.key}")
	private String key;
	
	public String getHost() {
		return host;
	}

	public String getKey() {
		return key;
	}

}
