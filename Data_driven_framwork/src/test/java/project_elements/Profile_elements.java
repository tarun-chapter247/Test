package project_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Profile_elements {
	
	
	public WebElement frist_name (WebDriver driver)
	{
		
		WebElement fname = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[2]/form/div/div[2]/div[1]/div[1]/div/input"));
		return fname;	
	}
	
	public WebElement last_name (WebDriver driver)
	{
		
		WebElement lname = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[2]/form/div/div[2]/div[1]/div[2]/div/input"));
		return lname;	
	}
	
	public WebElement uploadimage (WebDriver driver)
	{
		
		WebElement uploadimage = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[2]/form/div/div[2]/div[2]/div/div/div[2]/div/input"));
		return uploadimage;	
	}
	
	public WebElement updateprofilebutton (WebDriver driver)
	{
		
		WebElement updateprofilebutton = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[2]/form/div/div[2]/div[3]/div/button"));
		return updateprofilebutton;	
	}
	

}
