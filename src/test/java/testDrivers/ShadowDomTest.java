package testDrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://Watir.com/examples/shadow_dom.html");
		
		WebElement shadowHost= driver.findElement(By.cssSelector("#shadow_host"));
SearchContext shadowRoot=shadowHost.getShadowRoot();
WebElement shadowContent= shadowRoot.findElement(By.cssSelector("#shadow_Content"));
System.out.println(shadowContent.getText());
	}

}
