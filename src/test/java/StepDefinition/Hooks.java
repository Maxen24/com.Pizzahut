package StepDefinition;

import Utils.LibDriver;
import io.cucumber.java.Before;

public class Hooks extends LibDriver {
	@Before
	public void driverdedticated() {
		getDriver();
	}

}
