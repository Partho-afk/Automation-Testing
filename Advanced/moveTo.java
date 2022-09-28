package Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveTo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Actions act = new Actions(driver);
		
	    WebElement	unm = driver.findElement(By.id("email"));
	    
	    WebElement pwd = driver.findElement(By.xpath("//input[@id='pass']")); 
	    
	    WebElement log = driver.findElement(By.name("login"));
	    
	    int x = log.getLocation().getX();
	    int y = log.getLocation().getY();
	    
	    unm.click();
	    act.moveToElement(unm).sendKeys("partho1010@gmail.com").build().perform();
	    act.moveToElement(pwd).sendKeys("test").build().perform();
	    act.moveByOffset(x, y).click().build().perform();
	    
	    
	}

}
