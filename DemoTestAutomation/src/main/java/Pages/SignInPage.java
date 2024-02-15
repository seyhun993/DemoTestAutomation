package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class SignInPage {

    public static WebDriver webDriver;

    public SignInPage(WebDriver driver){
        this.webDriver=driver;

        }

    public static void ProductSearch(String text) {
        WebElement search = BaseTest.webDriver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys(text);
    }
  public static void clickButton(){
       WebElement aramaButon = webDriver.findElement(By.id("nav-search-submit-button"));
      aramaButon.click();

    }

   public static void cerezButon(){
        WebElement cerezKabulEt = webDriver.findElement(By.id("sp-cc-accept"));

        if (cerezKabulEt.isDisplayed()==true){
            cerezKabulEt.click();

        }

    }



}




