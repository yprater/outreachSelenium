package com.simplilearn.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DeleteSuccessPlan {
	
	public static void delete(WebDriver driver, WebDriverWait wait) {
		
		String ariaLabel = "Navigation link to general settings.";
		WebElement settings = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[aria-label='"+ ariaLabel +"']")));
		settings.click();
		
		ariaLabel = "Sidebar navigation link to admin settings.";
		WebElement adminSettings = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[aria-label='"+ ariaLabel +"']")));
		adminSettings.click();
		
		ariaLabel = "Delete this plan button.";
		WebElement deleteThisPlan = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[aria-label='"+ ariaLabel +"']")));
		deleteThisPlan.click();
		
		ariaLabel = "Delete this plan confirmation button.";
		WebElement deletePlan = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[aria-label='"+ ariaLabel +"']")));
		deletePlan.click();
		
		String deleted = "Make it a done deal with a plan";
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("p"), deleted));
	}

}
