package geometria.functest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;


import org.junit.Test;

public class FirefoxTest {

	@Test
	public void test() {
		//System.setProperty("webdriver.gecko.driver", "/Users/matteo/Documents/CloudDevOps/geckodriver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,10);
				try {
					driver.get("https://google.com/ncr");
					driver.findElement(By.name("q")).sendKeys("cheese" + Keys.ENTER);
					WebElement firstResult = wait.until(presenceOfElementLocated(By.cssSelector("h3")));
					System.out.println(firstResult.getAttribute("textContent"));
					} 			
				finally {
					driver.quit();
					}
		
			}

	}
