package LearnSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\LUGAR\\eclipse-workspace\\LugarSelelenium\\driverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver()	;
		driver.navigate().to("http://leafground.com/pages/table.html");
		
		List<WebElement> column = driver.findElements(By.tagName("th"));
		int columnSize = column.size();
		System.out.println(columnSize);
		
		List<WebElement> row = driver.findElements(By.tagName("tr"));
		int rowSize = row.size();
		System.out.println(rowSize);
		
		WebElement locatorValue = driver.findElement(By.xpath("//td[normalize-space()='Learn Locators'][1]//following::td[1]"));
		String LVtext = locatorValue.getText();
		System.out.println(LVtext);
		
		
		
	}

}
