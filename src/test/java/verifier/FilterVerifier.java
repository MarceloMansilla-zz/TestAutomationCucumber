package verifier;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class FilterVerifier {

	private WebDriver driver;
	private By sortBy = By.name("searchSortBy");

	public FilterVerifier(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void verifyPage(String sortOrder) {
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Select select = new Select(driver.findElements(sortBy).get(1));
		Assert.assertEquals(select.getFirstSelectedOption().getAttribute("value"), sortOrder);
	}
}
