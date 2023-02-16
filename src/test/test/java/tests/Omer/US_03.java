package tests.omer;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_03 {
    HomePage homePage=new HomePage();

    @Test
    public void test01(){
        //US-03 TC_01 facebook iconun gorunurluk testi

        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        homePage.cookiesAccept.click();
        homePage.pagedown.sendKeys(Keys.END);
        Assert.assertTrue(homePage.facebookIcon.isDisplayed());
    }
    @Test
    public void test02(){
        //US-03 TC_02 twitter iconun gorunurluk testi
        ReusableMethods.bekle(5);
        Assert.assertTrue(homePage.twitterIcon.isDisplayed());

    }
    @Test
    public void test03(){
        //US-03 TC_03 linkedin iconun gorunurluk testi
        ReusableMethods.bekle(5);
        Assert.assertTrue(homePage.linkedinIcon.isDisplayed());

    }

    @Test
    public void test04(){
        //US-03 TC_04 facebook iconun click olma ve site yonlendirme testi
        ReusableMethods.bekle(3);
        homePage.pagedown.sendKeys(Keys.END);
        homePage.facebookIcon.click();
        String expectedWord= "Facebook";
        String actualWord= Driver.getDriver().getTitle();
        Assert.assertTrue(actualWord.contains(expectedWord));
        ReusableMethods.bekle(3);
        Driver.getDriver().navigate().back();


    }
    @Test
    public void test05(){
        //US-03 TC_05 Twitter iconun click olma testi ve site yonlendirme testi

        ReusableMethods.bekle(3);
        homePage.pagedown.sendKeys(Keys.END);
        homePage.pagedown.sendKeys(Keys.END);
        ReusableMethods.bekle(5);
        homePage.twitterIcon.click();
        String expectedWord= "Twitter";
        String actualWord= Driver.getDriver().getTitle();
        Assert.assertTrue(actualWord.contains(expectedWord));
        ReusableMethods.bekle(3);
        Driver.getDriver().navigate().back();

    }

    @Test
    public void test06(){
        //US-03 TC_06 Linkedin iconun click olma testi ve site yonlendirme testi
        ReusableMethods.bekle(3);
        homePage.pagedown.sendKeys(Keys.END);
        homePage.pagedown.sendKeys(Keys.END);
        ReusableMethods.bekle(3);
        homePage.pagedown.sendKeys(Keys.END);
        homePage.linkedinIcon.click();
        String expectedWord= "LinkedIn";
        String actualWord= Driver.getDriver().getTitle();
        Assert.assertTrue(actualWord.contains(expectedWord));
        ReusableMethods.bekle(3);
        Driver.closeDriver();
    }




}
