package Selenium.Selenium;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public abstract class DriverSelenium {

	static protected WebDriver driver;

	public WebDriver getDriver()	{
		return this.driver;
	}

	public void cerrarProceso() throws IOException {

		if (getDriver() instanceof DriverSeleniumFirefox) {

			Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe");

		} else {

			Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");

		}

		System.out.println("IYO COPIÓN, QUE SE ACABÓ YAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA \n");

	}

}
