package com.jsoup.zakaria.business;

import java.util.Random;

import com.jsoup.zakaria.dao.Company;

public class XYZGen {

	private Company company;

	public XYZGen() {
		super();
	}
	
	public Integer genCompanyX() {
		Integer randomNum = 0;
		Random rand = new Random();
		randomNum = 100 + rand.nextInt((999 - 100) + 1);
		return randomNum;
	}
	
	public Integer genCompanyY() {
		Integer randomNum = 0;
		Random rand = new Random();
		randomNum = 100 + rand.nextInt((999 - 100) + 1);
		return randomNum;
	}
	
	public Integer genCompanyZ() {
		Integer randomNum = 0;
		Random rand = new Random();
		randomNum = 100 + rand.nextInt((999 - 100) + 1);
		return randomNum;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
}
