package Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.shohoz.com/bus-tickets");
		
		driver.findElement(By.xpath("//body/div[@id='main_wrapper']/section[@id='content']/div[@id='search_sec']/div[3]/div[1]/form[1]/ul[1]/div[5]/div[2]/button[1]")).click();
		Thread.sleep(3000);
		
		String txt = driver.switchTo().alert().getText();
		System.out.println(txt);
		
		//==========for clicking ok button==========
		if(txt.contentEquals("Please choose departure city."))
		{
		driver.switchTo().alert().accept();
		System.out.println("correct alert appeared...");
		
		}
		else
			System.out.println("Invalid Alert..");
		driver.close();
		Thread.sleep(2000);

	}
}
