package com.mercadolibre.test.runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/test_backround.feature",
        glue = "com.mercadolibre.main.definitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
        //tags = "@login"
)
public class MercadoLibreRunner {
}
