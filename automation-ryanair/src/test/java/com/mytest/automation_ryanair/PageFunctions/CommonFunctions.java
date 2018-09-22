package com.mytest.automation_ryanair.PageFunctions;

import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;

public class CommonFunctions {

	public String RandomString(int count) {
		// TODO Auto-generated method stub
		return RandomStringUtils.randomAlphabetic(count);
	}

	public String getRandomNumberBetween(int min, int max) {
		Random random = new Random();
		return Integer.toString(random.nextInt(max - min + 1) + min);
	}

	

}
