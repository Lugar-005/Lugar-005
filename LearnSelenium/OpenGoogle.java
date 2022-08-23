package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\LUGAR\\eclipse-workspace\\LugarSelelenium\\driverChrome\\chromedriver.exe");
		 WebDriver google = new ChromeDriver ();
		 google.get("https://www.google.co.in");
		 
		 
		 google.findElement(By.name("q")).sendKeys("thor"+Keys.ENTER);
		 
		// google.quit();		 
	}

}
