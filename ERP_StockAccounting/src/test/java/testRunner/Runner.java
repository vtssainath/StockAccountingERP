package testRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"FeatureFiles"},dryRun=true,glue= {"stepDefination"},
plugin= {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:Report/StockAccounting.html"},
tags="@StockCategoryCreation")
public class Runner {

}
