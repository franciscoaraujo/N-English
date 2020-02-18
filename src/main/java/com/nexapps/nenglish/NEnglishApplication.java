package com.nexapps.nenglish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nexapps.nenglish.domain.Association;
import com.nexapps.nenglish.domain.Definition;
import com.nexapps.nenglish.domain.Example;
import com.nexapps.nenglish.domain.Reference;
import com.nexapps.nenglish.domain.Theme;
import com.nexapps.nenglish.service.AssociationService;
import com.nexapps.nenglish.service.DefinitionService;
import com.nexapps.nenglish.service.ExampleService;
import com.nexapps.nenglish.service.ReferenceService;
import com.nexapps.nenglish.service.ThemeService;

@SpringBootApplication
public class NEnglishApplication implements CommandLineRunner {

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

	public static void main(String[] args) {
		SpringApplication.run(NEnglishApplication.class, args);
	}

	private final String strPesquisa = "mask";

	@Override
	public void run(String... args) throws Exception {

		Association association = aService.request(strPesquisa);
		System.out.println(association);

		Definition definition = dService.request(strPesquisa);
		System.out.println(definition);

		Example example = eService.request(strPesquisa);
		System.out.println(example);

		Theme theme = tService.request(strPesquisa);
		System.out.println(theme);

		Reference reference = rService.request(strPesquisa);
		System.out.println(reference);

	}

}
