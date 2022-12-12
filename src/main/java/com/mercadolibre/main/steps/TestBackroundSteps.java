package com.mercadolibre.main.steps;

import com.mercadolibre.main.pages.TestBackroundPage;
import com.mercadolibre.main.pages.TestHomePage;
import com.mercadolibre.main.util.GeneralUtil;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBackroundSteps {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestBackroundSteps.class);
    @Page
    TestBackroundPage testBackroundPage;
    TestHomePage testHomePage;
    public void openWeb() {
        testBackroundPage.open();
    }

    public void seleccionePais() {
        testBackroundPage.seleccionePais();
    }

    public void validarPaginaPrincipal(String string) {
        String s = GeneralUtil.formatMessageInformation("validando el login de la aplicacion");
        LOGGER.info(s);
        MatcherAssert.assertThat("se realizo correctamente el login", string.contains(testHomePage.textoPais.getAttribute("data-country")));

    }
}
