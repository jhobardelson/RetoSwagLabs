package co.com.swaglabs.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/comprarproducto.feature",
        glue = "co/com/swaglabs/stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class RealizarCompraRunner {
}
