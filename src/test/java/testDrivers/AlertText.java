package testDrivers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertText {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		
		driver.findElement(By.xpath("//button{@class='btn btn-default']")).click();
Alert simple=driver.switchTo().alert();
System.out.println(simple.getText());
simple.accept();


	}

}
