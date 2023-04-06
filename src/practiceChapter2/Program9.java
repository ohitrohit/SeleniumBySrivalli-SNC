package practiceChapter2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program9 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-1.html");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    WebElement cat = driver.findElement(By.id("box1"));
    WebElement box= driver.findElement(By.id("dropBox"));
    
    Actions a = new Actions(driver);
    a.dragAndDrop(cat, box).perform();
    
    Thread.sleep(2000);
    driver.quit();
    
}
}
