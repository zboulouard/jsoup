package com.jsoup.zakaria.business;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.jsoup.zakaria.dao.Company;

public class Scraper {

	private List<Company> companies;
	private List<String> companyNames;
	private XYZGen xyzGen;

	public Scraper() {
		super();
		this.companyNames = new ArrayList<String>();
		this.companies = new ArrayList<Company>();
		this.xyzGen = new XYZGen();
	}
	
	public void scrapCompanyNames() throws Exception {
		Document doc = Jsoup.connect("http://www.biospace.com/news_subject_all_results.aspx?CatagoryId=40103").get();
		Elements bTags = doc.getElementsByTag("b");
		for (Element bTag : bTags) {
			String name = bTag.text();
			if (!companyNames.contains(name)) {
				companyNames.add(name);
			}
		}
	}
	
	public void createCompanies() {
		for(int i=0; i<companyNames.size(); i++) {
			Company company = new Company();
			company.setName(companyNames.get(i));
			company.setX(xyzGen.genCompanyX());
			company.setY(xyzGen.genCompanyY());
			company.setZ(xyzGen.genCompanyZ());
			companies.add(company);
		}
	}
	
	public List<Company> getCompanies() {
		return companies;
	}

	public void setCompanies(List<Company> companies) {
		this.companies = companies;
	}

	public List<String> getCompanyNames() {
		return companyNames;
	}

	public void setCompanyNames(List<String> companyNames) {
		this.companyNames = companyNames;
	}
	
}
