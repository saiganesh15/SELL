package myRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Training_H2a.06.17\\Desktop\\Selenium\\CaseStudies\\Features\\sampleValid.feature",
glue= {"sampleValid"}
//plugin= {"pretty","html:target/casestudy4_report"}
)

public class sampleRunner {

}
