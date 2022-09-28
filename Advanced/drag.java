package Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		Actions act = new Actions(driver);
		
		driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		
		
		WebElement src = driver.findElement(By.id("draggable"));
		
		WebElement dro = driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(src, dro).perform();
		
		//=======for validation=============
		if(dro.getText().matches("Dropped!"))
		{
			System.out.println("successfully Dropped..");
			
		}
		
		
	}

}
