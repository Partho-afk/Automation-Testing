package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		//Thread.sleep(4000);
		
		String a = driver.getCurrentUrl();
		System.out.println("All The URL's WE visited: "); 
		System.out.println("1. "+a);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		
		
		String b = driver.getCurrentUrl();
		System.out.println("2. "+b);
		
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")).click(); //using xpath because this button did not support lintext
		String c = driver.getCurrentUrl();
		System.out.println("3. "+c);
		Thread.sleep(2000);
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("continue-shopping")).click();
		
		String d = driver.getCurrentUrl();
		System.out.println("4. "+d);
		
		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")).click();
		Thread.sleep(2000);
		
		String e = driver.getCurrentUrl();
		System.out.println("5. "+e);
		
		driver.findElement(By.id("remove-sauce-labs-backpack")).click(); // for removing item and it's working perfectly 
		Thread.sleep(2000);
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);
		
		String f = driver.getCurrentUrl();
		System.out.println("6. "+f);
		
		driver.findElement(By.name("firstName")).sendKeys("Partho");
		//without felling the last name it will not work so website is working perfectly
		driver.findElement(By.name("lastName")).sendKeys("Protim");
		driver.findElement(By.id("postal-code")).sendKeys("1215");
		Thread.sleep(2000);
		
		driver.findElement(By.id("continue")).click();
		String g = driver.getCurrentUrl();
		System.out.println("7. "+g);
		
		driver.findElement(By.id("finish")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(2000);
		String h = driver.getCurrentUrl();
		System.out.println("8. "+h);
		
		 
		
		driver.close();
		//driver.quit();
		
		/*Saucedemo web-site order system is working perfectly we 
		  can see that we can add & remove order and after that 
		  we can confirm order 
		 */
		
		
	}

}
