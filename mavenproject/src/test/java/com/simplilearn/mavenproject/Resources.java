package com.simplilearn.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Resources {
	
	public static void addResource(WebDriver driver, WebDriverWait wait) {
		
		WebElement resourcesPage = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[aria-label='Navigation link to resources.']")));
		resourcesPage.click();
		
		WebElement addAResource = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[aria-label='Add a resource button']")));
		addAResource.click();
		
		WebElement addALink = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[aria-label='Add a link button']")));
		addALink.click();
		
		WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[aria-label='Link to resource']")));
		link.sendKeys("https://www.google.com");
		
		WebElement linkName = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[aria-label='Resource name']")));
		linkName.sendKeys("Google Homepage");
		
		WebElement linkDescription = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[aria-label='Description of resource']")));
		linkDescription.sendKeys("Where the internet begins and ends!");
		
		WebElement save = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[aria-label='Resource details submit button']")));
		save.click();
		
		String resourceName = "Google Homepage";
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("h6"), resourceName));
	}
}
