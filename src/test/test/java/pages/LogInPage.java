package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LogInPage {
    public LogInPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
//mainpage login
    @FindBy(xpath = "//button[text()='Login']")
    public WebElement buttonLogin;
    //mainpage login
    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement loginLink;
    //mainpage login
    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailBox;
    //mainpage login
    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordBox;
    //mainpage login
    @FindBy(xpath = "(//*[text()='Login'])[2]")
    public WebElement loginButton;








}
