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
public class Meaning implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;	
	private String noum;
  	private String verb;
  	private String adverb;
    private String adjective;
    
}
