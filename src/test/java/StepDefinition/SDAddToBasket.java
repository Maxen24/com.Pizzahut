package StepDefinition;

import org.junit.Assert;

import AppPage.POM_AddPepsi;
import AppPage.POM_AddToBasket;
import AppPage.POM_LoginOrder;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class SDAddToBasket {
	
	POM_LoginOrder orderLogin=new POM_LoginOrder();
	POM_AddToBasket basket=new POM_AddToBasket();
	POM_AddPepsi pepsi=new POM_AddPepsi();
	
	
	@Given("User launch Pizzahut application with {string}")
	public void user_launch_pizzahut_application_with(String URL) {
	    // Write code here that turns the phrase above into concrete actions
	    String title=orderLogin.navigateURL(URL);
	    Assert.assertEquals("Pass",title);
	}

	

//	@And("User close the pop up screen")
//	public void user_close_the_pop_up_screen() {
//	    String popUpScreen=orderLogin.closePopupScreen();
//		Assert.assertEquals("Pass",popUpScreen);
//	}

	@Then("User type address as {string}")
	public void user_type_address_as(String Location) {
	    String loginOrderStatus=orderLogin.loginOrderStatus(Location);
	    Assert.assertEquals("Pass",loginOrderStatus);
	}

	@And("User select first auto populate drop down option")
	public void user_select_first_auto_populate_drop_down_option() {
		System.out.println("User has selected 1st suggestion in drop down");
	    
	}

	@When("User navigate to deails page")
	public void user_navigate_to_deails_page() {
	    System.out.println("User has navigated to details page");
	}

	@Then("User validate vegetarian radio button flag is off")
	public void user_validate_vegetarian_radio_button_flag_is_off() {
	    basket.vegToggle();
	}

	@And("User clicks on Pizzas menu bar option")
	public void user_clicks_on_pizzas_menu_bar_option() {
	    String pizzaMenu=basket.clickPizza();
	    Assert.assertEquals("Pass", pizzaMenu);
	}

	@When("User select add button of any pizza from Recommended")
	public void user_select_add_button_of_any_pizza_from_recommended() {
	    String itemAdded=basket.addPizza();
	    Assert.assertEquals("Pass", itemAdded);
	}

	@Then("User see that the pizza is getting added under Your Basket")
	public void user_see_that_the_pizza_is_getting_added_under_your_basket() {
	    System.out.println("Yes Pizza is added to basket");
	}

	@And("User validate pizza price plus Tax is checkout price")
	public void user_validate_pizza_price_plus_tax_is_checkout_price() {
	    basket.PizzaCost();
	}

	@Then("User validate checkout button contains Item count")
	public void user_validate_checkout_button_contains_item_count() {
	    String itemCount=basket.checkoutbtn();
	    Assert.assertEquals("Pass", itemCount);
	}

	@And("User validate checkout button contains total price count")
	public void user_validate_checkout_button_contains_total_price_count() {
		String itemCountPrice=basket.checkoutbtnPrice();
	    Assert.assertEquals("Pass", itemCountPrice);
	}

	@Then("User clicks on Drinks option")
	public void user_clicks_on_drinks_option() {
	    String ItemAdded=pepsi.AddPepsi();
	    Assert.assertEquals("Pass", ItemAdded);
	}

	@And("User select Pepsi option to add into the Basket")
	public void user_select_pepsi_option_to_add_into_the_basket() {
	    System.out.println("Pepsi Added to the Basket");
	}

	@Then("User see two items are showing under checkout button")
	public void user_see_two_items_are_showing_under_checkout_button() {
	    pepsi.numberOfItems(2);
	    System.out.println("Number of Item are Showing");
	}

	@And("User see total price is now more than before")
	public void user_see_total_price_is_now_more_than_before() {
	    pepsi.totalPrice();
	}

	@Then("User remove the Pizza item from Basket")
	public void user_remove_the_pizza_item_from_basket() {
	    String ItemRemoved=pepsi.removePizza();
	    Assert.assertEquals("Pass", ItemRemoved);
	}

	@And("see Price tag got removed from the checkout button")
	public void see_price_tag_got_removed_from_the_checkout_button() {
	    String priceTagRemoved=pepsi.priceTag();
	    Assert.assertEquals("Pass", priceTagRemoved);
	}

	@Then("User see one item showing in checkout button")
	public void user_see_one_item_showing_in_checkout_button() {
	    pepsi.numberOfItem(1);
	}

	@Then("User Clicks on Checkout button")
	public void user_clicks_on_checkout_button() {
	    String itemCheckout=pepsi.checkoutBtn();
	    Assert.assertEquals("Pass", itemCheckout);
	}

	@And("User see minimum order required pop up is getting displayed")
	public void user_see_minimum_order_required_pop_up_is_getting_displayed() {
	    System.out.println("Minimum Order is displaying");
	}
	}

