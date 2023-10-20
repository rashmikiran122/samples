package testDrivers;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class POPWindow {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://stqatools.com/demo/Windows.php");
		
		String parentWin=driver.getWindowHandle();
		System.out.println(parentWin);
				
		
		driver.findElement(By.xpath("//button{text()=' Click to open new Tab ']")).click();
		Set<String> wins=driver.getWindowHandles();
		System.out.println(wins.size());
		for(String tab:wins) {
			System.out.println(tab);
			if(!tab.equalsIgnoreCase(parentWin)) {
				driver.switchTo().window(tab);
				driver.findElement(By.xpath("//span{text()='Java'])[1]")).click();
			}
		}
		driver.close();
		// driver.quit();
		driver.switchTo().window(parentWin);
		driver.findElement(By.xpath("//button{text()=' Click to open new Window ']")).click();
		//driver.quit();

		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("http://www.selenium.dev/");
		driver.quit();
	}

}
