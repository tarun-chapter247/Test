package Test_cases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import functionality.Browser_setup;

public class Open_URL {
	
	
	 

	public static void main(String[] args) throws InterruptedException, ArrayIndexOutOfBoundsException, MalformedURLException, IOException {
		
		String Wordpress_URL[] = new String[5];
//		String Wordpress_URL[] = new String[5];
		Wordpress_URL[0] = "http://renotechs.com/";
		Wordpress_URL[1] = "http://associatedarborists.com//";
		Wordpress_URL[2] = "http://louisbasquecorner.com//";
		Wordpress_URL[3] = "http://eladobecafe.com//";
		Wordpress_URL[4] = "http://reviewmortgagemike.com//";
		
		
		for (int i = 0; i < Wordpress_URL.length; i++) {
			
			String URL = Wordpress_URL[i];

			ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
			ExtentReports extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
			ExtentTest logger=extent.createTest(URL);
			htmlReporter.loadXMLConfig("C:\\Users\\Lenovo\\Desktop\\Tarun-Workspace\\Test\\html-config.xml");
			
			Logger log = Logger.getLogger("Open_URL.class");
			Browser_setup browser = new Browser_setup();
			log.info("Browser Setup Sucessfully");
			
			logger.log(Status.INFO, "Browser Setup Sucessfully");
			
			try {

				browser.open_Chrome_browser(URL);
				log.info("Chrome Browser opened Sucessfully");
				logger.log(Status.INFO, "Chrome Browser opened Sucessfully");
				Thread.sleep(5000);
				browser.URL_status(URL);
				log.info("Website Responsce code genrated scuccessfully");	
				logger.log(Status.INFO, "Website Responsce code genrated scuccessfully");
				browser.close_Browser();
				log.info("Chrome Browser closed successfully");
				logger.log(Status.INFO, "Chrome Browser closed successfully");
				
				browser.open_firefox_browser(URL);
				log.info("Firefox Browser Opened Successfully");
				logger.log(Status.INFO, "Firefox Browser Opened Successfully");
				Thread.sleep(5000);
				browser.URL_status(URL);
				log.info("Website Responsce code genrated scuccessfully");	
				logger.log(Status.INFO, "Website Responsce code genrated scuccessfully");
				browser.close_Browser();
				log.info("Firefox Browser closed successfully");
				logger.log(Status.INFO, "Firefox Browser closed successfully");
				
				browser.open_Edge_browser(URL);
				log.info("Edge Browser opened Sucessfully");
				logger.log(Status.INFO, "Edge Browser opened Sucessfully");
				Thread.sleep(5000);
				browser.URL_status(URL);
				log.info("Website Responsce code genrated scuccessfully");	
				logger.log(Status.INFO, "Website Responsce code genrated scuccessfully");
				browser.close_Browser();
				log.info("Edge Browser closed successfully");
				logger.log(Status.INFO, "Edge Browser closed successfully");
			
			} catch (NullPointerException | InvalidArgumentException |ArrayIndexOutOfBoundsException e) 
			{
				System.out.println(e);
			}
			
		}

	}

}