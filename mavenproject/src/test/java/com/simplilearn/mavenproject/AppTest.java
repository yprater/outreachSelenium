package com.simplilearn.mavenproject;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppTest {
	
	static String email = "";
	static String password = "";
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuri II\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(45)); // Wait up to 45 seconds
		
		Login.login(driver, email, password);
		
		CreateSuccessPlan.create(driver, wait); // creates a plan
		Timeline.timelineEvent(driver, wait); // adds a timeline event to the plan
		Resources.addResource(driver, wait); // adds a resource to the plan
		DeleteSuccessPlan.delete(driver, wait); // deletes the plan
		
		String expected = "Make it a done deal with a plan";
		String pageSource = driver.getPageSource();		
		if (pageSource.contains(expected)) {
			System.out.println("The tests all passed!");
		}
		else {
			System.out.println("Something went wrong...");
		}
	}
	
}