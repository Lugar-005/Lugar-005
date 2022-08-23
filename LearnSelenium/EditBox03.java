package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBox03 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LUGAR\\eclipse-workspace\\LugarSelelenium\\driverChrome\\chromedriver.exe");
		WebDriver testLeaf = new ChromeDriver()	;
		testLeaf.get("http://leafground.com/home.html");
		
		testLeaf.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/h5")).click();
		testLeaf.findElement(By.id("email")).sendKeys("lugar24@yahoo.com");
		
		WebElement append = testLeaf.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		append.sendKeys("eee");
		
		WebElement getText = testLeaf.findElement(By.name("username"));
		String text = getText.getAttribute("value");
		System.out.println(text);
		
		WebElement clearBox = testLeaf.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clearBox.clear();
		
		WebElement checkBox = testLeaf.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		boolean enabled = checkBox.isEnabled();
		System.out.println(enabled);
	//testLeaf.quit();

	}

}
