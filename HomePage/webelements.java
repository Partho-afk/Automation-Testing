package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelements {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//for showing title of the url 
		
		String title = driver.getTitle();
		System.out.println("title is :"+title);
		
		
		
		//for showing current url
		System.out.println(driver.getCurrentUrl());
		
		//for showing tag name 
		
		WebElement Unm = driver.findElement(By.id("email"));
		
		System.out.println(Unm.getAttribute("id"));
		System.out.println(Unm.getTagName());
		
		
		
		
		
		
		//driver.close();
		
	}

}
