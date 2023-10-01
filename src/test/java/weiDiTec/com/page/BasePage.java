package weiDiTec.com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import weiDiTec.com.utilities.Driver;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//button[text()='Alle zulassen']")
    public WebElement cookies;

    @FindBy(xpath = "(//a[@title='Karriere'])[1]")
    public WebElement karriereButton;
}
