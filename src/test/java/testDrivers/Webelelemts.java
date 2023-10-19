package testDrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelelemts {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationbookstore.dev/");
		
		driver.findElement(By.id("searchBar")).sendKeys("Test");
		WebElement closeBtn= driver.findElement(By.xpath("//a[text()='Clear text']"));
		if(closeBtn.isDisplayed()){
			closeBtn.click();
	}
	}

}
