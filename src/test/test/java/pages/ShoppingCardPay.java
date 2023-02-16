package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

public class ShoppingCardPay {
    Actions actions=new Actions(Driver.getDriver());

    @FindBy(xpath = "//input[@name='email']")
    public WebElement payEmailBox;

    @FindBy(xpath = "//div[@class='SubmitButton-IconContainer']")
    public static WebElement payButton;
// card ile ödeme metodu -kurs alımlarında kullanilacak
    public void payWithCard(){
        actions.sendKeys(payEmailBox,"anevzatcelik@gmail.com")
                .sendKeys(Keys.TAB).sendKeys("4242424242424242")
                .sendKeys(Keys.TAB).sendKeys("1124")
                .sendKeys(Keys.TAB).sendKeys("325")
                .sendKeys(Keys.TAB).sendKeys("ahmet").click(payButton).perform();
    }
}
