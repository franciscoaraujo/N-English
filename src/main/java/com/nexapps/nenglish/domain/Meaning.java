package com.nexapps.nenglish.domain;

import java.io.Serializable;


public class Meaning implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String noum;
  	private String verb;
  	private String adverb;
    private String adjective;
    
    public Meaning() {
		// TODO Auto-generated constructor stub
	}
	
    public String getNoum() {
		return noum;
	}
	public String getVerb() {
		return verb;
	}
	public String getAdverb() {
		return adverb;
	}
	public String getAdjective() {
		return adjective;
	}
	public void setNoum(String noum) {
		this.noum = noum;
	}
	public void setVerb(String verb) {
		this.verb = verb;
	}
	public void setAdverb(String adverb) {
		this.adverb = adverb;
	}
	public void setAdjective(String adjective) {
		this.adjective = adjective;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Meaning [noum=");
		builder.append(noum);
		builder.append(", verb=");
		builder.append(verb);
		builder.append(", adverb=");
		builder.append(adverb);
		builder.append(", adjective=");
		builder.append(adjective);
		builder.append("]");
		return builder.toString();
	}
    
	
    
}
