package AppPage;

import java.time.Duration;

import javax.annotation.MatchesPattern;

import org.checkerframework.common.value.qual.MatchesRegex;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.LibDriver;

public class POM_AddToBasket {
	WebDriver driver;
	
	
	
	public void vegToggle() {
	this.driver=LibDriver.driver;
	WebElement checkbox=driver.findElement(PIZZA_POM.vegToggle);
	if(checkbox.isSelected()) {
		System.out.println("Veg Flag is selected");
	}else {
		System.out.println("Veg Flag is OFF");
	}
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public String clickPizza() {
	driver.findElement(PIZZA_POM.pizzaMenuBtn).click();
	String pizzaMenu="Pass";
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	try {
	wait.until(ExpectedConditions.visibilityOfElementLocated(PIZZA_POM.pizzaMenuBtn));
	}catch (Exception e) {
		pizzaMenu="Fail";
		e.printStackTrace();
	}
	return pizzaMenu;
}
	public String addPizza() {
		driver.findElement(PIZZA_POM.addPizzaBtn).click();
		String itemAdded="Pass";
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(PIZZA_POM.itemCount));
		}catch (Exception e) {
			itemAdded="Fail";
			e.printStackTrace();
		}
		return itemAdded;
	}
	
	
	public void PizzaCost() {
		WebElement price=driver.findElement((PIZZA_POM.subtotalprice));
		String pizzaPrice=price.getText();
		pizzaPrice=pizzaPrice.replace("₹", "");
		float priceValue=Float.parseFloat(pizzaPrice);
		System.out.println(priceValue);
		
		WebElement taxprice1=driver.findElement((PIZZA_POM.restaurantServiceCharge));
		String pizzataxPrice1=taxprice1.getText();
		pizzataxPrice1=pizzataxPrice1.replace("₹", "");
		float taxPriceValue1= Float.parseFloat(pizzataxPrice1);
		System.out.println(taxPriceValue1);
		
		WebElement taxprice2=driver.findElement((PIZZA_POM.taxCharge));
		String pizzataxPrice2=taxprice2.getText();
		pizzataxPrice2=pizzataxPrice2.replace("₹", "");
		float taxPriceValue2= Float.parseFloat(pizzataxPrice2);
		System.out.println(taxPriceValue2);
		
		WebElement checkoutPrice=driver.findElement((PIZZA_POM.checkoutPrice));
		String pizzacheckoutPrice=checkoutPrice.getText();
		pizzacheckoutPrice=pizzacheckoutPrice.replace("₹", "");
		float CheckoutPrice=Float.parseFloat(pizzacheckoutPrice);
		System.out.println(CheckoutPrice);
		
		float TotalCheckoutPrice=priceValue+taxPriceValue1+taxPriceValue2;
		System.out.println(TotalCheckoutPrice);
		if(TotalCheckoutPrice==CheckoutPrice) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
	}
	public String checkoutbtn() {
		driver.findElement(PIZZA_POM.itemCount);
		String itemCount="Pass";
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(PIZZA_POM.itemCount));
		}catch (Exception e) {
			itemCount="Fail";
			e.printStackTrace();
		}
		return itemCount;
		
	}
	public String checkoutbtnPrice() {
		driver.findElement(PIZZA_POM.itemCountprice);
		String itemPrice="Pass";
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(PIZZA_POM.itemCountprice));
		}catch (Exception e) {
			itemPrice="Fail";
			e.printStackTrace();
		}
		return itemPrice;
	}
}