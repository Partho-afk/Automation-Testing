package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.("async")).click();
		
		//driver.findElement(By.linkText("Cookies")).click();
		
	    
		
		//driver.findElement(By.linkText("Create a Page")).click();
		
		//driver.findElement(By.partialLinkText("Cookie")).click();
		
		
		//driver.close();
		
		/*======================================== xpath
		 *absolute -- using attributes ---- //input[@id='email']
		 *relative -- using on position
		 
		 */
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("welcome");
		
		
	}

}
