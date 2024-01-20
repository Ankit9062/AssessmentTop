package Assessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverOp
{
	public static WebDriver getDriver(String url) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\OneDrive\\Desktop\\Testing\\drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
		

	}
}

