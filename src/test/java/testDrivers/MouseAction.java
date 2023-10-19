package testDrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
	//	
		driver.get("https://stqatools.com/demo/DoubleClick.php");
		
		Actions actions=new Actions(driver);
//		WebElement srcBox= driver.findElement(By.name("search"));
//		WebElement menu= driver.findElement(By.xpath("//a[text()='Components']"));
//		WebElement submenu= driver.findElement(By.xpath("//a[text()='Monitors (2)']"));
//		
//		actions.moveToElement(menu).click(submenu).build().perform();
//		Thread.sleep(1000);
//		actions.scrollToElement(driver.findElement(By.linkText("Samsung SyncMaster 941BW")));
			actions.doubleClick(driver.findElement(By.linkText("Samsung SyncMaster 941BW")));
	}

}
