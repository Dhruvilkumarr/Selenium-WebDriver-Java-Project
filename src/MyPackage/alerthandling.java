package MyPackage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class alerthandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
	// Simple Alert 
	driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
	Alert alert = driver.switchTo().alert();
	alert.accept();
	String Result1 = driver.findElement(By.xpath("//p[@id='result']")).getText();
	if (Result1.equals("You successfully clicked an alert")) {
		System.out.println("Click OK, Successful!");
	}
	
	// Confirmation Alert
	
	driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
	alert.dismiss();
	String Result2 = driver.findElement(By.xpath("//p[@id='result']")).getText();
	if (Result2.equals("You clicked: Cancel")) {
		System.out.println("Click Cancle, Successful!");
	}
	
	// Prompt Alert
	
	driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
	alert.sendKeys("Hello I'm Dhruvil");
	alert.accept();
	String Result3 = driver.findElement(By.xpath("//p[@id='result']")).getText();
	if (Result3.equals("You entered: Hello I'm Dhruvil")) {
		System.out.println("Prompt Successful!");
	}

	}

}
