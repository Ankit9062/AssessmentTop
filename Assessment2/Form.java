package Assessment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Form {
	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://demoqa.com/automation-practice-form";
		WebDriver driver = DriverOp.getDriver(url);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement FName = driver.findElement(By.id("firstName"));
		FName.sendKeys("Pal");
		driver.findElement(By.id("lastName")).sendKeys("Saini");
		driver.findElement(By.id("userEmail")).sendKeys("PaldeepSaini789@gmail.com");
		driver.findElement(By.xpath("//div[@id='genterWrapper']/div[2]/div[1]")).click();
		WebElement userNumber = driver.findElement(By.id("userNumber"));
		userNumber.sendKeys("8469181334");
		js.executeScript("arguments[0].scrollIntoView();",userNumber);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='hobbiesWrapper']/div[2]/div[2]")).click();
		
		Actions action = new Actions(driver);
		action.click(driver.findElement(By.xpath("//div[@id='subjectsContainer']/div/div[1]")))
		.pause(Duration.ofSeconds(2))
		.sendKeys("M")
		.pause(Duration.ofSeconds(1))
		.keyDown(Keys.ARROW_DOWN)
		.keyDown(Keys.ENTER)
		.build()
		.perform();
		driver.findElement(By.id("uploadPicture")).sendKeys("D:\\JAVA backup\\Calculator1\\Dog.jpg");
		Thread.sleep(2000);
		driver.findElement(By.id("currentAddress")).sendKeys("Vastral");
		Thread.sleep(2000);
		
		
		WebElement OpenCalander = driver.findElement(By.id("dateOfBirthInput"));
		OpenCalander.click();
		Thread.sleep(2000);
		
		WebElement DropDownYear = driver.findElement(By.className("react-datepicker__year-select"));
		DropDownYear.click();
		Select yearselect =new Select(DropDownYear);
		yearselect.selectByVisibleText("2021");
		
		WebElement DropDownMonth = driver.findElement(By.className("react-datepicker__month-select"));
		DropDownMonth.click();
		Select monthselect =new Select(DropDownMonth);
		monthselect.selectByVisibleText("April");
//		WebElement asd = driver.findElement(By.xpath("//div[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[3]"));
//		asd.click();
		

		List<WebElement> dates = driver.findElements(By.xpath("//div[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[2]/div/div"));
		System.out.println(dates.size());
		for(WebElement date:dates) {
			if(date.getText().equals("29")) {
				date.click();	
			}
		}
		Thread.sleep(2000);
		
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		
		File source =ss.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Admin\\OneDrive\\Pictures\\Screenshots\\+source.getName().png"); 
		try 
		{
			FileUtils.copyFile(source, dest);
			System.out.println("ss taken");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	
}
}
