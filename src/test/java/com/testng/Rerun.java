package com.testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Rerun implements IRetryAnalyzer {

	int min = 1;
	int max =3;
	
	public boolean retry(ITestResult result) {
		
		if (min<=max) {
			min++;
			return true;
		}
		
		return false;
	}

}


