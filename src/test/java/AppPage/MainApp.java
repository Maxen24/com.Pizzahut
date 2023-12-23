package AppPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utils.LibDriver;

public class MainApp {
	
	static ExcelRead read2=new ExcelRead();
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(read2.getURL());
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your location for delivery']")).sendKeys("Lulu Mall");
		driver.findElement(By.id("PlacesAutocomplete__suggestion-ChIJibOv91aRyzsRhX6IzZ-NOd8")).click();
		driver.findElement(By.xpath("//a[contains(@data-synth,'link--sides--side')]//span[contains(text(),'Sides')]")).click();
		

	}
}

		
