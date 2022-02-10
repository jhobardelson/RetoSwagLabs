package co.com.swaglabs.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = "src/test/resources/features/validartotalcompra.feature",
        glue = "co/com/swaglabs/stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class ValidarTotalCompraRunner {
}
