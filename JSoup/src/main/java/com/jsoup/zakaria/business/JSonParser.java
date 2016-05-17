package com.jsoup.zakaria.business;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.jsoup.zakaria.dao.Company;

public class JSonParser {
	
	private Scraper scraper;

	public JSonParser() {
		super();
	}

	public JSonParser(Scraper scraper) {
		super();
		this.scraper = scraper;
	}

	public String parseCompanies() {
		List<Company> companies = scraper.getCompanies();
		String json = new Gson().toJson(companies);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		JsonParser jp = new JsonParser();
		JsonElement je = jp.parse(json);
		String prettyJsonString = gson.toJson(je);
		return prettyJsonString;
	}
	
}
