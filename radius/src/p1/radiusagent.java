package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiusagent {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.radiusagent.com/network"); 	
		WebElement email = driver.findElement(By.xpath("//input[@type='email']")); 
		email.sendKeys("dhanushms2097@gmail.com");
		WebElement classes = driver.findElement(By.xpath("//input[@type='password']")); 	
		classes.sendKeys("7204293660");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']")); 	
		login.click();
		
		Thread.sleep(3000);
		driver.close();

	}

}
