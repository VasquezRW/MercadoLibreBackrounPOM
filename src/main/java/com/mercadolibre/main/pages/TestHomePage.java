package com.mercadolibre.main.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class TestHomePage extends PageObject {

    @FindBy(xpath = "//body[@data-country='GT']")
    public WebElementFacade textoPais;
}
