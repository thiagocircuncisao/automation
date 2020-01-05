package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver webDriver;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebElement UserName() {
        return webDriver.findElement(By.xpath("//*[@id=\"userName\"]/p[1]/input"));
    }

    public WebElement Password() {
        return webDriver.findElement(By.xpath("//*[@id=\"userName\"]/p[2]/input"));
    }

    public WebElement LoginBt() {
        return webDriver.findElement(By.xpath("//*[@id=\"userName\"]/p[3]/input"));
    }
}
