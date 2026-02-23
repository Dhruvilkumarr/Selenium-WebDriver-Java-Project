package MyPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FirstTextCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub       
		 WebDriver driver = new FirefoxDriver();
	        driver.get("https://www.google.com");
	        String title = driver.getTitle();
	        System.out.println("Page Title : " + title);
	        System.out.println("URL: " + driver.getCurrentUrl());
	      
	        
	}

}
 