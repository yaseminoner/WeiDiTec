package weiDiTec.com.stepDefs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import weiDiTec.com.page.BasePage;
import weiDiTec.com.utilities.BrowserUtils;
import weiDiTec.com.utilities.ConfigurationReader;
import weiDiTec.com.utilities.Driver;

public class Karriere_StepDefs extends BasePage {

    BasePage basePage = new BasePage();

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Given("User is on the WeiDiTec home page")
    public void user_is_on_the_wei_di_tec_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        BrowserUtils.sleep(1);

    }
    @Then("user accept cookies")
    public void user_accept_cookies() {
        basePage.cookies.click();
        BrowserUtils.sleep(1);

    }
    @Then("user click on the Karriere button")
    public void user_click_on_the_karriere_button() {
        basePage.karriereButton.click();
        BrowserUtils.sleep(1);

    }
    @Then("user scroll down and up the page")
    public void user_scroll_down_and_up_the_page() {
        for (int i = 0; i < 3; i++) {
            BrowserUtils.sleep(2);
            js.executeScript("window.scrollBy(0,2800)");
        }
        for (int i = 0; i < 3; i++) {
            BrowserUtils.sleep(2);
            js.executeScript("window.scrollBy(0,-2800)");
            BrowserUtils.sleep(2);
        }
    }
    @Then("user goes back to main page")
    public void user_goes_back_to_main_page() {

        Driver.getDriver().navigate().back();
        BrowserUtils.sleep(2);

    }
    @Then("user should see {string} title")
    public void user_should_see_title(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();

        BrowserUtils.sleep(1);
        Assert.assertEquals(expectedTitle,actualTitle);

        BrowserUtils.sleep(2);

        Driver.closeDriver();


    }

}
