package com.nexapps.nenglish.domain;

import java.io.Serializable;

public class NEnglish implements Serializable {

	private static final long serialVersionUID = 1L;

	private Association association;
	private Definition definition;
	private Example example;
	private Pronunciations pronunciations;
	private Reference reference;
	private Theme theme;
	
	public NEnglish() {
		// TODO Auto-generated constructor stub
	}
	
	public NEnglish(Association association, Definition definition, Example example, Pronunciations pronunciations,
			Reference reference, Theme theme) {
		
		this.association = association;
		this.definition = definition;
		this.example = example;
		this.pronunciations = pronunciations;
		this.reference = reference;
		this.theme = theme;
	}
	
	
	public NEnglish(Association association) {
		
		this.association = association;
	}

	
	public Association getAssociation() {
		return association;
	}

	public Definition getDefinition() {
		return definition;
	}

	public Example getExample() {
		return example;
	}

	public Pronunciations getPronunciations() {
		return pronunciations;
	}

	public Reference getReference() {
		return reference;
	}

	public Theme getTheme() {
		return theme;
	}

	public void setAssociation(Association association) {
		this.association = association;
	}

	public void setDefinition(Definition definition) {
		this.definition = definition;
	}

	public void setExample(Example example) {
		this.example = example;
	}

	public void setPronunciations(Pronunciations pronunciations) {
		this.pronunciations = pronunciations;
	}

	public void setReference(Reference reference) {
		this.reference = reference;
	}

	public void setTheme(Theme theme) {
		this.theme = theme;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NEnglish [association=");
		builder.append(association);
		builder.append(", definition=");
		builder.append(definition);
		builder.append(", example=");
		builder.append(example);
		builder.append(", pronunciations=");
		builder.append(pronunciations);
		builder.append(", reference=");
		builder.append(reference);
		builder.append(", theme=");
		builder.append(theme);
		builder.append("]");
		return builder.toString();
	}

}
