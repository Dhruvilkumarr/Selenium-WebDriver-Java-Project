package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		/* Task 1
		 * Switch to top frame
		 * Then switch to middle frame
		 * Print text from middle frame */
		WebElement topFrame = driver.findElement(By.xpath("//frame[@name='frame-top']"));
		driver.switchTo().frame(topFrame);
		WebElement middleFrame = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
		driver.switchTo().frame(middleFrame);
		String Title = driver.findElement(By.xpath("//div[@id='content']")).getText();
		System.out.println(Title);
		driver.switchTo().defaultContent();
		/* Task 2
		 * Switch to bottom frame
		 * Print text */
		WebElement bottomFrame = driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
		driver.switchTo().frame(bottomFrame);
		String bottomTitle = driver.findElement(By.xpath("//body")).getText();
		System.out.println(bottomTitle);
		
		
		
		

	}

}
