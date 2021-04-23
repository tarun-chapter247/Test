package project_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Profile_elements {
	
	
	public WebElement email (WebDriver driver)
	{
		
		WebElement email = driver.findElement(By.xpath("/html/body/div/main/div/div/div[2]/div/form/div[1]/div/div/input"));
		return email;	
	}

}
