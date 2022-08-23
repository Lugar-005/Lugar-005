package LearnSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotExample {
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\LUGAR\\eclipse-workspace\\LugarSelelenium\\firefox driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");

		TakesScreenshot SS = (TakesScreenshot) driver;
		File src = SS.getScreenshotAs(OutputType.FILE);
		System.out.println(src);

		File destination = new File("D:\\Enter into IT baby\\\\Selenium\\\\screenshots using selenium\\amazonHomePage.jpg");
		FileUtils.copyFile(src, destination);
		//D:\\Enter into IT baby\\Selenium\\screenshots using selenium\\amazonHomePage.jpg"


	}


}
