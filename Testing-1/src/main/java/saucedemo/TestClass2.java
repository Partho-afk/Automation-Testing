package saucedemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//It will open the website show title with URL login & it will visit all the link and logout 
		WebDriverManager.chromedriver().setup();
		
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.saucedemo.com/");
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		//title
		String title = Driver.getTitle();
		System.out.println("Website title:");
		System.out.println(title);
		
		String URL = Driver.getCurrentUrl();
		System.out.println("ALL the visited URL's:");
		System.out.println("1. "+URL);
		
		Driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Driver.findElement(By.id("login-button")).click();
		
		String URL1 = Driver.getCurrentUrl();
		System.out.println("2. "+URL1);
		
		Driver.findElement(By.linkText("Twitter")).click();
		Driver.findElement(By.linkText("Facebook")).click();
		Driver.findElement(By.linkText("LinkedIn")).click();
		
		WebElement button = Driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
		Thread.sleep(2000);
		button.click();
		Thread.sleep(2000);
		button.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		String URL2 = Driver.getCurrentUrl();
		System.out.println("3. "+URL2);
		
		
		
		
		//Driver.close();
		Driver.quit();  //it will close others window
		
		

	}

}
