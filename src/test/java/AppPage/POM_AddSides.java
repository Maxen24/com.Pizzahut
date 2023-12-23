package AppPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.LibDriver;



public class POM_AddSides {
	WebDriver driver;

	public String dealpage() {
		this.driver=LibDriver.driver;
		String dealPageAppear="Pass";
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(PIZZA_POM.dealsPage));
			System.out.println("Try Block run4");
		}catch(Exception e) {
			System.out.println("Catch block4");
			dealPageAppear="Fail";
			e.printStackTrace();
		}
		return dealPageAppear;
	}

	public String navigateSides() {
		this.driver=LibDriver.driver;
		driver.findElement(PIZZA_POM.sidesnavigation).click();
		String navigationToSides="Pass";
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(PIZZA_POM.sidesnavigation));
			System.out.println("Try Block run10");
		}catch(Exception e) {
			System.out.println("Catch block10");
			navigationToSides="Fail";
			e.printStackTrace();
		}
		return navigationToSides;
	}


	public String addingSides() {
		this.driver=LibDriver.driver;
		driver.findElement(PIZZA_POM.addSides).click();
		String AddSides="Pass";
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(PIZZA_POM.addSides));
		}catch(Exception e) {
			AddSides="Fail";
			e.printStackTrace();
		}
		return AddSides;


	}
	public String navigateToDrinks() {
		this.driver=LibDriver.driver;
		driver.findElement(PIZZA_POM.drinkNavigation).click();
		String navigationToDrinks="Pass";
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(PIZZA_POM.drinkNavigation));
		}catch(Exception e) {
			navigationToDrinks="Fail";
			e.printStackTrace();
		}
		return navigationToDrinks;
	}

	public String addingDrinks() {
		this.driver=LibDriver.driver;
		driver.findElement(PIZZA_POM.addingPepsi).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		driver.findElement(PIZZA_POM.addingMirinda).click();
		String itemAdd="Pass";
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(PIZZA_POM.itemCount));
		}catch(Exception e) {
			itemAdd="Fail";
			e.printStackTrace();
		}
		return itemAdd;
	}
	public String checkoutBtn() {
		this.driver=LibDriver.driver;
		driver.findElement(PIZZA_POM.checkoutbtn).click();
		String itemCheckout="Pass";
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(PIZZA_POM.checkoutbtn));
		}catch (Exception e) {
			itemCheckout="Fail";
			e.printStackTrace();
		}
		return itemCheckout;
	}
	public void defaultRadioBtn() {
		this.driver=LibDriver.driver;
		String ele= driver.findElement(PIZZA_POM.onlineRadiobtn).getAttribute("class");
		if (ele!=null)
		{
			System.out.println("radio button is selected on Online payment");
		}else {
			System.out.println("radio button is not selected");
		}
	}
	public String cashRadioBtn() {
		this.driver=LibDriver.driver;
		driver.findElement(PIZZA_POM.cashRadiobtn).click();
		String selectedCashbutton="Pass";
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(PIZZA_POM.cashRadiobtn));
		}catch (Exception e) {
			selectedCashbutton="Fail";
			e.printStackTrace();
		}
		return selectedCashbutton;
	}
	public void defaultCheckBox() {
		this.driver=LibDriver.driver;
		String secondEle= driver.findElement(PIZZA_POM.aggrementCheckboxbtn).getAttribute("class");
		if (secondEle!= null)
		{
			System.out.println("checkbox button is selected on aggrement");
		}else {
			System.out.println("checkbox button is not selected on aggrement by default");
		}
	}

	public String enterPersonalDetails() {
		this.driver=LibDriver.driver;
		driver.findElement(PIZZA_POM.enterNameText).sendKeys("Shubham Mishra");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(PIZZA_POM.enterPhoneNumber).sendKeys("9691079107");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(PIZZA_POM.enterEmailAddress).sendKeys("mshubham242@gmail.com");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String detailsAdded="Pass";
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(PIZZA_POM.enterNameText));
		}catch (Exception e) {
			detailsAdded="Fail";
			e.printStackTrace();
		}
		return detailsAdded;
	}

	public String applyGiftsCard() {
		this.driver=LibDriver.driver;
		driver.findElement(PIZZA_POM.applyGiftlink).click();
		String giftCardlink="Pass";
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(PIZZA_POM.applyGiftlink));
		}catch(Exception e) {
			giftCardlink="Fail";
			e.printStackTrace();
		}
		return giftCardlink;
	}
	
	public String toggleVoucher() {
		this.driver=LibDriver.driver;
		driver.findElement(PIZZA_POM.toggleVoucherCoupan).click();
		String clickVoucherbtn="Pass";
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(PIZZA_POM.toggleVoucherCoupan));
		}catch(Exception e) {
			clickVoucherbtn="Fail";
			e.printStackTrace();
		}
		return clickVoucherbtn;
	}
	
		public String submitVoucherCode() {
			this.driver=LibDriver.driver;
			String voucherSubmit="Pass";
		driver.findElement(PIZZA_POM.enterVocherCoupan).sendKeys("12345");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(PIZZA_POM.submitCoupan).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(PIZZA_POM.submitCoupan));
			
		}catch(Exception e) {
			voucherSubmit="Fail";
			e.printStackTrace();
		}
		return voucherSubmit;
	}
		public void closeVoucherCode() {
			this.driver=LibDriver.driver;
		String VoucherSupportText="Sorry, we don’t currently support that coupon code.";
		String voucherElement= driver.findElement(PIZZA_POM.coupanSupport).getText();
		System.out.println(voucherElement);
		if(voucherElement.contains("Sorry")) {
			System.out.println("Voucher is not Supported but Test is Passed");
			driver.findElement(PIZZA_POM.closeVoucherPop).click();
		}else {
			System.out.println("Test is failed");
			
		} 
		
	}

}
