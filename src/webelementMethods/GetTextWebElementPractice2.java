package webelementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextWebElementPractice2 {
	public static void main(String[] args) {
		
	
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.facebook.com/");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      
      WebElement header = driver.findElement(By.xpath("//button[@name='login']"));
      String text = header.getText();
      System.out.println(text);
      driver.quit();
}
}
