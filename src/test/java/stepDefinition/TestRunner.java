package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue={"stepDefinition"},
monochrome =true,
plugin ={"pretty","junit:target/JUnitReport/report.xml",
		"json:target/JSONReport/report.json",
		"html:target/HtmlReport/index.html"},
tags="@SmokeTest"
)
public class TestRunner {

}
