package com.nexapps.nenglish.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.nexapps.nenglish.domain.Definition;
import com.nexapps.nenglish.domain.Example;
import com.squareup.okhttp.Response;

@Service
public class ExampleService {

	@Value("${url.example}")
	private String url;

	@Autowired
	private Connection conn;

	@Value("${access.twinword.host}")
	private String host;
	
	@Value("${access.twinword.key}")
	private String key;
	
	public Example request(String uri) throws JsonSyntaxException, IOException {
		Response response = null;
		try {
			response = conn.connection(url + uri, host, key);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Gson gson = new Gson();
		String obj = response.body().string();
		Example example = (Example) gson.fromJson(obj, Example.class);
		return example;
	}

}
