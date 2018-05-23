package Selenium.Selenium;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverSeleniumEdge extends DriverSelenium {

	public DriverSeleniumEdge() {

		System.setProperty("webdriver.edge.river", "C\\MicrosoftWebDriver.exe");
	    driver = new EdgeDriver();
		driver.manage().window().maximize();

	}

}
