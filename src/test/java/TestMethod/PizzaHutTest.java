package TestMethod;

import org.testng.annotations.Test;

import AppPage.ExcelRead;
import AppPage.POM_AddSides;
import AppPage.POM_LoginOrder;
import Utils.LibDriver;

import org.testng.annotations.BeforeClass;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class PizzaHutTest extends LibDriver {
	POM_LoginOrder login=new POM_LoginOrder();
	
	ExcelRead read=new ExcelRead();
	
	
	WebDriver driver ;
	
	@Test(priority = 1)
	public void user_able_to_Navigate_URL() {
		String title=login.navigateURL(read.getURL());
		Assert.assertEquals("Pass", title);
	}
	@Test(priority = 2)
	public void close_Black_Colour_Auto_Popup_Screen()throws InterruptedException {
		String popUpScreen=login.closePopupScreen();
		Assert.assertEquals("Pass", popUpScreen);
	}
	@Test(priority=3)
	public void user_Set_The_Delivery_Location_as_Lulu_mall()  {
		String loginOrderStatus=login.loginOrderStatus("LuLu Mall");
		Assert.assertEquals("Pass", loginOrderStatus);
	}
	
	@Test(priority=4)
	public void  validate_that_the_URL_has_text_as_deals(){
		POM_AddSides sides=new POM_AddSides();
		String dealPageAppear=sides.dealpage();
		Assert.assertEquals("Pass", dealPageAppear);
	}
	
	@Test(priority = 5)
	public void user_Go_to_sides() {
		POM_AddSides sides1=new POM_AddSides();

		String navigationToSides=sides1.navigateSides();
		Assert.assertEquals("Pass", navigationToSides);
	}
	
	@Test(priority=6)
	public void user_Add_any_Item() {
		POM_AddSides sides2=new POM_AddSides();
		String AddSides=sides2.addingSides();
		Assert.assertEquals("Pass", AddSides);
	}
	@Test(priority=7)
	public void user_Navigate_To_Drinks() {
		POM_AddSides sides3=new POM_AddSides();
		String navigationToDrinks=sides3.navigateToDrinks();
		Assert.assertEquals("Pass", navigationToDrinks);
	}
	@Test(priority=8)
	public void user_Add_Two_Drinks() {
		POM_AddSides sides4=new POM_AddSides();
		String itemAdd=sides4.addingDrinks();
		Assert.assertEquals("Pass", itemAdd);
	}
	@Test(priority=9)
	public void user_will_be_navigated_to_the_checkout_page() {
		POM_AddSides sides5=new POM_AddSides();
		String itemCheckout=sides5.checkoutBtn();
		Assert.assertEquals("Pass", itemCheckout);
	}
	@Test(priority=10)
	public void Validate_that_the_Online_Payment_radio_button_is_selected_by_default() {
		POM_AddSides sides6=new POM_AddSides();
		sides6.defaultRadioBtn();
	}
	@Test(priority=11)
	public void Change_the_Payment_option_to_Cash() {
		POM_AddSides sides6=new POM_AddSides();
		String selectedCashbutton=sides6.cashRadioBtn();
		Assert.assertEquals("Pass", selectedCashbutton);
	}
	@Test(priority=12)
	public void Validate_that_the_I_agree_checkbox_is_checked_by_default() {
		POM_AddSides sides7=new POM_AddSides();
		sides7.defaultCheckBox();
	}
	@Test(priority=13)
	public void Enter_name_mobile_and_email_addresses() {
		POM_AddSides sides8=new POM_AddSides();
		String detailsAdded= sides8.enterPersonalDetails();
		Assert.assertEquals("Pass", detailsAdded);
	}
	@Test(priority=14)
	public void Click_on_the_Apply_Gift_Card_link() {
		POM_AddSides sides9=new POM_AddSides();
		String giftCardlink= sides9.applyGiftsCard();
		Assert.assertEquals("Pass", giftCardlink);
	}
	@Test(priority=15)
	public void  Click_on_the_Voucher_toggle() {
		POM_AddSides sides10=new POM_AddSides();
		String clickVoucherbtn= sides10.toggleVoucher();
		Assert.assertEquals("Pass", clickVoucherbtn);
	}
	@Test(priority=16)
	public void Give_the_Voucher_code_and_submit() {
		POM_AddSides sides11=new POM_AddSides();
		String voucherSubmit= sides11.submitVoucherCode();
		Assert.assertEquals("Pass", voucherSubmit);
	}
	@Test(priority=17)
	public void Validate_error_and_Close_the_voucher_pop_up() {
		POM_AddSides sides11=new POM_AddSides();
		sides11.closeVoucherCode();
	}

	@BeforeClass
	public void beforeClass()throws InterruptedException {
		getDriver();
	}
	
	@AfterClass
	public void afterClass() {
		
	}

	@BeforeSuite
	public void beforeSuite() {
		
	}

	@AfterSuite
	public void afterSuite() {
		
	}

}
