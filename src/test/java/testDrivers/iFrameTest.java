package testDrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://stqatools.com/demo/Windows.php");
		
		//String strLb1= driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello Welcome");
		

	}

}
