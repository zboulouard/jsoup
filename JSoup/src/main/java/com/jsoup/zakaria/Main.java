package com.jsoup.zakaria;

import com.jsoup.zakaria.business.JSonParser;
import com.jsoup.zakaria.business.Scraper;

public class Main {

	public static void main(String[] args) throws Exception {
		Scraper scraper = new Scraper();
		scraper.scrapCompanyNames();
		scraper.createCompanies();
		JSonParser jSonParser = new JSonParser(scraper);
		String json = jSonParser.parseCompanies();
		System.out.println(json);
	}

}
