package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipText {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LUGAR\\eclipse-workspace\\LugarSelelenium\\driverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/tooltip.html");
		
		WebElement TTT = driver.findElement(By.id("age"));
		String Text = TTT.getAttribute("title");
		System.out.println(Text);
		
		driver.quit();



	}

}
