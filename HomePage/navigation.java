package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.google.com/");
		 driver.navigate().to("https://www.google.com/");
		
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(5000); // it will wait some time and then launch second page in 2sec
		
		driver.navigate().back();
		Thread.sleep(4000);
		System.out.println("Back Done....");
		
		driver.navigate().forward();
		Thread.sleep(4000);
		System.out.println("Forward done....");
		
		driver.navigate().refresh();
		System.out.println("Refresh done....");
		

	}

}
