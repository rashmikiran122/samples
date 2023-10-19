package testDrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocator {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationbookstore.dev/");
//		String strID= driver.findElement(RelativeLocator.With(By.tagName("li"))
//				.toLeftOf(By.id("pid6")).below(By.id("pid1")))
//.getAttribute("id");
//System.out.print("Id value...."+strID);
//
//String strID1= driver.findElement(RelativeLocator.With(By.tagName("li"))
//.above(By.id("pid6")).toRightOf(By.id("pid1")))
//.getAttribute("id");
//System.out.print("Id value...."+strID1);

	}

}
