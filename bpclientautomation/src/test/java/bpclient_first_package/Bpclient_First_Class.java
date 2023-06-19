package bpclient_first_package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bpclient_First_Class {

	public static void main(String[] args) throws InterruptedException { 
		WebDriverManager.firefoxdriver().setup(); 
		
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://pw1.bpclient.click/");
		//Thread.sleep(2000);
		String a = driver.getCurrentUrl();
		System.out.println("Checking all the buttons & visited URLS:");
		System.out.println("1." +a);
		
		driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[1]/a/span/i")).click();
		driver.findElement(By.partialLinkText("Biography")).click();
		String b = driver.getCurrentUrl();
		System.out.println("2." +b);
		
		
		driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[1]/a/span/i")).click();
		driver.findElement(By.partialLinkText("Achievement")).click();
		String c = driver.getCurrentUrl();
		System.out.println("3." +c);
		
		driver.findElement(By.xpath("/html/body/header/nav/a/div/div/div[2]/p[1]")).click();
		String d = driver.getCurrentUrl();
		System.out.println("4." +d);
		
		driver.findElement(By.partialLinkText("Event")).click();
		String e = driver.getCurrentUrl();
		System.out.println("5." +e);
		
		driver.findElement(By.partialLinkText("News")).click();
		String f = driver.getCurrentUrl();
		System.out.println("6." +f); 
		
		driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[4]/a/span/i")).click();
		driver.findElement(By.linkText("Press")).click();
		Thread.sleep(2000);
		
		//for scrolling
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scroll(0,300)");
	    Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/a[2]")).click();
		String g = driver.getCurrentUrl();
		System.out.println("7." +g);
		
		driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[4]/a/span/i")).click();
		driver.findElement(By.partialLinkText("Publications")).click();
		String h = driver.getCurrentUrl();
		System.out.println("8." +h);
		
		driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[4]/a/span/i")).click();
		driver.findElement(By.partialLinkText("Quotes")).click();
		String i = driver.getCurrentUrl();
		System.out.println("9." +i);
		
		driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[4]/a/span/i")).click();
		driver.findElement(By.partialLinkText("Speeches")).click();
		String j = driver.getCurrentUrl();
		System.out.println("10." +j); 
		
		driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[4]/a/span/i")).click();
		driver.findElement(By.linkText("Interviews")).click();
		String k = driver.getCurrentUrl();
		System.out.println("11." +k); 
		
		driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[5]/a")).click();
		driver.findElement(By.linkText("Photo Gallery")).click();
		String l = driver.getCurrentUrl();
		System.out.println("12." +l);
		
		
		driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[5]/a")).click();
		driver.findElement(By.partialLinkText("Video Gallery")).click();
		String m = driver.getCurrentUrl();
		System.out.println("13." +m); 
		
		driver.findElement(By.partialLinkText("Get Invoved")).click();
		Thread.sleep(2000); 
		
		
		js.executeScript("window.scroll(0,400)");
		
		driver.findElement(By.xpath("/html/body/section[2]/div/form/div/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".\\32 xl\\:text-3xl")).click();
		Thread.sleep(2000);
		
		js.executeScript("window.scroll(0,800)");
		
		driver.findElement(By.cssSelector("button.rounded-md")).click();
		Thread.sleep(2000);
		String n = driver.getCurrentUrl();
		System.out.println("14." +n); 
		
		driver.findElement(By.xpath("/html/body/header/nav/a/div/div/div[2]/p[1]")).click(); 
		
		driver.findElement(By.linkText("Contact Us")).click();
		Thread.sleep(2000);
		String o = driver.getCurrentUrl();
		System.out.println("15." +o); 
	   
		
		
		//driver.close();
		driver.quit();
		
		

	}

}
