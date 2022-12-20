package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;

import com.framework.testng.api.base.ProjectSpecificMethods;

import cucumber.api.CucumberOptions;

@CucumberOptions(features="src/main/java/features",
                 glue="com/leaftaps/pages",
                 monochrome=true)


public class Runner extends ProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "VerifyLogin";
		testDescription ="Verify Login functionality with positive data";
		authors="Vino";
		category ="Smoke";
		
	}
}
