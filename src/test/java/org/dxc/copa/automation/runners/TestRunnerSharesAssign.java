package org.dxc.copa.automation.runners;

import io.cucumber.testng.CucumberOptions;
import org.dxc.copa.automation.base.TestBase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.cucumber.testng.CucumberOptions.SnippetType.CAMELCASE;

@CucumberOptions(
        features = "src\\test\\resources\\features\\UAT",
        glue = {"org.dxc.copa.automation.stepDefinitions"},
        tags = "@IcouponAssign",
//        tags = "@UATPrinter",   @IcouponAssign  @IcouponUnAssign
        monochrome = true,
        //for step definitions validation check
        dryRun = false,
        //code snippets format
        snippets = CAMELCASE,
        plugin = {
                "pretty",
                "summary",
                "html:target/cucumber-reports/cucumber-report.html",
                "json:target/cucumber-reports/cucumber-report.json",
                "rerun:target2/failedrerun.txt",
        }
)

@Test
public class TestRunnerSharesAssign extends TestBase {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
