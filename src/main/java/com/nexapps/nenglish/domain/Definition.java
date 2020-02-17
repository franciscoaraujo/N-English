package com.nexapps.nenglish.domain;

import java.io.Serializable;
import java.util.Map;


public class Definition implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Map<String, String> meaning;
	private String ipa;
	
	public Map<String, String> getMeaning() {
		return meaning;
	}
	public String getIpa() {
		return ipa;
	}
	public void setMeaning(Map<String, String> meaning) {
		this.meaning = meaning;
	}
	public void setIpa(String ipa) {
		this.ipa = ipa;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Definition [meaning=");
		builder.append(meaning);
		builder.append(", ipa=");
		builder.append(ipa);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}

/*
 * { "entry": "mask", "request": "mask", "response": "mask", "meaning": {
 * "noun":
 * "(nou) a covering to disguise or conceal the face\n(nou) activity that tries to conceal something\n(nou) a party of guests wearing costumes and masks\n(nou) a protective covering worn over the face"
 * , "verb":
 * "(vrb) hide under a false appearance\n(vrb) put a mask on or cover with a mask\n(vrb) make unrecognizable\n(vrb) cover with a sauce\n(vrb) shield from light"
 * , "adverb": "", "adjective": "" }, "ipa": "mɑːsk", "version": "4.0.0",
 * "author": "twinword inc.", "email": "help@twinword.com", "result_code":
 * "200", "result_msg": "Success" }
 */
