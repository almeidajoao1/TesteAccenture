package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/preencher_formulario.feature"
        ,glue = { "steps" }
        ,plugin = "pretty"
        ,monochrome = true
        ,snippets = SnippetType.CAMELCASE
        ,dryRun = false
        ,strict = true
)
public class TestRunner {
}
