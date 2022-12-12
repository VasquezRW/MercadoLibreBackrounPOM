package com.mercadolibre.main.pages;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.mercadolibre.com/")
public class TestBackroundPage extends PageObject {
    @FindBy(xpath = "//a[@id='GT']")
    public WebElementFacade pais;

    public void seleccionePais() {
        pais.click();
    }
}
