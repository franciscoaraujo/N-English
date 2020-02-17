package com.nexapps.nenglish.domain;

import java.io.Serializable;
import java.util.List;

public class Association  implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private String entry;
	private List<String> assoc_word;
	private List<String> assoc_word_ex;

	
	public String getEntry() {
		return entry;
	}


	public List<String> getAssoc_word() {
		return assoc_word;
	}

	public List<String> getAssoc_word_ex() {
		return assoc_word_ex;
	}

	

	public void setEntry(String entry) {
		this.entry = entry;
	}


	public void setAssoc_word(List<String> assoc_word) {
		this.assoc_word = assoc_word;
	}

	public void setAssoc_word_ex(List<String> assoc_word_ex) {
		this.assoc_word_ex = assoc_word_ex;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Association [entry=");
		builder.append(entry);
		builder.append(", assoc_word=");
		builder.append(assoc_word);
		builder.append(", assoc_word_ex=");
		builder.append(assoc_word_ex);
		builder.append("]");
		return builder.toString();
	}

	

	

}

/*
 * 
 * 
 * { "entry": "mask", "request": "mask", "response": "mask", "assoc_word": [
 * "hide", "hat", "face" ], "assoc_word_ex": [ "hide", "hat", "face", "veil",
 * "disguise", "camouflage" ], "version": "4.0.0", "author": "twinword inc.",
 * "email": "help@twinword.com", "result_code": "200", "result_msg": "Success" }
 */