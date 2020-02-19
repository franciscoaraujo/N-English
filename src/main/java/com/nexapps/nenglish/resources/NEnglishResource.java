package com.nexapps.nenglish.resources;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonSyntaxException;
import com.nexapps.nenglish.domain.NEnglish;
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
	
	// /entry/mask
	@RequestMapping(value = "/{word}", method = RequestMethod.GET)
	public NEnglish getRequest(@PathVariable String word) throws JsonSyntaxException, IOException {
		return new NEnglish(aService.request(word), dService.request(word), eService.request(word),
				lService.request(word), rService.request(word), tService.request(word));
	}

}
