package com.simplilearn.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	public static void login(WebDriver driver, String email, String password) {
		driver.get("https://accounts.outreach-staging.com/users/sign_in");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user_email")).sendKeys(email);
		driver.findElement(By.name("button")).click();
		driver.findElement(By.id("user_password")).sendKeys(password);
		driver.findElement(By.name("button")).click();
		
	}
}
