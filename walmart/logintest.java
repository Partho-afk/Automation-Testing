package walmart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logintest {

	public static void main(String[] args) {

		WebDriver driver = base.getDriver();
		
		driver.get("https://www.aiub.edu");
		
		WebElement element=driver.findElement(By.className("fa fa-user"));		
		element.click();
		
		 //element =driver.findElement(By.id("email"));
		 //element.sendKeys("");
	}

}
