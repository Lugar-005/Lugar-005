package LearnSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LUGAR\\eclipse-workspace\\LugarSelelenium\\driverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/autoComplete.html");
		
		WebElement search = driver.findElement(By.id("tags"));
		search.sendKeys("s");
		
		Thread.sleep(3000);
		
		List<WebElement> courseList = driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		
		for (WebElement listOfCourse : courseList) {
			
			if (listOfCourse.getText().equals("SOAP")){
				listOfCourse.click();
				break;
			}
			
		}
		
		
		

}
	}
