package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class SignInPage {

    public static WebDriver webDriver;

    public SignInPage(WebDriver driver) {
        this.webDriver = driver;

    }

    public static void ProductSearch(String text) {
        WebElement search = BaseTest.webDriver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys(text);
    }

    public static void clickButton() {
        WebElement aramaButon = webDriver.findElement(By.id("nav-search-submit-button"));
        aramaButon.click();

    }

    public static void cerezButon() {
        WebElement cerezKabulEt = webDriver.findElement(By.id("sp-cc-accept"));

        if (cerezKabulEt.isDisplayed() == true) {
            cerezKabulEt.click();
        }
    }


    public static void clickOnProductDescription() {
        WebElement clickProduct = webDriver.findElement(By.cssSelector("div._bXVsd_gridColumn_2Jfab:nth-child(1) > div:nth-child(1) > div:nth-child(3) > a:nth-child(1) > span:nth-child(1) > span:nth-child(2)"));
        clickProduct.click();

    }
    public static SignInPage checkProductDescriptionText(String actualText){
    String expectedText= webDriver.findElement(By.id("productTitle")).getText();
    Assert.assertEquals(actualText, expectedText);
    System.out.println(expectedText);
    return null;
    }

    public static void addToCart() {
        WebElement addToCartButton = webDriver.findElement(By.cssSelector("#add-to-cart-button"));
        addToCartButton.click();
    }

    public static SignInPage checkProductAddedTex(String actualText) {
        String expectedText = webDriver.findElement(By.cssSelector(".a-size-medium-plus")).getText();
        Assert.assertEquals(actualText, expectedText);
        System.out.println(expectedText);
        return null;
    }

    public static void goToCart() {
        WebElement goToCartButton = webDriver.findElement(By.cssSelector("#sw-gtc > span:nth-child(1) > a:nth-child(1)"));
        goToCartButton.click();

    }
    public static SignInPage checkAlisverisSepeti(String actualText) {
        String expectedText = webDriver.findElement(By.cssSelector(".sc-cart-header > div:nth-child(1) > h1:nth-child(1)")).getText();
        Assert.assertEquals(actualText, expectedText);
        System.out.println(expectedText);
        return null;
    }


}







