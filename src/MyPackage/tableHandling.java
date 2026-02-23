package MyPackage;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tables");
		
		// Print Total Rows and Columns.
		// Logic List Rows and Columns in the table
		// .size() method
	
		List<WebElement> Columns = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
		System.out.println("Total Columns : " + Columns.size());
		
		List<WebElement> Rows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		System.out.println("Total Rows: " + Rows.size());

		// Print Entire Table
		
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td"));
		
		for (WebElement rows : allRows) {
			List<WebElement> cells = rows.findElements(By.tagName("td"));
	
		for (WebElement cell : cells) {
			System.out.print(cell.getText() + "");
		}
		System.out.println();
		}
		
		// Find Email for Jason Doe
		

					
				String Emailid = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr/td[2][contains(text(),'Jason')]")).getText();
				System.out.println("Jason Doe's Email Id: " + Emailid);
				}
				
				
	
		
		
	}

	

