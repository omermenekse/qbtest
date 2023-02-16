package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class InstructorPage {

    public InstructorPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    Actions actions= new Actions(Driver.getDriver());



// instrcutor/course manager
    @FindBy(xpath = "//*[text()='Course manager']")
    public WebElement courseManagerLinki;




    // **********add new course locates***********
    // Add new course method
    //


    @FindBy(xpath = "//input[@id='course_overview_url']")
    public WebElement youtube;

    @FindBy(xpath = "(//input[@placeholder='Write a keyword and then press enter button'])[2]")
    public WebElement seo ;
    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submit;
    @FindBy(xpath = "//h2[text()='Congratulations!']")
    public WebElement actualConguralation;

  public void addNewCourseHtml(){
        actions.sendKeys(basicCourseTitle,"Html")
                .sendKeys(Keys.TAB+"Learn Html")
                .sendKeys(Keys.TAB+"Tags Html").perform();
        WebElement select1= Driver.getDriver().findElement(By.xpath("//select[@id='sub_category_id']"));
      Select select= new Select(select1);
      select.selectByValue("6");
      forwardButton.click();
     requirment.sendKeys("i5 computer");
      forwardButton.click();
      outcomes.sendKeys("Html");
      forwardButton.click();
      price.sendKeys("100");
      forwardButton.click();
      youtube.sendKeys("https://www.youtube.com/watch?v=nLCveeY8CAE");
      forwardButton.click();
      seo.sendKeys("html");
      forwardButton.click();
      submit.click();
    }

    public void addNewCourseEng(){
        actions.sendKeys(basicCourseTitle,"English Course")
                .sendKeys(Keys.TAB+"Learn English")
                .sendKeys(Keys.TAB+"Native English").perform();
        WebElement select1= Driver.getDriver().findElement(By.xpath("//select[@id='sub_category_id']"));
        Select select= new Select(select1);
        select.selectByVisibleText("English Speaking Course");
        forwardButton.click();
        requirment.sendKeys("i5 computer");
        forwardButton.click();
        outcomes.sendKeys("English");
        forwardButton.click();
        price.sendKeys("100");
        forwardButton.click();
        youtube.sendKeys("https://www.youtube.com/watch?v=IZpja7SFRus");
        forwardButton.click();
        seo.sendKeys("English course");
        forwardButton.click();
        submit.click();
    }

    public void addNewCourseCisco(){
        actions.sendKeys(basicCourseTitle,"Cisco Course")
                .sendKeys(Keys.TAB+"Learn cisco")
                .sendKeys(Keys.TAB+"Cisco ").perform();
        WebElement select1= Driver.getDriver().findElement(By.xpath("//select[@id='sub_category_id']"));
        Select select= new Select(select1);
        select.selectByVisibleText("Cisco Course");
        forwardButton.click();
        requirment.sendKeys("i5 computer");
        forwardButton.click();
        outcomes.sendKeys("Cisco");
        forwardButton.click();
        price.sendKeys("100");
        forwardButton.click();
        youtube.sendKeys("https://www.youtube.com/watch?v=9mZdMgAecdI");
        forwardButton.click();
        seo.sendKeys("Cisco course");
        forwardButton.click();
        submit.click();
    }

    //coursemanagerpage
    @FindBy(xpath = "//a[text()='Add new course']")
    public WebElement AddNewCourseButton;

    //coursemanagerpage/basic
    @FindBy(id ="course_title")
    public WebElement basicCourseTitle;
    //add course forwardbutton
    @FindBy(xpath = "(//a[@class='btn btn-info'])[2]")
    public WebElement forwardButton;
    //coursemanagerpage/requirment
    @FindBy(xpath ="//input[@name='requirements[]']" )
    public WebElement requirment;
    //coursemanagerpage/outcomes
    @FindBy(xpath ="(//input[@id='outcomes'])[1]")
    public WebElement outcomes;

    //coursemanagerpage/pricing
    @FindBy(xpath = "//input[@id='price']")
    public WebElement price;
    //coursemanagerpage/media

    @FindBy(xpath = "(//a[@ class='nav-link rounded-0 pt-2 pb-2'])[4]")
    public WebElement mediaLinki;
    //coursemanagerpage/seo
    //ilker
    //coursemanagerpage/finish
    //ömer



    @FindBy(xpath = "//*[text()='Add new course']")
    public WebElement AddnewcourseLinki;



    @FindBy(xpath = "(//*[@class='col-md-2 col-form-label'])[12]")

    public WebElement CourseQverviewProviderLinki;

    @FindBy(xpath = "//input[@ name='course_overview_url']")
    public WebElement CourseQverviewUrlLinki;

    @FindBy (xpath = "//input[@ name='course_thumbnail' ]")
    public WebElement coursethumbnailLinki;




    @FindBy (xpath = "//h2[text()='Congratulations!']")
    public WebElement Congratulations;
    //coursemanager/
    // action button
    @FindBy (xpath = "(//i[@class='mdi mdi-dots-vertical'])[4]")
    public WebElement actionButton;
    // action button1
    @FindBy (xpath = "(//i[@class='mdi mdi-dots-vertical'])[1]")
    public WebElement actionButton1;

    // action button1
    @FindBy (xpath = "(//i[@class='mdi mdi-dots-vertical'])[8]")
    public WebElement actionButton8;

    // action button5
    @FindBy (xpath = "(//i[@class='mdi mdi-dots-vertical'])[5]")
    public WebElement actionButton5;
    //coursemanager/
    //View course on fronted
    @FindBy (xpath = "(//a[text()='View course on frontend'])[4]")
    public WebElement courseOnFronted;

    //coursemanager/
    //Go to course playing page
    @FindBy (xpath = "(//a[text()='Go to course playing page'])[1]")
    public WebElement Gotocourseplayingpage;
    //coursemanager/
    //EditThisCourse
    @FindBy (xpath = "(//a[text()='Edit this course'])[4]")
    public WebElement EditThisCourse;
    //coursemanager/
    //Section and lesson
    @FindBy (xpath = "(//a[text()='Section and lesson'])[4]")
    public WebElement Sectionandlesson;


    //Mark as drafted
    @FindBy (xpath = "(//a[text()='Mark as drafted'])[8]")
    public WebElement Markasdrafted;

    //Delete
    @FindBy (xpath = "(//a[text()='Delete'])[5]")
    public WebElement deleteBotton;

    //search
    @FindBy (xpath = "//input[@class='form-control form-control-sm']")
    public WebElement searchBox;

//added course search from search box than result contains same course name
@FindBy (xpath = "//tbody/tr[3]/td[2]")
public WebElement searchTableHtml;
    //added course search from search box than result contains same course name
    @FindBy (xpath = "//tbody/tr[2]/td[2]")
    public WebElement searchTableCisco;


    //added course search from search box than result contains same course name
    @FindBy (xpath = "//tbody/tr[1]/td[2]")
    public WebElement searchTableEnglish;


    // view fronted h1
   // @FindBy(xpath = "//h1[@class='title']")
    @FindBy(xpath = "//span[@class='play-btn']")
    public WebElement viewfrontEndH1;

//coursemanager/go to the course plaiyng click
    @FindBy(xpath = "//button[@class='plyr__control']")
    public WebElement playbutton;

    //coursemanager/edit this course link
    @FindBy(xpath = "//span[@class='d-none d-sm-inline']")
    public WebElement editPageCirriculum;

    //coursemanager/Section and lesson
    @FindBy(xpath = "//a[@class='btn btn-outline-primary btn-rounded btn-sm ml-1']")
    public WebElement sectionAddSection;

    //coursemanager/Mark as Drafted
    @FindBy(xpath = "(//a[text()='Continue'])[1]")
    public WebElement markAsDraftedAction;

    //coursemanager/Publish this course
    @FindBy(xpath = "//a[text()='Publish this course']")
    public WebElement publishThisCoursebotton;

    //coursemanager/DraftedCourse column
    @FindBy(xpath = "//span[text()='0']")
    public WebElement draftedCourseColumn;


    //coursemanager/pageDwon
    @FindBy(xpath = "//label[text()='Show ']")
    public WebElement pageDown;


    //tbody

}








