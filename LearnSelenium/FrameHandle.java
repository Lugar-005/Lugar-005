package LearnSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LUGAR\\eclipse-workspace\\LugarSelelenium\\driverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver()	;
		driver.get("http://leafground.com/pages/frame.html");


		driver.switchTo().frame(0);//this line swiitch to frame
		WebElement click0 = driver.findElement(By.id("Click"));
		click0.click();

		driver.switchTo().defaultContent();//this line come back to main html 

		driver.switchTo().frame(1); 
		driver.switchTo().frame("frame2"); //this for interatct with frame which is present inside the frame
		WebElement click1 = driver.findElement(By.id("Click1"));
		click1.click();

		driver.switchTo().defaultContent();

		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		int totalFrames = frames.size();//for get the total number of frames.
		System.out.println(totalFrames);

	}
}

