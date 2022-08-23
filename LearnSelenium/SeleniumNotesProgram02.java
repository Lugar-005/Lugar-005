package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumNotesProgram02 {

	public static void main(String[] args) {
 
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LUGAR\\eclipse-workspace\\LugarSelelenium\\driverChrome\\chromedriver.exe");
		WebDriver testleaf = new ChromeDriver()	;
		testleaf.get("http://leafground.com/pages/Link.html");
//for click the link
		//testleaf.findElement(By.linkText("Go to Home Page")).click();
		
		testleaf.findElement(By.partialLinkText("Home Page")).click();
		//partial link text used where any button has a chance to change like contact may be change as contact us. 

		//testleaf.findElement(By.linkText("Find where am supposed to go without clicking me?")).click();
		//testleaf.findElement(By.className("wp-categories-title")).click();
		
		
		////*[@id="endpoint"]/tp-yt-paper-item/span
		
		
		}
	
	 

}
