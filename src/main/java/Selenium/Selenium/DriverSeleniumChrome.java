package Selenium.Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSeleniumChrome extends DriverSelenium {

	public DriverSeleniumChrome() {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver64.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

}
