package project_methods;

import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import excel_data_fetch_update.ReadExcelSheet;
import excel_data_fetch_update.WriteExcelResult;
import project_elements.Login_page_element;
import screenshot_cature.Screeshot_capture;

public class Login_into_account {

	public void login() throws Exception,NoSuchElementException
	{
		
		Login_page_element element = new Login_page_element();
		Screeshot_capture cap = new Screeshot_capture();
		
		try {
		
		ReadExcelSheet rs = new ReadExcelSheet(); 
		ArrayList userName = rs.readExcelData(0,0); 
		ArrayList excelpass = rs.readExcelData(0,1);
		
		System.out.println(userName.size());
		
		for(int i=0; i <userName.size(); i++) 
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Lenovo\\Desktop\\Tarun-Workspace\\Test\\Testing_data\\chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://tantra.c247.website/admin/login");
			String str1 = (String) userName.get(i);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			element.email(driver).sendKeys(str1);
			
			
			String pass = (String) excelpass.get(i);
			element.password(driver).sendKeys(pass);
			
			element.submit(driver).click();
			
			String pagetitle = driver.getTitle();
			System.out.println(pagetitle);
			
			if (pagetitle.contains("Tantrany - Dashboard"))
			{
				WriteExcelResult.setCellData("Pass",0,i+1, 2);
			}
			else
			{
				WriteExcelResult.setCellData("failed",0, i+1, 2);
				cap.captureScreenshot(driver, "loginfailed");
						
			}
			
			
			driver.close(); 
		
		}
		
		System.out.println("Test is successful"); 
		
	}catch(IOException|NullPointerException e)
		{
			System.out.println(e);
		}
	}
	
	WebDriver driver;
	public void loginforpas() {
		try {
		Login_page_element element = new Login_page_element();
		
		
		}catch(NullPointerException e)
		{
			System.out.println(e);
		}
	}

}
