package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SignOnPage {
	private WebDriver driver;
	private By logoImage = By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img");
	private By userNameInput = By.name("userName");
	public SignOnPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void verifyInPage() {
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Assert.assertTrue(driver.findElements(logoImage).size()>0);
		Assert.assertTrue(driver.findElements(userNameInput).size()>0);
	}
	
}
