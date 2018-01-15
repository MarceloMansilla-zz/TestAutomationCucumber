package verifier;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ArticleVerifier {
	
	private WebDriver driver;
	private By verifierLinkText = By.xpath("/html/body/div[3]/div[5]/div/div[1]/div[1]/div[2]/ul[1]/li[1]/text()");

	public void verifyInPage() {
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertTrue(this.driver.findElement(this.verifierLinkText).getText().contains("Paperback"));
	}
}
