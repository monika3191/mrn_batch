package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class link_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println("number of links in the web page "+driver.findElements(By.tagName("a")).size());
		//WebElement footer=driver.findElement(By.id("gf-BIG"));
		//System.out.println("Number of a in footer "+footer.findElements(By.tagName("a")).size());
	WebElement footer=driver.findElement(By.id("gf-BIG"));
	System.out.println("The number of links in footer is: "+footer.findElements(By.tagName("a")).size());
	}

}
