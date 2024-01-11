package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("Window.scrollBy(0,500)");
	js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000", args);
	List<WebElement>values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));

		int sum=0;
		for(int i=0;i<values.size();i++)
		{
			sum=sum+Integer.parseInt(values.get(i).getText());
		}
System.out.println("the sum is"+sum);
	}

}
