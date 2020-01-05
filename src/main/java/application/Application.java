package application;

import scripts.LoginAndFill;
import org.openqa.selenium.chrome.ChromeDriver;
import scripts.Script;

public class Application {
    public static void main(String[] args) {
        Script loginAndFill = new LoginAndFill(new ChromeDriver(), "http://www.executeautomation.com/demosite/Login.html");
        loginAndFill.init();
        loginAndFill.runTest();
        loginAndFill.stop();
    }
}
