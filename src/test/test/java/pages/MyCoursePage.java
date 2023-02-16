package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MyCoursePage {
    public MyCoursePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    MyCoursePage myCoursePage=new MyCoursePage();
    @FindBy(xpath = "//*[text()='My courses']")
    public WebElement mycourses;

    @FindBy(xpath = "//a[@href='https://qa.qualitydemy.com/home/my_wishlist']")
    public WebElement linkWishlists;
    @FindBy(xpath = "//a[@class='btn bg-background']")
    public WebElement ResetLink;

    @FindBy(xpath = "//a[@ class='btn bg-background dropdown-toggle']")
    public WebElement CategoryElementi;

    @FindBy (xpath = "//a[@ id='edit_rating_btn_1']")
    public WebElement EditRating;

    @FindBy(xpath = "//select[@ id='star_rating_of_course_1']")
    public WebElement StarRating;

    @FindBy(xpath ="//*[@ id='review_of_a_course_1']" )
    public WebElement ReviewBox;

    @FindBy (xpath = "//a[text()='Start lesson']")
    public WebElement StartLesson;

    @FindBy(xpath = "//button [@ class='plyr__control plyr__control--overlaid' ]")
    public WebElement PlaySwitch;

}
