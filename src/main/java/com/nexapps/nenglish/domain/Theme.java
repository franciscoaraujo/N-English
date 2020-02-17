package com.nexapps.nenglish.domain;

import java.io.Serializable;
import java.util.List;

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
public class Theme implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String entry;
	private List<String>theme;
	
}
