package LearnSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling00 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LUGAR\\eclipse-workspace\\LugarSelelenium\\driverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");

		//for get the main window
		String parentWindow = driver.getWindowHandle();

		WebElement openHome = driver.findElement(By.id("home"));
		openHome.click();

		//for handling all windows 
		Set<String> allWindows = driver.getWindowHandles();
		
//switch to the child window
	
		for (String childWindow : allWindows) {
			driver.switchTo().window(childWindow);
		}
		WebElement editbox = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
		editbox.click();

		Thread.sleep(2000);

		driver.close(); 
		driver.switchTo().window(parentWindow);

		WebElement multipleWindow = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		multipleWindow.click();
		multipleWindow.click();

		int nOfWindows = driver.getWindowHandles().size();
		System.out.println("total opened windows are "+nOfWindows);
		
		WebElement closeMeButton = driver.findElement(By.id("color"));
		closeMeButton.click();
		//this line get the all the opened windows
		Set<String> newWindowHandles = driver.getWindowHandles();
		
		/*this line 1st enna pannuthunna for loop use pannu AOW kulla ella windows um konvaruthu for loop use
		 * panni then oru condition kutukrom defaut page oda AOW ah check pannu, match aahanallan driver ah
		 * other opened windows ku wwitch panni close maadi nu solrom  */
		for (String AllOpenedWindow : newWindowHandles) {
			if(!AllOpenedWindow.equals(parentWindow)) {
				driver.switchTo().window(AllOpenedWindow);
				driver.close();
			}
			}
		
		//driver.quit();
}
}
