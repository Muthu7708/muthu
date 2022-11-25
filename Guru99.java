import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class Guru99 {
WebDriver driver;
	
	public void page() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	
	// int size = driver.findElements(By.tagName("iframe")).size();
	// System.out.println(size);
	JavascriptExecutor  executor = (JavascriptExecutor) driver;
	WebElement sign = driver.findElement(By.xpath("//img[@alt='Headsets']"));
	sign.click();
	Actions actions=new Actions(driver);
	
	WebElement list= driver.findElement(By.xpath("//span[text()='Razer Kraken Gaming Headset: Lightweight Aluminum Frame, Retractable Noise Isolating Microphone, For PC, PS4, PS5, Switch, Xbox One, Xbox Series X & S, Mobile, 3.5 mm Audio Jack – Green']"));
	list.click();
	
	driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
	driver.findElement(By.xpath("//a[@class='hmenu-item'][@data-menu-id='4']")).click();
	driver.findElement(By.xpath("(//a[text()='Games'][@class='hmenu-item'])[1]")).click();
	WebElement goosebumbs=driver.findElement(By.xpath("//span[text()='Goosebumps Night of Scares'][@class='a-truncate-cut']"));
goosebumbs.click();
	
	
//	WebElement mouse =driver.findElement(By.xpath("//a[text()='Sell products on Amazon']"));
//	executor.executeScript("arguments[].click()",mouse);
	
	}
}
