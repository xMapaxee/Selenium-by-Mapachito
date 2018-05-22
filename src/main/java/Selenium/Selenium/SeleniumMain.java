package Selenium.Selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumMain {
	public static void main(String[] args) throws IOException {
		DriverSeleniumFirefox driver2 = new DriverSeleniumFirefox();
		try {
			// DriverSeleniumFirefox driver = new DriverSeleniumFirefox();
			// driver.getDriver().get("https://www.google.es");
			//
			// driver.getDriver().findElement(By.id("lst-ib"))
			// .sendKeys("lista convocados seleccion española mundial 2018 RTVE");
			// driver.getDriver().findElement(By.name("btnK")).click();
			// System.out.println(driver.getDriver().findElement(By.id("resultStats")).getText());
			// driver.getDriver().findElement(By.partialLinkText("Mundial 2018 | Selección
			// española - RTVE.es ")).click();
			// // driver.getDriver().navigate().back();
			// System.out.println(driver.getDriver().findElement(By.className("ladillo")).getText());
			// driver.getDriver().findElement(By.className("section")).findElements(By.tagName("p")).stream()
			// .forEach(p -> System.out.println(p.getText()));
			//
			// driver.cerrarProceso();

			// driver2.getDriver().get("https://www.primefaces.org/ultima/dashboard.xhtml");
			// driver2.getDriver().findElement(By.id("menuform:um_components")).click();
			// driver2.getDriver().findElement(By.id("menuform:um_sample")).click();
			// driver2.getDriver().findElement(By.id("j_idt50:dialog2")).click();
			// driver2.getDriver().findElement(By.id("j_idt50:dialog2")).click();
			// driver2.getDriver().findElement(By.id("j_idt50:j_idt101")).sendKeys("CuloMono");
			// driver2.getDriver().findElement(By.id("j_idt50:j_idt105")).sendKeys("simioanalfabeto");
			// driver2.getDriver().findElement(By.id("j_idt50:j_idt108")).click();
			//
			// driver2.getDriver().findElement(By.id("menuform:um_messages")).click();
			// driver2.getDriver().findElement(By.id("j_idt51:default")).sendKeys("Thanos");
			// driver2.getDriver().findElement(By.id("j_idt51:txt")).sendKeys("Cusha, tengo
			// hambre");
			// driver2.getDriver().findElement(By.id("j_idt51:icon")).sendKeys("Preparaos");
			// driver2.getDriver().findElement(By.id("j_idt51:inline")).sendKeys("Chimichangas");
			//
			// Actions action = new Actions(driver2.getDriver());
			//
			// action.moveToElement(driver2.getDriver().findElement(By.id("j_idt51:mtext_label")));
			// action.click();
			// action.perform();
			//
			// driver2.getDriver().findElement(By.id("j_idt51:mtext_2")).click();
			// driver2.getDriver().findElement(By.id("j_idt51:micon")).sendKeys("Cacahuete");
			// System.out.println(driver2.getDriver().findElement(By.id("j_idt51:j_idt54")).getText());
			// driver2.getDriver().findElement(By.id("j_idt51:sbmitButton")).click();
			//
			// driver2.cerrarProceso();
			//
			// }
			// }

			// } catch (NoSuchElementException e) {
			// e.getMessage();
			//
			// } finally {
			//
			// driver2.cerrarProceso();
			//
			// }
			//
			// }
			// }

			driver2.getDriver().get("https://www.eltiempo.es");
			driver2.getDriver().findElement(By.id("inputSearch")).sendKeys("Ecija" + Keys.ENTER);
			final WebDriverWait wait = new WebDriverWait(driver2.getDriver(), 20);
			wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Écija, Sevilla")));
			driver2.getDriver().findElement(By.partialLinkText("Écija, Sevilla")).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.className("m_table_weather_day_temp_wrapper")));
			driver2.getDriver().findElements(By.className("m_table_weather_day_temp_wrapper")).stream()
					.filter(p -> p.getAttribute("outerHTML").contains("25 May, 14:00")).findFirst().get().click();

			driver2.getDriver().findElements(By.className("table_tooltip_wrapper")).stream()
					.forEach(p -> System.out.println(p.getText()));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver2.cerrarProceso();
		}

	}
}
