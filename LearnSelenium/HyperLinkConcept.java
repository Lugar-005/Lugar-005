package LearnSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinkConcept {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LUGAR\\eclipse-workspace\\LugarSelelenium\\driverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver()	;
		driver.navigate().to("http://leafground.com/pages/Link.html");
		
//		Robot robot = new Robot();
//		
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_SHIFT);
//		robot.keyPress(KeyEvent.VK_C);
//		robot.keyRelease(KeyEvent.VK_C);
//		robot.keyRelease(KeyEvent.VK_SHIFT);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		WebElement linkFind = driver.findElement(By.partialLinkText("Find where am "));
		String link = linkFind.getAttribute("href");
		System.out.println(link);
		
		WebElement checkLink = driver.findElement(By.linkText("Verify am I broken?"));
		checkLink.click();
	if (driver.getTitle().contains("404")) {
		System.out.println("this page is broken");
		}
		
	driver.navigate().back();
	
	List<WebElement> totalLink = driver.findElements(By.tagName("a"));
	int noOfLinks = totalLink.size();
	System.out.println("number of link in this page are "+ noOfLinks);
	
		
		
		
		
		
	}

}
