package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FilterPage {

	private WebDriver driver;
	private By filter = By.name("searchSortBy");
	private By firstElement = By.className("item-img");

	public FilterPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void showElements(String value) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Select select = new Select(driver.findElements(this.filter).get(1));
		select.selectByValue(value);
	}

	public void clickOnElement() throws InterruptedException {
		WebElement anElement = (new WebDriverWait(driver, 5))
				.until(ExpectedConditions.elementToBeClickable(firstElement));
		anElement.click();
		TimeUnit.SECONDS.sleep(2);
	}
}
