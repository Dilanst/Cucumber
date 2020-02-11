package com.greensqa.challenge.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(	plugin = {"pretty","junit:report/report.xml"},
					features = "src/test/resources",
					glue =	"com.cafeto.challenge.po")

public class RunnerAWSTest {

	
}
