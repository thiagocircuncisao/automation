package scripts;

import pageobjects.LoginPage;
import pageobjects.UserFormPage;
import org.openqa.selenium.*;

public class LoginAndFill implements Script {

    private WebDriver webDriver;
    private String address;
    private LoginPage loginPage;
    private UserFormPage userFormPage;

    public LoginAndFill(WebDriver webDriver, String address) {
        this.webDriver = webDriver;
        this.address = address;
    }

    public void init() {
        this.webDriver.get(this.address);
        this.webDriver.manage().window().maximize();
        this.loginPage = new LoginPage(this.webDriver);
        this.userFormPage = new UserFormPage(this.webDriver);
    }

    public void stop() {
        this.webDriver.close();
    }

    public void runTest() {
        // Login page
        fill_username();
        fill_password();
        click_login_bt();

        // User form page
        select_mr_title();
        fill_initial_w_rat();
        fill_first_name();
        fill_middle_name();
        change_gender_to_female();
        change_languages_to_only_hindi();
        click_on_save_bt();
        click_on_generate_bt();
        click_on_ok_of_both_javascript_alerts();
    }

    private void fill_username() throws NoSuchElementException, IllegalArgumentException {
        loginPage.UserName().sendKeys("userTest");
    }

    private void fill_password() throws NoSuchElementException, IllegalArgumentException {
        loginPage.Password().sendKeys("pwTest");
    }

    private void click_login_bt() throws NoSuchElementException, StaleElementReferenceException {
        loginPage.LoginBt().click();
    }

    private void select_mr_title() throws NoSuchElementException {
        userFormPage.TitleSelect().selectByIndex(0);
    }

    private void fill_initial_w_rat() throws NoSuchElementException, IllegalArgumentException {
        userFormPage.Initial().sendKeys("RAT");
    }

    private void fill_first_name() throws NoSuchElementException, IllegalArgumentException {
        userFormPage.FirstName().sendKeys("Thiago");
    }

    private void fill_middle_name() throws NoSuchElementException, IllegalArgumentException {
        userFormPage.MiddleName().sendKeys("Almeida");
    }

    private void change_gender_to_female() throws NoSuchElementException, StaleElementReferenceException {
        userFormPage.GenderFemale().click();
    }

    private void change_languages_to_only_hindi() throws NoSuchElementException, StaleElementReferenceException {
        userFormPage.EnglishLanguage().click();
        userFormPage.HindiLanguage().click();
    }

    private void click_on_save_bt() throws NoSuchElementException, StaleElementReferenceException {
        userFormPage.SaveBt().click();
    }

    private void click_on_generate_bt() throws NoSuchElementException, StaleElementReferenceException{
        userFormPage.GenerateBt().click();
    }

    private void click_on_ok_of_both_javascript_alerts() throws NoAlertPresentException {
        Alert alert = webDriver.switchTo().alert();
        alert.accept();
        alert.accept();
    }
}
