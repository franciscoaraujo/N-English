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
public class Definition implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String entry;
	private List<Meaning> listMeaning;
}

/*
 * {
    "entry": "mask",
    "request": "mask",
    "response": "mask",
    "meaning": {
        "noun": "(nou) a covering to disguise or conceal the face\n(nou) activity that tries to conceal something\n(nou) a party of guests wearing costumes and masks\n(nou) a protective covering worn over the face",
        "verb": "(vrb) hide under a false appearance\n(vrb) put a mask on or cover with a mask\n(vrb) make unrecognizable\n(vrb) cover with a sauce\n(vrb) shield from light",
        "adverb": "",
        "adjective": ""
    },
    "ipa": "mɑːsk",
    "version": "4.0.0",
    "author": "twinword inc.",
    "email": "help@twinword.com",
    "result_code": "200",
    "result_msg": "Success"
}
 */
