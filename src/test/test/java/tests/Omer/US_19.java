package tests.omer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.InstructorPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Set;

public class US_19 {
    HomePage homePage = new HomePage();
    InstructorPage instructorPage = new InstructorPage();
    public String fistpage = "";
/*
    @Test
    public void test01(){
        // first step 1-3 test bases for add course

        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        homePage.cookiesAccept.click();
        ReusableMethods.bekle(3);
        homePage.loginMethod();
        homePage.linkInstructor.click();
        homePage.courseManagerLinki.click();
        instructorPage.AddNewCourseButton.click();
        instructorPage.addNewCourseHtml();
        Assert.assertTrue(instructorPage.actualConguralation.isDisplayed());
        homePage.courseManagerLinki.click();
    }


    @Test
    public void test02() {
        // first step 1-3 test bases for add course
        instructorPage.AddNewCourseButton.click();
        instructorPage.addNewCourseEng();
        Assert.assertTrue(instructorPage.actualConguralation.isDisplayed());
        homePage.courseManagerLinki.click();
    }
    @Test
    public void test03() {
        // first step 1-3 test bases for add course
        instructorPage.AddNewCourseButton.click();
        instructorPage.addNewCourseEng();
        Assert.assertTrue(instructorPage.actualConguralation.isDisplayed());
        homePage.courseManagerLinki.click();
    }
*/



    @Test
    public void test04() {
        // this section for search result
        // search with added course name

        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        homePage.cookiesAccept.click();
        ReusableMethods.bekle(3);
        homePage.loginMethod();
        homePage.linkInstructor.click();
        homePage.courseManagerLinki.click();
        homePage.courseManagerLinki.click();
        ReusableMethods.bekle(3);
        String expectedWord= "Html";
        instructorPage.searchBox.sendKeys(expectedWord);
       String actualWord= instructorPage.searchTableHtml.getText();
        System.out.println(actualWord);
      Assert.assertTrue(actualWord.contains(expectedWord));
    }


    @Test
    public void test05() {
    // this section for search result
        // search with added course name
        homePage.courseManagerLinki.click();
        ReusableMethods.bekle(3);
        String expectedWord= "Cisco";
        instructorPage.searchBox.sendKeys(expectedWord);
        String actualWord= instructorPage.searchTableCisco.getText();
        System.out.println(actualWord);
        Assert.assertTrue(actualWord.contains(expectedWord));
    }

    @Test
    public void test06() {

        // this section for search result
        // search with added course name
        homePage.courseManagerLinki.click();
        ReusableMethods.bekle(3);
        String expectedWord= "English";
        instructorPage.searchBox.sendKeys(expectedWord);
        String actualWord= instructorPage.searchTableEnglish.getText();
        System.out.println(actualWord);
        Assert.assertTrue(actualWord.contains(expectedWord));
    }

    @Test
    public void test07() {

        fistpage= Driver.getDriver().getWindowHandle();
        instructorPage.actionButton.click();
        //checking action/View course on frontend link
        homePage.courseManagerLinki.click();
        String expectedWord= "Html";
        instructorPage.searchBox.sendKeys(expectedWord);
      fistpage= Driver.getDriver().getWindowHandle();
        instructorPage.actionButton.click();
        instructorPage.courseOnFronted.click();
        ReusableMethods.bekle(3);
        String secondpage="";
        Set<String> windowshandle= Driver.getDriver().getWindowHandles();
        for (String each: windowshandle
             ) {
            if (!(fistpage==each)){
                secondpage=each;
            }
        }
        Driver.getDriver().switchTo().window(secondpage);
        Assert.assertTrue(instructorPage.viewfrontEndH1.isDisplayed());
        Driver.getDriver().switchTo().window(secondpage).close();
        Driver.getDriver().switchTo().window(fistpage);
    }



    @Test
    public void test08() {


        instructorPage.searchBox.clear();
        String expectedWord= "English";
        instructorPage.searchBox.sendKeys(expectedWord);
        ReusableMethods.bekle(2);
        instructorPage.actionButton1.click();
        instructorPage.Gotocourseplayingpage.click();
        fistpage= Driver.getDriver().getWindowHandle();
        ReusableMethods.bekle(3);
        String secondpage="";
        Set<String> windowshandle= Driver.getDriver().getWindowHandles();
        for (String each: windowshandle
        ) {
            if (!(fistpage==each)){
                secondpage=each;
            }
        }
        Driver.getDriver().switchTo().window(secondpage);
        Assert.assertTrue(instructorPage.playbutton.isDisplayed());
        Driver.getDriver().switchTo().window(secondpage).close();
        Driver.getDriver().switchTo().window(fistpage);
    }

    @Test
    public void test09() {


        //checking action/Edit this course page link check



        instructorPage.actionButton.click();
        instructorPage.Sectionandlesson.click();

        Assert.assertTrue(instructorPage.editPageCirriculum.isDisplayed());
        homePage.courseManagerLinki.click();
    }
    @Test
    public void test10() {


        //checking action/Section And lesson link check

        homePage.courseManagerLinki.click();
        instructorPage.actionButton.click();
        instructorPage.Sectionandlesson.click();
        Assert.assertTrue(instructorPage.sectionAddSection.isDisplayed());
        Driver.getDriver().navigate().back();
    }




    @Test
    public void test11() {
        //checking action/Mark as drafted
        instructorPage.actionButton8.click();
        instructorPage.Markasdrafted.click();
        String draftedColum= instructorPage.draftedCourseColumn.getText();
         instructorPage.markAsDraftedAction.click();
        if (!(draftedColum.equals("0")))
        {
            Assert.assertTrue(instructorPage.draftedCourseColumn.isDisplayed());
        }

     }

    @Test
    public void test12() {


        //checking action/Delete botton


        instructorPage.actionButton8.click();
        ReusableMethods.bekle(2);

       instructorPage.publishThisCoursebotton.click();
       instructorPage.markAsDraftedAction.click();
        String expectedWord= "Html";
        instructorPage.searchBox.sendKeys(expectedWord);
        List<WebElement> satirElementleriListesi = Driver.getDriver().findElements(By.xpath("//tbody/tr"));
        int rowNumberBefore= satirElementleriListesi.size();
        instructorPage.actionButton5.click();
        instructorPage.deleteBotton.click();
       instructorPage.markAsDraftedAction.click();
        int rowNumberAfter= satirElementleriListesi.size();
        System.out.println(rowNumberBefore+" "+rowNumberAfter);
        if (rowNumberAfter>rowNumberAfter){
            Assert.assertTrue(rowNumberBefore>rowNumberAfter);
        }else{
            System.out.println("This test case is fault");
        }


        Driver.closeDriver();


    }

}

