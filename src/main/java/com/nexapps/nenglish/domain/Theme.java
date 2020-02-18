package com.nexapps.nenglish.domain;

import java.io.Serializable;
import java.util.List;

public class Theme implements Serializable {

	private static final long serialVersionUID = 1L;

	private String entry;
	private List<String> theme;

	public String getEntry() {
		return entry;
	}

	public List<String> getTheme() {
		return theme;
	}

	public void setEntry(String entry) {
		this.entry = entry;
	}

	public void setTheme(List<String> theme) {
		this.theme = theme;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Theme [entry=");
		builder.append(entry);
		builder.append(", theme=");
		builder.append(theme);
		builder.append("]");
		return builder.toString();
	}

}
