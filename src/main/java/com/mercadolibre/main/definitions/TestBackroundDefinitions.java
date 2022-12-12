package com.mercadolibre.main.definitions;

import com.mercadolibre.main.steps.TestBackroundSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TestBackroundDefinitions {
    @Steps
    TestBackroundSteps testBackroundSteps;

    @Given("que el usuario ingrese a la pagina web")
    public void queElUsuarioIngreseALaPaginaWeb() {
        testBackroundSteps.openWeb();
    }
    @When("el usuario seleccione el pais")
    public void elUsuarioSeleccioneElPais() {
        testBackroundSteps.seleccionePais();
    }
    @Then("validamos que estemos en la pagina principal {string}")
    public void validamosQueEstemosEnLaPaginaPrincipal(String string) {
        testBackroundSteps.validarPaginaPrincipal(string);
    }
}
