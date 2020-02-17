package com.nexapps.nenglish.domain;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Relation implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String broadTerms;
	private String narrowTerms;
	private String relatedTerms;
	private String evocations;
	private String synonyms;
	private String associations;
	private String derivedTerms;
	
}
