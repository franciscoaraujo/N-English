package com.nexapps.nenglish.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.nexapps.nenglish.domain.Reference;
import com.squareup.okhttp.Response;

@Service
public class ReferenceService {

	@Value("${url.reference}")
	private String url;

	@Value("${access.twinword.host}")
	private String host;

	@Value("${access.twinword.key}")
	private String key;

	@Autowired
	private Connection conn;

	public Reference request(String uri) throws JsonSyntaxException, IOException {
		Response response = conn.connection(url + uri, host, key);
		Gson gson = new Gson();
		String obj = response.body().string();
		Reference reference = gson.fromJson(obj, Reference.class);
		return reference;
	}
}
