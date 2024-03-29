package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.Context;
import utils.MailSender;

public class Common {
	private Context context;

	public Common(Context context) {
		this.context = context;
	}

	@Before
	public void InitializeTest() {
		this.context.initializeDriver();
		this.context.getDriver().navigate().to("https://www.bookdepository.com/");

	}

	@After
	public void TearDownTest(Scenario scenario) {
		System.out.println("ID: "+ scenario.getId());
		System.out.println("Name : " + scenario.getName());
        System.out.println("Status : " + scenario.getStatus());
        scenario.write("--------------------------------------------------------------");
        scenario.write("ID: "+ scenario.getId());
        scenario.write("Name : " + scenario.getName());
        scenario.write("Status : " + scenario.getStatus());
        scenario.write("Price : " + this.context.getDriver().findElement(By.className("sale-price")).getText());
        //if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) this.context.getDriver()).getScreenshotAs(OutputType.BYTES);
		      scenario.embed(screenshot, "image/png"); // ... and embed it in the report.
		//}
		scenario.write("--------------------------------------------------------------");
		//MailSender.sendMail();
		this.context.getDriver().close();
		this.context.getDriver().quit();
	}
}
