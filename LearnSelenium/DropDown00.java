package LearnSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown00 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LUGAR\\eclipse-workspace\\LugarSelelenium\\driverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		//dd=DropDown
		WebElement firstDD = driver.findElement(By.id("dropdown1"));

		Select selectDD = new Select(firstDD);
		selectDD.selectByIndex(2);

		WebElement secondDD = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select selectDD2 = new Select(secondDD);
		selectDD2.selectByVisibleText("Selenium");

		WebElement thirdBox = driver.findElement(By.id("dropdown3"));
		Select thirdDD = new Select(thirdBox);
		thirdDD.selectByValue("3");

		WebElement fourthBox = driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select fourthDD = new Select(fourthBox);
		List<WebElement> options = fourthDD.getOptions();
		int size = options.size();
		System.out.println(size);


		WebElement fifthBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
		fifthBox.sendKeys("Loadrunner");

		WebElement multiple = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select lastBox = new Select (multiple);
		lastBox.selectByIndex(1);
		lastBox.selectByIndex(2);



		Thread.sleep(9000);
		driver.quit();





	}

}
