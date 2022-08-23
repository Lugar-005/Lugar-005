package LearnSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAndCheckBox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LUGAR\\eclipse-workspace\\LugarSelelenium\\driverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");

		WebElement yes = driver.findElement(By.id("yes"));
		yes.click();

WebElement checked = driver.findElement(By.xpath("(//input[@name='news'])[1]"));
boolean firstB = checked.isSelected();
WebElement unchecked = driver.findElement(By.xpath("(//input[@name='news'])[2]"));
boolean secondB = unchecked.isSelected();
System.out.println(firstB);
System.out.println(secondB);

WebElement age = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[1]"));
age.click();

//Thread.sleep(5000);
driver.get("http://leafground.com/pages/checkbox.html");

WebElement java = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[1]"));
java.click();

WebElement check = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/input"));
boolean seleSelected = check.isSelected();
System.out.println("selenium box selected this condition is"+seleSelected );

WebElement notSelctdB = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[1]"));
WebElement SelctdB = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[2]"));
if(notSelctdB.isSelected()) {
	notSelctdB.click();
}
else {SelctdB.isSelected();
	SelctdB.click();}


List<WebElement> clickAll = driver.findElements(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[4]"));
for (int i=0;i<clickAll.size();i++) {
	clickAll.get(i).click();
}

Thread.sleep(50000);
driver.quit();

	}

}

