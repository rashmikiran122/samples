package testDrivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	//	driver.get("https://accounts.lambdatest.com/register");
	//	driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
	//	driver.get("https://the-internet.herokuapp.com/login");
	//	driver.get("https://www.lambdatest.com/blog/");
		
	//	driver.findElement(By.xpath("")).sendKeys("");
		
	//	driver.findElement(By.cssSelector("").sendKeys("");
		driver.get("https://www.google.co.in/");
		WebElement srcBox= driver.findElement(By.name("q"));
		srcBox.sendKeys("Selenium Tutorial");
		
		
List<WebElement> items= driver.findElements(By.xpath("(//Ul[@class='G43f7e'])[1]//li//descendant::div[@class='wM6W7d']"));
System.out.print("Number of itemns.."+items.size());
for (WebElement item: items) {
	System.out.println(item.getText());
	if(item.getText().equalsIgnoreCase("selenium tutorial pdf")) {
		item.click();
		break;
	}
}
	}

}
