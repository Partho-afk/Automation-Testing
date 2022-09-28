package Advanced;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class double_click {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/ref=nav_logo/");
		
        Actions act = new Actions (driver);
		WebElement signin = driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-belt']/div[3]/div[1]/a[2]/span[1]"));
		
		//act.moveToElement(signin).doubleClick().build().perform()

		// ============= we can also perfor double click directly========
		act.doubleClick(signin).build().perform();
		
		//=========for right click==========
		/*act.moveToElement(signin).contextClick().build().perform();*/
		
		
	}

}
