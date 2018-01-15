package verifier;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SearchVerifier {

	private WebDriver driver;
	private By resultText = By.xpath("/html/body/div[3]/div[5]/div[2]/h1");

	public SearchVerifier(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void verifyInPage() {
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertTrue(driver.findElement(resultText).getText().contains("Search results for"));
	}
}
