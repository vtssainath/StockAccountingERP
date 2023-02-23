package testRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"FeatureFiles"},dryRun=false,glue= {"stepDefination"},
plugin= {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:Report/StockAccounting.html"},
tags="@Customer")
public class Runner {

}

