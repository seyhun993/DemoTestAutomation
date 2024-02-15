package Test;

import Pages.BaseTest;
import Pages.SignInPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SignInTest extends BaseTest {

  @Test
    public void TC001(){

        SignInPage signInPage = new SignInPage(webDriver);
        SignInPage.cerezButon();
        SignInPage.ProductSearch("telefon");
        SignInPage.clickButton();









    }


}
