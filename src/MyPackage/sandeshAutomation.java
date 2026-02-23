package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sandeshAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sandesh.com automation
		
		//checking github
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://timesofindia.indiatimes.com/us");
		
		WebElement autoButton = driver.findElement(By.xpath("//ul[@itemtype='http://www.schema.org/SiteNavigationElement']//a[normalize-space()='Auto']"));
		autoButton.click();
		String currerntHandle = driver.getWindowHandle();
		driver.switchTo().window(currerntHandle);
		
		if(driver.findElement(By.xpath("//h1[@class='i7RHK']")).isDisplayed()) {
			System.out.println("Auto page is loaded!");
			
		}
		
		
	

	}

}