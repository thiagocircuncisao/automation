import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SeleniumFirstScript {
    public static void main(String[] args) {
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();

        chromeDriver.get("http://www.executeautomation.com/demosite/Login.html");
        chromeDriver.findElement(By.xpath("//*[@id=\"userName\"]/p[1]/input")).sendKeys("userTest");
        chromeDriver.findElement(By.xpath("//*[@id=\"userName\"]/p[2]/input")).sendKeys("pwTest");
        chromeDriver.findElement(By.xpath("//*[@id=\"userName\"]/p[3]/input")).click();

        Select title = new Select(chromeDriver.findElement(By.xpath("//*[@id=\"TitleId\"]")));
        title.selectByIndex(0);

        chromeDriver.findElement(By.xpath("//*[@id=\"Initial\"]")).sendKeys("RAT");
        chromeDriver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Thiago");
        chromeDriver.findElement(By.xpath("//*[@id=\"MiddleName\"]")).sendKeys("Almeida");

        chromeDriver.findElement(By.xpath("//*[@id=\"details\"]/table/tbody/tr[5]/td[2]/input[2]")).click();
        chromeDriver.findElement(By.xpath("//*[@id=\"details\"]/table/tbody/tr[6]/td[2]/input[1]")).click();
        chromeDriver.findElement(By.xpath("//*[@id=\"details\"]/table/tbody/tr[6]/td[2]/input[2]")).click();

        chromeDriver.findElement(By.xpath("//*[@id=\"details\"]/table/tbody/tr[7]/td/input")).click();
        chromeDriver.findElement(By.xpath("//*[@id=\"details\"]/div[2]/p/input")).click();

        Alert alert = chromeDriver.switchTo().alert();
        alert.accept();
        alert.accept();

        chromeDriver.close();
    }
}
