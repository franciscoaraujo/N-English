package com.nexapps.nenglish.service;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

@Service
public class Connection {
	
	public  Response connection(String url, String host, String key) throws IOException {
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder()
		  .url(url)
		  .get()
		  .addHeader("x-rapidapi-host", host)
		  .addHeader("x-rapidapi-key",key)
		  .build();
		return client.newCall(request).execute();
	}
}
