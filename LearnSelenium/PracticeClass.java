package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 public class PracticeClass {

public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\LUGAR\\eclipse-workspace\\LugarSelelenium\\driverChrome\\chromedriver.exe" );
	WebDriver youtube = new ChromeDriver();
	youtube.get("https://www.youtube.com/");
	
	
	WebElement searchbox = youtube.findElement(By.name("search_query"));
	searchbox.sendKeys("let her go");
	WebElement searchButton = youtube.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon"));
		searchButton.click();
		youtube.manage().window().maximize();
		WebElement clickimage = youtube.findElement(By.id("img"));
		clickimage.click();
		//clickimage.click();
	
}
}
