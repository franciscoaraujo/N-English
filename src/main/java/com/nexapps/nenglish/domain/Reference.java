package com.nexapps.nenglish.domain;

import java.io.Serializable;
import java.util.Map;

public class Reference implements Serializable{

	private static final long serialVersionUID = 1L;
	private String entry;
	private Map<String, String>relation;
	
	public String getEntry() {
		return entry;
	}
	public Map<String, String> getRelation() {
		return relation;
	}
	public void setEntry(String entry) {
		this.entry = entry;
	}
	public void setRelation(Map<String, String> relation) {
		this.relation = relation;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reference [entry=");
		builder.append(entry);
		builder.append(", relation=");
		builder.append(relation);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
