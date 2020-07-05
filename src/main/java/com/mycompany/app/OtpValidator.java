package com.mycompany.app;

import java.util.stream.StreamSupport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.twilio.base.ResourceSet;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.twiml.voice.Stream;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OtpValidator {
	public static final String ACCOUNT_SID = "ACa36f2949ae43207f4887fc9ffc84253f";
	public static final String AUTH_TOKEN = "2b61e637d662edad819fb760f2c9b346";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		driver.findElement(By.linkText("Start here.")).click();
		driver.findElement(By.id("ap_customer_name")).sendKeys("Michael");
		driver.findElement(By.xpath("//ul[@role='application']//li//a[contains(text(),'United States +1')]"))
				.sendKeys("5092939966");
		driver.findElement(By.id("ap_password")).sendKeys("Mike6746");
		driver.findElement(By.id("continue")).click();
		//String smsBody = getMessage();
		//System.out.println(smsBody);

		driver.findElement(By.id("auth-pv-enter-code")).sendKeys("");
	}



}
