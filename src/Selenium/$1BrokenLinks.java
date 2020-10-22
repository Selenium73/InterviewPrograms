package Selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class $1BrokenLinks {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.get("http://newtours.demoaut.com/");
		

		// capture links from a webpage
		List<WebElement> links = driver.findElements(By.tagName("a"));

		// number of links
		System.out.println(links.size());

		for (int i = 0; i < links.size(); i++) {
			// by using href attribute we can get URL of required link
			WebElement element = links.get(i);
			String url = element.getAttribute("href");

			URL link = new URL(url);

			// create connection using url object 'link'

			HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();
			Thread.sleep(2000);
			httpconn.connect();

			int rescode = httpconn.getResponseCode(); // return response code. if res code is above 400: broken link

			if (rescode >= 400) {
				System.out.println(url + "   " + " is a broken link");
			} else {
				System.out.println(url + "   " + " is a valid link");
			}
		}

	}
}
