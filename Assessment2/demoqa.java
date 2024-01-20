package Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class demoqa {
	
public static void main(String[] args) throws InterruptedException {
		
		String url = "https://demoqa.com/webtables";
		WebDriver driver = DriverOp.getDriver(url);
		
		WebElement NewDetails = driver.findElement(By.linkText(""));
		NewDetails.click();
		Thread.sleep(2000);
		WebElement firstName = driver.findElement(By.id(""));
		firstName.clear();
		firstName.sendKeys("Ankit");
		
		WebElement LastName = driver.findElement(By.id(""));
		LastName.clear();
		LastName.sendKeys("Patel");
		WebElement Add = driver.findElement(By.xpath(""));
		Add.click();
		Thread.sleep(3000);
		WebElement EditDetails = driver.findElement(By.linkText(""));
		EditDetails.click();
		Thread.sleep(2000);
		Add.click();
		Thread.sleep(2000);
		WebElement Delete = driver.findElement(By.xpath(""));
		Delete.click();
		
		
		

}
}
