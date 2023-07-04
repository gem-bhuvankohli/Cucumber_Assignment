package implementations;

import locators.Locators;


import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoImplementation {

    static WebDriver driver = new ChromeDriver();

    public static void openAmazonUrl() {
        try {
            driver.get(Locators.Url);

            driver.manage().window().maximize();
        } catch (Exception e) {
            Assert.fail();
        }
    }


    public static void validateAmazonText() {
        String validateSignInText = driver.findElement(Locators.validateSignInText).getText();
        if (validateSignInText.equals("Hello, sign in")) {
            System.out.println("Web Page Validated");
        } else {
            System.out.println("No Validated");
        }
    }

    public static void validateSearch() {
        String searchResult = driver.findElement(Locators.searchResult).getText();
        if (searchResult.contains("books")) {
            System.out.println("Valid Search for Books");
        } else {
            System.out.println("Invalid");
        }
        driver.close();
    }

    public static void enterValue() {
        try {
            WebElement searchBox = driver.findElement(Locators.searchBox);
            searchBox.sendKeys("books" + Keys.ENTER);
        } catch (Exception e) {
            Assert.fail();
        }
    }
}
