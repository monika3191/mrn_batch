package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footDriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(footDriver.findElements(By.tagName("a")).size());
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");

	}

}
