package Utils;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import AppPage.ExcelRead;



public class LibDriver {

	public static WebDriver driver;
	public String driverPath = "C:\\ChromeDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	ExcelRead read1=new ExcelRead();

	public WebDriver getDriver() {
		if(this.driver==null) {
			this.driver=createDriver();
		}
		return this.driver;
	}
	private WebDriver createDriver() {
		System.out.println("launching Chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(read1.getURL());
		return driver;
	}
	
}
