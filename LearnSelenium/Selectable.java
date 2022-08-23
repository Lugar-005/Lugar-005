package LearnSelenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LUGAR\\eclipse-workspace\\LugarSelelenium\\driverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/selectable.html");
		
		List<WebElement> select = driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
		int size = select.size();
		System.out.println(size);
	

		Actions action = new Actions(driver);
		
		action.keyDown(Keys.CONTROL).click(select.get(0)).
				click(select.get(1)).click(select.get(2)).build().perform();
		
		

	}


}
