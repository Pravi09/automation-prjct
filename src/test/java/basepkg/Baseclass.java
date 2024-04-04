package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	
	protected WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.luluhypermarket.in/en-in/groceries-grocery/c/HYGRCR00001");
		driver.manage().window().maximize();
	}

}
