package Selenium.Selenium;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public abstract class DriverSelenium {

	static protected WebDriver driver;

	public WebDriver getDriver() {
		return this.driver;
	}

	public void cerrarProceso() throws IOException {

		if (getDriver() instanceof DriverSeleniumFirefox) {

			Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe");

		} else if (getDriver() instanceof DriverSeleniumChrome) {

			Runtime.getRuntime().exec("taskkill /F /IM chromedriver64.exe");

		} else if (getDriver() instanceof DriverSeleniumEdge) {

			Runtime.getRuntime().exec("taskkill /F /IM MicrosoftWebDriver.exe");

		}

		System.out.println("IYO COPIÓN, QUE SE ACABÓ YAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA \n");

	}

}
