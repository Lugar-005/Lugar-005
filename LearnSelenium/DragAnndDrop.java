package LearnSelenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAnndDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LUGAR\\eclipse-workspace\\LugarSelelenium\\driverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/drop.html");
		
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);//this action class able to perfom mouse action 
	    action.dragAndDrop(from, to).build().perform();
		//          or
		//action.clickAndHold(from).moveToElement(to).release().build().perform();
	    
	    
	    
	}

}
