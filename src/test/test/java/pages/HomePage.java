package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
Actions actions= new Actions(Driver.getDriver());
    @FindBy(xpath = "//*[text()='Accept']")
    private WebElement cookies;
    @FindBy (xpath = "//*[text()='Accept']")
    public WebElement cookieAccept;
    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement linkilkLogin;

    @FindBy(xpath = "//a[text()='Log in']")
    private WebElement loginLink;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailBox;
    @FindBy (xpath = "//*[@id='login-email']")
    public WebElement emailkutusu;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordBox;

    @FindBy(xpath = "(//*[text()='Login'])[2]")
    private WebElement loginButton;



//ömer locateler


    //homepage facebook icon
    @FindBy(xpath = "//*[@class='fab fa-facebook-f']")
    public WebElement facebookIcon;

    //homepage twitter icon
    @FindBy(xpath = "//*[@class='fab fa-twitter']")
    public WebElement twitterIcon;
    //homepage linkedin icon
    @FindBy(xpath = "//*[@class='fab fa-linkedin']")
    public WebElement linkedinIcon;

    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement ilkLoginLinki;

    @FindBy(id="login-email")
    public WebElement userMailBox;

    @FindBy(id="login-password")
    public WebElement userPasswordBox;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButon;

    @FindBy(linkText = "My courses")
    public WebElement basariliGirisCoursesLinki;

    @FindBy(xpath = "//a[text()='Accept']")
    public WebElement cookiesAccept;
    @FindBy(xpath = "//button[text()='Search ']")
    public WebElement pagedown;

    public void loginMethod(){
        ilkLoginLinki.click();
        userMailBox.sendKeys(ConfigReader.getProperty("qdInstUser"));
        userPasswordBox.sendKeys(ConfigReader.getProperty("qdInstPassword"));
        loginButton.click();
    }

//




    @FindBy(xpath = "//*[text()='Categories']")
    public WebElement categories;
    @FindBy(xpath = "//*[@class='fw-500']")
    public WebElement catagorie;

    @FindBy(xpath = "//a[normalize-space()='Instructor']")
    public WebElement linkInstructor;

    @FindBy(xpath = "//*[text()='My courses']")
    public WebElement linkMyCourses;







    public void loginMethodu(){
        cookies.click();
        loginLink.click();
        emailBox.sendKeys(ConfigReader.getProperty("qdInstUser"));
        passwordBox.sendKeys(ConfigReader.getProperty("qdInstPassword"));
        loginButton.click();
    }


    // **********add new course locates***********
    //coursemanagerpage
    @FindBy(xpath = "//a[text()='Add new course']")
    public WebElement AddNewCourseButton;
    @FindBy(xpath = "//span[@data-select2-id='1']")
    public WebElement selectCategory;


    // instrcutor/course manager
    @FindBy(xpath = "//*[text()='Course manager']")
    public WebElement courseManagerLinki;

    @FindBy(id ="course_title")
    public WebElement basicCourseTitle;
    //add course forwardbutton
    @FindBy(xpath = "//a[@class='btn btn-info']")
    public WebElement forwardButton;


    // **********add new course locates***********
    // Add new course method

  public void addNewCourseHtml(){
        actions.sendKeys(basicCourseTitle,"Html")
                .sendKeys(Keys.TAB+"Learn Html")
                .sendKeys(Keys.TAB+"Tags Html").perform();

        forwardButton.click();

    }














}
