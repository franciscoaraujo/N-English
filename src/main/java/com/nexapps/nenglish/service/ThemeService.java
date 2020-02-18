package com.nexapps.nenglish.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.nexapps.nenglish.domain.Theme;
import com.squareup.okhttp.Response;

@Service
public class ThemeService {

	@Value("${url.theme}")
	private String url;

	@Value("${access.twinword.host}")
	private String host;

	@Value("${access.twinword.key}")
	private String key;

	@Autowired
	private Connection conn;

	public Theme request(String uri) throws JsonSyntaxException, IOException {
		Response response = conn.connection(url + uri, host, key);
		Gson gson = new Gson();
		String obj = response.body().string();
		Theme theme = (Theme) gson.fromJson(obj, Theme.class);
		return theme;
	}
	
}
