package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_MouseOperations {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	        driver.get("https://the-internet.herokuapp.com/");
	 /*
	  * Important mouse methods available
	  * moveToElement() -> Mouse Hover
	  * contextClick() -> Right Click
	  * doubleClick() -> Double Click
	  * clickAndHold, release, dragAndDrop, dragAndDropBy       
	  */
	     driver.findElement(By.xpath("//a[normalize-space()='Hovers']")).click();
	     String hoverWindowHandle = driver.getWindowHandle();
	     driver.switchTo().window(hoverWindowHandle);
	     
	     //Practical Challenge 1 – Mouse Hover (Real Website)
	     
	     WebElement userOne = driver.findElement(By.xpath("//div[@class='example']//div[1]//img[1]"));
	     Actions act = new Actions(driver);
	     act.moveToElement(userOne).perform();
	     
	     if (driver.findElement(By.xpath("//h5[normalize-space()='name: user1']")).isDisplayed()){
	    	 
	     System.out.println("Hover Success");
	     }
	     
	  // Go back
	     driver.navigate().back();
	         
	     // Practical Challenge 2 – Drag and Drop
	     driver.findElement(By.xpath("//a[normalize-space()='Drag and Drop']")).click();
	     String dragAndDropWindowHandle = driver.getWindowHandle();
	     driver.switchTo().window(dragAndDropWindowHandle);
	     
	     WebElement source = driver.findElement(By.xpath("//div[@id='column-a']"));
	     
	     WebElement Target = driver.findElement(By.xpath("//div[@id='column-b']"));
	     act.dragAndDrop(source, Target).perform();
	    
	    
	    	 System.out.println("dragAndDrop Success");


	}
}
