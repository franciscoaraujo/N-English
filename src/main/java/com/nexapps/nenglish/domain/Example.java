package com.nexapps.nenglish.domain;

import java.io.Serializable;
import java.util.List;

public class Example implements Serializable {

	private static final long serialVersionUID = 1L;
	private String entry;
	
	private List<String> example;

	public String getEntry() {
		return entry;
	}

	public void setEntry(String entry) {
		this.entry = entry;
	}

	public List<String> getExample() {
		return example;
	}

	public void setExample(List<String> example) {
		this.example = example;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Example [entry=");
		builder.append(entry);
		builder.append(", example=");
		builder.append(example);
		builder.append("]");
		return builder.toString();
	}

	
}
