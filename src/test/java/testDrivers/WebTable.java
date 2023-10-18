package testDrivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		
List<WebElement> items= driver.findElements(By.xpath("//td[test()='B.Wagner']//following-sibling::td"));
System.out.print("Number of itemns.."+items.size());
for(WebElement cell:items) {
	System.out.println(cell.getText());
}

}
}
