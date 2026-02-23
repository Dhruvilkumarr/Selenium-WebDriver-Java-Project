package MyPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class typesofWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Explicit wait = wait under a condition
		 * need to use WebDriverWait class to create wait object
		 * For that we imported WebDriverWait Class
		 */
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.xpath("//button[normalize-space()='Start']")).click();
		
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[normalize-space()='Hello World!']")));
	String currenrWindow = driver.getWindowHandle();
	driver.switchTo().window(currenrWindow);
	if (driver.findElement(By.xpath("//h4[normalize-space()='Hello World!']")).isDisplayed()) {
		System.out.println("Task Sucessful!");
	}
	
		

	}

}
