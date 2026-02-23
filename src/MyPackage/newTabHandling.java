package MyPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newTabHandling {

	public static void main(String[] args) {
	
		// Selection of the Web driver
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		// Stored the value of Parent window handle
		String parentID = driver.getWindowHandle();
		
		WebElement Button = driver.findElement(By.xpath("//a[normalize-space()='Click Here']"));
		Button.click();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		// for each element of the collection(Set of aalWindows)
		for(String windowID : allWindows) {
			
			if(!windowID.equals(parentID)) {
				System.out.println("Switch to new Window Successful!");
				
				// Returning back to Parent window
				driver.switchTo().window(parentID);
			}
		}
		
		
		
		
		
		

	}

}
