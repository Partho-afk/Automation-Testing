package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	
	public static void main(String [] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement Unm = driver.findElement(By.id("email"));
		Unm.sendKeys("partho201776dhaka@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("123124sadapass");
		
		//driver.findElement(By.name("login")).click();
		
		//link
        /*driver.findElement(By.linkText("Forgotten password?")).click();*/
        
        //partial link text
        //driver.findElement(By.partialLinkText("Forgotten")).click();
        
        
        //for css-selector
        /*driver.findElement(By.cssSelector("#email")).sendKeys("welcome");*/
		
	}

}
