package com.nexapps.nenglish.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.nexapps.nenglish.domain.Association;
import com.squareup.okhttp.Response;

@Service
public class AssociationService {
	
	@Value("${url.association}")
	private String url;
	
	@Value("${access.twinword.host}")
	private String host;
	
	@Value("${access.twinword.key}")
	private String key;
	
	@Autowired
	private Connection conn;
	
	public Association request(String uri) throws JsonSyntaxException, IOException {
		Response response = conn.connection(url + uri, host, key);
		Gson gson = new Gson();
		String obj = response.body().string();
		Association association = (Association) gson.fromJson(obj, Association.class);
		return association;
	}

}
