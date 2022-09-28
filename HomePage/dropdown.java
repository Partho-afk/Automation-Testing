package HomePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		driver.findElement(By.name("firstname")).sendKeys("partho");
		
		WebElement day = driver.findElement(By.id("day"));
		
		Select d1 = new Select(day);
		
		//d1.selectByIndex(22);
		d1.selectByValue("22");
		//d1.selectByVisibleText("Day");
		System.out.println(day.getAttribute("value"));
		
		
		WebElement month = driver.findElement(By.id("month")); 
		
		Select m1 = new Select(month);
		//m1.selectByIndex(1);
		m1.selectByVisibleText("Nov");
		System.out.println(month.getAttribute("value"));
		
		//==============check all the check one by one number/text===============
		List <WebElement> dd = d1.getOptions();
		System.out.println(dd.size());
		
		for(int i = 0; i< dd.size() ; i++)
		{ 
		 String txt = dd.get(i).getText();
		 System.out.println(txt);
		 dd.get(i).click();
		
		
		}
		//================radio button===================
		List <WebElement> rbutton = driver.findElements(By.name("sex"));
		
		int cnt = rbutton.size();
		System.out.println(cnt);
		
		//============radio button selection=============
		
		for(int i=0 ; i<cnt ; i++)
		{
			String txt = rbutton.get(i).getText();
			System.out.println(txt);
			
			rbutton.get(i).click();
			Thread.sleep(3000);
		}
		
		
	}

}
