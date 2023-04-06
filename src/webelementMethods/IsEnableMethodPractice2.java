package webelementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableMethodPractice2 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement loginbutton =driver.findElement(By.xpath("//button[@type='submit']"));
    System.out.println(loginbutton.isEnabled());
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("admin");
	if(loginbutton.isEnabled())
		loginbutton.click();
	else 
		System.out.println("disable2");
	driver.quit();
	
}
}
