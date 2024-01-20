package Assessment;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class techlisticTable {
	
public static void main(String[] args) throws InterruptedException {
		
		String url = "http://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
		WebDriver driver = DriverOp.getDriver(url);
//		WebElement FullTable = driver.findElement(By.xpath("//table[@class='tsc_table_s13']"));
		List<WebElement> TotalEntry= driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));
		System.out.println("Total Number of Entry : "+TotalEntry.size());
		
		
		double Temp=0,a=0;
		List<WebElement> HeightOfBuilding = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/td[3]/span"));
//		for(int index=0;index<=HeightOfBuilding.size();index++)
//		{
//		a=	HeightOfBuilding.get(index).getText();
//		}
		System.out.println(HeightOfBuilding.size());
		for(WebElement Height:HeightOfBuilding) 
		{
			 a=(Double.parseDouble(Height.getText()));
			 System.out.println(a);
			if(a>Temp)
			{
				Temp=a;
			}
		
		}
		System.out.println("Heighest height of building is "+Temp+"m");
		
}
}
