package Test;

import Pages.BaseTest;
import Pages.SignInPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SignInTest extends BaseTest {

    @Test
    public void TC001() {

        SignInPage signInPage = new SignInPage(webDriver);
        SignInPage.cerezButon();
        SignInPage.ProductSearch("Samsung Galaxy S23 Ultra 256 GB | 8 GB RAM Cep Telefonu, Green (Samsung Türkiye Garantili");
        SignInPage.clickButton();
        SignInPage.clickOnProductDescription();
        SignInPage.checkProductDescriptionText("Samsung Galaxy S23 Ultra 256 GB | 8 GB RAM Cep Telefonu, Green (Samsung Türkiye Garantili) ");
        SignInPage.addToCart();
        SignInPage.checkProductAddedTex("Sepete Eklendi");
        SignInPage.goToCart();

    }

    @Test
    public void TC002() {

        SignInPage signInPage = new SignInPage(webDriver);
        SignInPage.cerezButon();
        SignInPage.ProductSearch("Samsung Galaxy S23 Ultra 256 GB | 8 GB RAM Cep Telefonu, Green (Samsung Türkiye Garantili");
        SignInPage.clickButton();
        SignInPage.clickOnProductDescription();
        SignInPage.addToCart();
        SignInPage.checkProductAddedTex("Sepete Eklendi");
    }
    @Test
    public void TC003() {

        SignInPage signInPage = new SignInPage(webDriver);
        SignInPage.cerezButon();
        SignInPage.ProductSearch("Samsung Galaxy S23 Ultra 256 GB | 8 GB RAM Cep Telefonu, Green (Samsung Türkiye Garantili");
        SignInPage.clickButton();
        SignInPage.clickOnProductDescription();
        SignInPage.addToCart();
        SignInPage.goToCart();
        SignInPage.checkAlisverisSepeti("Alışveriş Sepeti");


    }


}





