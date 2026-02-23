package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/upload");
	//File upload by using sendKeys() method 
	//When No windows or MacOS pop-up appears 
	
	WebElement chooseFile = driver.findElement(By.xpath("//input[@id='file-upload']"));
	//Paste Exact path of the file you want to upload from your local system.
	chooseFile.sendKeys("C:\\Users\\dhruv\\Pictures\\Screenshots\\Screenshot 2026-01-26 112306.png");
	WebElement uploadButton = driver.findElement(By.xpath("//input[@id='file-submit']"));
	uploadButton.click();
	
	if (driver.findElement(By.id("uploaded-files")).isDisplayed()) {
		System.out.println("File Uploaded");
	}

	
	
	

	}

}
