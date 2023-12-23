package AppPage;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.LibDriver;


public class POM_AddPepsi {
WebDriver driver;
POM_AddToBasket basket=new POM_AddToBasket();
	public String AddPepsi() {
		this.driver=LibDriver.driver;
		driver.findElement(PIZZA_POM.nextProductBtn).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(PIZZA_POM.nextProductBtn).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(PIZZA_POM.addPepsibtn).click();
		String ItemAdded = "Pass";
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(PIZZA_POM.itemCount));
		} catch (Exception e) {
			ItemAdded = "Fail";
			e.printStackTrace();
		}
		System.out.println("Drink Added to Basket");
	
		return ItemAdded;
	}
	public void totalPrice() {
		double previousPrice=413.70;
		WebElement checkoutPrice=driver.findElement((PIZZA_POM.checkoutPrice));
		String pizzacheckoutPrice=checkoutPrice.getText();
		pizzacheckoutPrice=pizzacheckoutPrice.replace("₹", "");
		double CheckoutPrice=Double.parseDouble(pizzacheckoutPrice);
		System.out.println(CheckoutPrice);
		if(previousPrice<=CheckoutPrice) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
			
	}
	
	public void numberOfItems(int ItemAdded) {
		WebElement ele=driver.findElement(PIZZA_POM.itemCount);
		String numberOfItem=ele.getText();
		numberOfItem=numberOfItem.replace(" items", "");
		int numItem=Integer.parseInt(numberOfItem);
		System.out.println(numberOfItem);
		if(numItem==ItemAdded) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}
	
	public String removePizza() {
		driver.findElement(PIZZA_POM.removePizzaBtn).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String ItemRemoved = "Pass";
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(PIZZA_POM.itemCount));
		} catch (Exception e) {
			ItemRemoved = "Fail";
			e.printStackTrace();
		}
		
		return ItemRemoved;
	}
	public String checkoutBtn() {
		driver.findElement(PIZZA_POM.checkoutbtn).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String itemCheckout="Pass";
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(PIZZA_POM.minReqOrder));
		}catch (Exception e) {
			itemCheckout="Fail";
			e.printStackTrace();
		}
		return itemCheckout;
	}
	
	public String priceTag() {
		String priceTagRemoved="Pass";
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(PIZZA_POM.itemCountprice));
		}catch (Exception e) {
			priceTagRemoved="Fail";
			e.printStackTrace();
		}
		return priceTagRemoved;
	}
	
	public void numberOfItem(int ItemAdded) {
		WebElement element=driver.findElement(PIZZA_POM.itemCount);
		String numberOfItems=element.getText();
		numberOfItems=numberOfItems.replace(" item", "");
		int numItem=Integer.parseInt(numberOfItems);
		System.out.println(numberOfItems);
		if(numItem==ItemAdded) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}
}
