package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UserFormPage {
    private WebDriver webDriver;

    public UserFormPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public Select TitleSelect() {
        return new Select(webDriver.findElement(By.xpath("//*[@id=\"TitleId\"]")));
    }

    public WebElement Initial() {
        return webDriver.findElement(By.xpath("//*[@id=\"Initial\"]"));
    }

    public WebElement FirstName() {
        return webDriver.findElement(By.xpath("//*[@id=\"FirstName\"]"));
    }

    public WebElement MiddleName() {
        return webDriver.findElement(By.xpath("//*[@id=\"MiddleName\"]"));
    }

    public WebElement GenderMale() {
        return webDriver.findElement(By.xpath("//*[@id=\"details\"]/table/tbody/tr[5]/td[2]/input[1]"));
    }

    public WebElement GenderFemale() {
        return webDriver.findElement(By.xpath("//*[@id=\"details\"]/table/tbody/tr[5]/td[2]/input[2]"));
    }

    public WebElement EnglishLanguage() {
        return webDriver.findElement(By.xpath("//*[@id=\"details\"]/table/tbody/tr[6]/td[2]/input[1]"));
    }

    public WebElement HindiLanguage() {
        return webDriver.findElement(By.xpath("//*[@id=\"details\"]/table/tbody/tr[6]/td[2]/input[2]"));
    }

    public WebElement SaveBt() {
        return webDriver.findElement(By.xpath("//*[@id=\"details\"]/table/tbody/tr[7]/td/input"));
    }

    public WebElement GenerateBt() {
        return webDriver.findElement(By.xpath("//*[@id=\"details\"]/div[2]/p/input"));
    }
}
