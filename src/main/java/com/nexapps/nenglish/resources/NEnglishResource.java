package com.nexapps.nenglish.resources;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonSyntaxException;
import com.nexapps.nenglish.domain.Association;
import com.nexapps.nenglish.domain.Example;
import com.nexapps.nenglish.domain.NEnglish;
import com.nexapps.nenglish.domain.Pronunciations;
import com.nexapps.nenglish.domain.Reference;
import com.nexapps.nenglish.domain.Theme;
import com.nexapps.nenglish.service.AssociationService;
import com.nexapps.nenglish.service.DefinitionService;
import com.nexapps.nenglish.service.ExampleService;
import com.nexapps.nenglish.service.LinguaRobotService;
import com.nexapps.nenglish.service.ReferenceService;
import com.nexapps.nenglish.service.ThemeService;

@RestController
@RequestMapping(value = "/entry")
public class NEnglishResource {

	@Autowired
	private AssociationService aService;

	@Autowired
	private DefinitionService dService;

	@Autowired
	private ExampleService eService;

	@Autowired
	private ThemeService tService;

	@Autowired
	private ReferenceService rService;

	@Autowired
	private LinguaRobotService lService;

	@RequestMapping(value = "/{word}", method = RequestMethod.GET)
	public ResponseEntity<NEnglish> getRequest(@PathVariable(value = "word") String word)
			throws JsonSyntaxException, IOException {
		NEnglish nEnglish = new NEnglish();

		Association assoc = aService.request(word);
		Example exm = eService.request(word);
		Pronunciations pronum = lService.request(word);
		Reference ref = rService.request(word);
		Theme theme = tService.request(word);
		
		nEnglish.setAssociation(assoc);
		nEnglish.setExample(exm);
		nEnglish.setPronunciations(pronum);
		nEnglish.setReference(ref);
		nEnglish.setTheme(theme);
		return new ResponseEntity<NEnglish>(nEnglish, HttpStatus.OK);
	}

}
