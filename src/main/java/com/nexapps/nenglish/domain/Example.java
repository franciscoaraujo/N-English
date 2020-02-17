package com.nexapps.nenglish.domain;

import java.io.Serializable;
import java.util.Map;

public class Example implements Serializable {

	private static final long serialVersionUID = 1L;
	private String entry;
	
	private Map<String, String> example;

	public String getEntry() {
		return entry;
	}

	public void setEntry(String entry) {
		this.entry = entry;
	}

	public Map<String, String> getExample() {
		return example;
	}

	public void setExample(Map<String, String> example) {
		this.example = example;
	}

}
