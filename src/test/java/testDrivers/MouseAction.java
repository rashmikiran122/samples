package testDrivers;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		TakesScreenshot screen= (TakesScreenshot)driver;
		File img=screen.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(img, new File(System.getProperty("user.dir")
					+"//screenshots//"
					+"FullScreen.png"
					));
		} catch(IOException e) {
			e.printStackTrace();
		}
		WebElement elem=driver.findElement(By.cssSelector("div#logo"));
		File imgElem=elem.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(img, new File(System.getProperty("user.dir")
					+"//screenshots//"
					+"ElementScreen.png"
					));
		} catch(IOException e) {
			e.printStackTrace();
		}
		}
		
	//	
	//	driver.get("https://stqatools.com/demo/DoubleClick.php");
		
//		Actions actions=new Actions(driver);
//		WebElement srcBox= driver.findElement(By.name("search"));
//		WebElement menu= driver.findElem//ent(By.xpath("//a[text()='Components']"));
//		WebElement submenu= driver.findElement(By.xpath("//a[text()='Monitors (2)']"));
//		
//		actions.moveToElement(menu).click(submenu).build().perform();
//		Thread.sleep(1000);
//		actions.scrollToElement(driver.findElement(By.linkText("Samsung SyncMaster 941BW")));
	//		actions.doubleClick(driver.findElement(By.linkText("Samsung SyncMaster 941BW")));
	

}

