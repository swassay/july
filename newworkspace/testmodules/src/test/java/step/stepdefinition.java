package step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import util.BrowserFactory;
import page.LoginPageClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition {
WebDriver driver=BrowserFactory.startBrowser();
@Given("^the user is in page$")
public void the_user_is_in_page() throws Throwable {
  System.out.println("First");
	
	// Write code here that turns the phrase above into concrete actions
}

@When("^user clicks blue$")
public void user_clicks_blue() throws Throwable {
   System.out.println("Blue");
   WebElement td_Home = driver.findElement(By.tagName("button"));
   td_Home.click();
 // LoginPageClass loginPage=PageFactory.initElements(driver, LoginPageClass.class);
 //  loginPage.colorchange();
  Thread.sleep(3000);
	// Write code here that turns the phrase above into concrete actions
}

@Then("^background changes to White$")
public void background_changes_to_White() throws Throwable {
   System.out.println("White");
   WebElement td2_Home = driver.findElement(By.xpath("//html/body/div[4]/span/button[2]"));
   td2_Home.click();
	// Write code here that turns the phrase above into concrete actions

}


@Then("^program ends$")
public void program_ends() throws Throwable {
    System.out.println("The End");
   	driver.close();
	driver.quit();
	// Write code here that turns the phrase above into concrete actions
}
}
