package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasic01 {

	public static void main(String[] args) {
		/*below three coding is the basic and mandatory every selenium program starts with this*/
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LUGAR\\eclipse-workspace\\LugarSelelenium\\driverChrome\\chromedriver.exe");
		WebDriver amazon = new ChromeDriver();//object
		amazon.get("https://www.amazon.in/");//get key word for get the url
		
/*for close the opened window we can use the key word *close* either *quit*
 * close key just close the window but the action remain active
 * quit method closes all browser windows and ends the WebDriver session
 */
		//amazon.close();
		//amazon.quit();
		
//finding the element by object creation
		
		/*WebElement search = amazon.findElement(By.id("twotabsearchtextbox"));//for goes to search box
		search.sendKeys("iphone");//for type in search box
		
		WebElement click = amazon.findElement(By.id("nav-search-submit-button"));
		click.click();*/
	
// also we can write all of this method in a single vode also
		amazon.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone"+Keys.ENTER);
		                                                                   //we can access every keyboard button from using Keys.
//
		
		}

}
