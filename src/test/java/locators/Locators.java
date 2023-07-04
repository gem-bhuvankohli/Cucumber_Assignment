package locators;

import org.openqa.selenium.By;

public class Locators {
    public static final String Url = "https://www.amazon.in/";
    public static final By searchBox = By.xpath("//input[@id='twotabsearchtextbox']");
    public static final By searchResult = By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']//descendant::span[@class='a-color-state a-text-bold']");

    public static final By validateSignInText = By.id("nav-link-accountList-nav-line-1");
}
