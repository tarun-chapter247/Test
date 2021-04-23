package seleniumgrid;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.ConnectException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class SeleniumGrid {
	
	public static void main(String[]arg) throws MalformedURLException, ConnectException
	{

    WebDriver driver;
    String baseURL, nodeURL;
    
    try {

        baseURL = "http://renotechs.com/";
        nodeURL = "http://172.23.164.113:5566";
        DesiredCapabilities capability = DesiredCapabilities.firefox();
        capability.setBrowserName("firefox");
        capability.setPlatform(Platform.WIN10);
        driver = new RemoteWebDriver(new URL(nodeURL), capability);
        
        driver.get(baseURL);
        

        if (driver.getPageSource().contains("MOBILE TESTING")) {
            Assert.assertTrue(true, "Mobile Testing Link Found");
        } else {
            Assert.assertTrue(false, "Failed: Link not found");
        }
        
        driver.quit();
        
    }
    catch(MalformedURLException e)
    {
    	System.out.println(e);
    }

	}
}