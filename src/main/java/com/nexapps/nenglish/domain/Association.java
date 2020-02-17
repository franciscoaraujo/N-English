package com.nexapps.nenglish.domain;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class Association implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long id;
	private String entry;
	List<String> listAssocWord;
	
}	

/*
 * 
 * 
 * {
    "entry": "mask",
    "request": "mask",
    "response": "mask",
    "assoc_word": [
        "hide",
        "hat",
        "face"
    ],
    "assoc_word_ex": [
        "hide",
        "hat",
        "face",
        "veil",
        "disguise",
        "camouflage"
    ],
    "version": "4.0.0",
    "author": "twinword inc.",
    "email": "help@twinword.com",
    "result_code": "200",
    "result_msg": "Success"
}
 */