package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class LoginPageClass {
	WebDriver driver;

	public LoginPageClass() {

	}
//	WebElement lnk_Hm = driver.findElement(By.linkText("Set SkyBlue Background"));
//	WebElement td_Home = driver.findElement(By.xpath("/html/body/div[4]/span/button[1]"));
	WebElement td_Home = driver.findElement(By.tagName("button"));	 public void colorchange() {
			 
	}
	public colorchange()
	{
		 td_Home.click();
		 Thread.sleep(2000);
		 return;
	}

//	public String getPageTitle() {

	//	return driver.getTitle();
//	}

}