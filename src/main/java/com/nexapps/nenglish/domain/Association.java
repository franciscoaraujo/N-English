package com.nexapps.nenglish.domain;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Association  implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private String entry;
	
	@SerializedName("assoc_word")
	private List<String> assocWord;
	
	@SerializedName("assoc_word_ex")
	private List<String> assocWordEx;

	
	public String getEntry() {
		return entry;
	}


	public List<String> getAssocWord() {
		return assocWord;
	}


	public List<String> getAssocWordEx() {
		return assocWordEx;
	}


	public void setEntry(String entry) {
		this.entry = entry;
	}


	public void setAssocWord(List<String> assocWord) {
		this.assocWord = assocWord;
	}


	public void setAssocWordEx(List<String> assocWordEx) {
		this.assocWordEx = assocWordEx;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Association [entry=");
		builder.append(entry);
		builder.append(", assocWord=");
		builder.append(assocWord);
		builder.append(", assocWordEx=");
		builder.append(assocWordEx);
		builder.append("]");
		return builder.toString();
	}


}

