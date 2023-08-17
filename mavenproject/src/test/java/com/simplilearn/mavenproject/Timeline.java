package com.simplilearn.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Timeline {
	
	public static void timelineEvent(WebDriver driver, WebDriverWait wait) {
		
		WebElement phaseButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span.sp-orca-MuiButton-label")));
		phaseButton.click();
		
		WebElement expand = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[aria-label='Expand']")));
		expand.click();
		
		WebElement addActivity = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[aria-label='New activity button']")));
		addActivity.click();
		
		WebElement newTask = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[aria-label='New task menu item']")));
		newTask.click();
		
	}

}
