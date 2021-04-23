package project_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_page_element {
	
	
	public WebElement email (WebDriver driver)
	{
		
		WebElement email = driver.findElement(By.xpath("/html/body/div/main/div/div/div[2]/div/form/div[1]/div/div/input"));
		return email;	
	}
	
	public WebElement password (WebDriver driver)
	{
		
		WebElement password = driver.findElement(By.xpath("/html/body/div/main/div/div/div[2]/div/form/div[2]/div/div/input"));
		return password;
		
	}
	
	public WebElement submit (WebDriver driver)
	{
		
		WebElement submit = driver.findElement(By.xpath("/html/body/div/main/div/div/div[2]/div/form/div[4]/button"));
		return submit;
		
	}

}
