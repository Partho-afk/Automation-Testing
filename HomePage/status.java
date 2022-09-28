package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class status {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selfcare.dotinternetbd.com/customer/login");
		
		//image
		WebElement img = driver.findElement(By.xpath("//body/div[@id='main-wrapper']/div[@id='particles-js']/canvas[1]"));
		
        System.out.println(img.isDisplayed());
        
        System.out.println(img.isEnabled());
        
        System.out.println(img.isSelected());
        
        
        //======================================================================
        //clear
        
        WebElement unm = driver.findElement(By.id("USERNAME"));
        unm.sendKeys("welcome");
        Thread.sleep(3000);
        unm.clear();
        unm.sendKeys("rongon4987");
        
        WebElement pass = driver.findElement(By.name("PASS"));
        pass.sendKeys("test");
        
       
        
        
	}

}
