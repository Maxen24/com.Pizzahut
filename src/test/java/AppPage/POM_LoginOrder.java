package AppPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.LibDriver;


public class POM_LoginOrder extends LibDriver {
WebDriver driver;
	
	
	public String navigateURL(String URL) {
		this.driver=LibDriver.driver;
		URL="https://www.pizzahut.co.in/";
		driver.get(URL);
		String title="Fail";
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(PIZZA_POM.titletext));
		System.out.println("Try Block run1");
		} catch (Exception e) {
		System.out.println("Catch block1");
		title = "Pass";
		}
		return title;
		
	}
	public String closePopupScreen() {
		this.driver=LibDriver.driver;
		String popUpScreen="Fail";
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(PIZZA_POM.Blackclosebtn));
		System.out.println("Try Block run2");
		} catch (Exception e) {
		System.out.println("Catch block2");
		popUpScreen = "Pass";
		}
		return popUpScreen;
}
	public String loginOrderStatus(String Location) {
		this.driver=LibDriver.driver;
		driver.findElement(PIZZA_POM.enterlocation).sendKeys(Location);
		driver.findElement(PIZZA_POM.autodropDown).click();
		//driver.findElement(PIZZA_POM.StartyourOrder).click();
	
		String loginOrderStatus="Fail";
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(PIZZA_POM.StartyourOrder));
		System.out.println("Try Block run3");
		} catch (Exception e) {
		System.out.println("Catch block3");
		loginOrderStatus = "Pass";
		}
		return loginOrderStatus;
	}
	
	
}
