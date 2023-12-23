package AppPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIZZA_POM {
	WebDriver driver;
	
	//locators
	
	public static final By Blackclosebtn= By.xpath("//span[contains(text(),'Sorry, an error occurred while searching for that ')]");
	public static final By titletext=By.xpath("//title[normalize-space()='Order Pizza Online - Delivery and Takeaway']");
	public static final By enterlocation= By.xpath("//input[@placeholder='Enter your location for delivery']");
	public static final By linkClose=By.xpath("//div[@class='ReactModal__overlay ReactModal__overlay--after-open']");
	public static final By autodropDown=  By.id("PlacesAutocomplete__suggestion-ChIJibOv91aRyzsRhX6IzZ-NOd8");
	public static final By StartyourOrder=By.xpath("//span[normalize-space()='Start your order']");
	
	//Vegetarian flag off
	
	public static final By vegToggle=By.className("pr-5");
	public static final By pizzaMenuBtn=By.xpath("//a[@data-synth='link--pizzas--side']//span[contains(text(),'Pizzas')]");
	public static final By addPizzaBtn= By.xpath("//body/div[@data-test='app-container']/div/div/div/div/div/div/span[@data-testid='pizzas']/div/a[@role='button']/div/div/button[@data-synth='button--mazedar-makhni-paneer-recommended-pan-personal--one-tap']/span[1]");
	public static final By subtotalprice=By.className("subtotal");
	public static final By restaurantServiceCharge= By.className("display-supplement-value");
	public static final By taxCharge=By.xpath("//span[contains(text(),'₹19.70')]");
	public static final By checkoutPrice=By.className("amountdue");
	public static final By itemCount=By.xpath("//span[contains(@class,'mr-auto text-left')]");
	public static final By itemCountprice=By.xpath("//span[contains(@data-synth,'basket-value')][contains(text(),'₹413.70')]");
	public static final By nextProductBtn= By.xpath("//button[@aria-label='Next Product']");
	public static final By addPepsibtn= By.xpath("//body/div[@id='app']/div/div/div[@data-module-placement='sidebar']/div/div/div/div/div/button[@aria-label='Add Pepsi']/span[1]");
	public static final By removePizzaBtn=By.xpath("//button[@data-synth='basket-item-remove--mazedar-makhni-paneer-recommended-pan-personal']");
	public static final By minReqOrder= By.xpath("//div[contains(@data-synth,'delivery-minimum-top')]//span[contains(text(),'Minimum cart value for delivery is ₹200')]");
	public static final By checkoutbtn= By.xpath("//span[contains(text(),'Checkout')]");
	public static final By dealsPage=By.xpath("//a[contains(@data-synth,'link--deals--side')]//span[contains(text(),'Deals')]");
	public static final By sidesnavigation= By.xpath("//a[@data-synth='link--sides--side']//span[contains(text(),'Sides')]");
	public static final By addSides= By.xpath("//button[contains(@data-synth,'button--exotica-veggie-garlic-bread-single--one-tap')]//span//span[contains(text(),'Add')]");
	public static final By drinkNavigation=By.xpath("//a[contains(@class,'capitalize lg:border-r')]//span[contains(text(),'Drinks')]");
	public static final By addingPepsi= By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/span[1]/div[1]/a[1]/div[3]/div[1]/button[1]/span[1]");
	public static final By addingMirinda= By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/span[1]/div[1]/a[3]/div[3]/div[1]/button[1]/span[1]");
	public static final By onlineRadiobtn=By.xpath("//span[contains(text(),'Online Payment')]");
	public static final By cashRadiobtn= By.xpath("//span[contains(text(),'Cash')]");
	public static final By aggrementCheckboxbtn= By.xpath("//span[normalize-space()='I agree to receive promotional communication.']");
	public static final By enterNameText=By.xpath("//input[@id='checkout__name']");
	public static final By enterPhoneNumber=By.xpath("//input[@id='checkout__phone']");
	public static final By enterEmailAddress=By.xpath("//input[@id='checkout__email']");
	public static final By applyGiftlink=By.xpath("//span[normalize-space()='Apply Gift Card']");
	public static final By toggleVoucherCoupan=By.xpath("//span[normalize-space()='Coupon']");
	public static final By enterVocherCoupan= By.xpath("//input[@placeholder='e.g. ABC1234']");
	public static final By submitCoupan=By.xpath("//span[normalize-space()='Apply']");
	public static final By coupanSupport=By.xpath("//span[contains(text(),'Sorry, we don’t currently support that coupon code')]");
	public static final By closeVoucherPop=By.xpath("//button[normalize-space()='Cancel']");
}
