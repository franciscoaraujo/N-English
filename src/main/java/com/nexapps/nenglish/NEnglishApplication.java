package com.nexapps.nenglish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nexapps.nenglish.domain.Association;
import com.nexapps.nenglish.domain.Definition;
import com.nexapps.nenglish.service.AssociationService;
import com.nexapps.nenglish.service.DefinitionService;
import com.nexapps.nenglish.service.ExampleService;

@SpringBootApplication
public class NEnglishApplication implements CommandLineRunner {
	
	@Autowired
	private AssociationService aService;
	@Autowired
	private DefinitionService dService;
	@Autowired
	private ExampleService eService;
	
	public static void main(String[] args) {
		SpringApplication.run(NEnglishApplication.class, args);
	}
	
	private final String strPesquisa = "mask";
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Association association =  aService.request(strPesquisa);
		System.out.println(association);
		
		Definition definition = dService.request(strPesquisa);
		System.out.println(definition);
		
		eService.request(strPesquisa);
		
		
		
	}

}
