package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ButtonThings04 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LUGAR\\eclipse-workspace\\LugarSelelenium\\driverChrome\\chromedriver.exe");
		WebDriver Buttons = new ChromeDriver();
		Buttons.get("http://leafground.com/");
		Buttons.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/img")).click();
		
		//for get position of the button
		WebElement getPosition = Buttons.findElement(By.id("position"));
		Point location = getPosition.getLocation();
		int xValue = location.getX();
		int yValue = location.getY();
		System.out.println("x value is :"+xValue+"y value is : "+yValue);
		
		//find button color 
		WebElement Findcolor = Buttons.findElement(By.id("color"));
		String colorBox = Findcolor.getCssValue("background-color");
		System.out.println(colorBox);
		
		//find the height and width of the button
		WebElement heightAndWidth = Buttons.findElement(By.id("size"));
		 int height = heightAndWidth.getSize().getHeight();
		 int width = heightAndWidth.getSize().getWidth();
		 System.out.println("height of button is :"+height+" "+"width of button"+width);
		 
		 //home page 
		 Buttons.findElement(By.xpath("//*[@id=\"home\"]")).click();
		 
		 
	//    Buttons.quit();
	
	}

}
