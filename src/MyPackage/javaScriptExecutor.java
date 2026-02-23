package MyPackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import java.util.List;

public class javaScriptExecutor{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/infinite_scroll");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 0; i<=3; i++) {
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
	
		}
		
		List<WebElement> paragraphs =
                driver.findElements(By.className("jscroll-added"));

        System.out.println("Total paragraphs loaded: " + paragraphs.size());

	}

}
