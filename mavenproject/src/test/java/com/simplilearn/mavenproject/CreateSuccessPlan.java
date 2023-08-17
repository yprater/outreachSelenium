package com.simplilearn.mavenproject;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.*;

public class CreateSuccessPlan {

	public static void create(WebDriver driver, WebDriverWait wait) {		
		driver.get("https://web.outreach-staging.com/opportunities/54/plan/spl/orca-opp-tab-entry");
		
		String ariaLabel = "Create a plan button.";
		WebElement planCreation = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[aria-label='"+ ariaLabel +"']")));
		planCreation.click();

		ariaLabel = "Start from blank radio button.";
		WebElement blankTemplate = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[aria-label='"+ ariaLabel +"']")));
		blankTemplate.click();
		
		ariaLabel = "New plan flow next button.";
		WebElement next = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[aria-label='"+ ariaLabel +"']")));
		next.click();
		
		ariaLabel = "Add details to plan input for plan name.";
		WebElement planName = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[aria-label='"+ ariaLabel +"']")));
		planName.sendKeys("Test Plan - Create a Plan");
		
		ariaLabel = "Add details to plan input for customer name.";
		WebElement customer = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[aria-label='"+ ariaLabel +"']")));
		customer.sendKeys("ABC Incorporated");
		
		ariaLabel = "Add plan details create plan button.";
		WebElement createPlan = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[aria-label='"+ ariaLabel +"']")));
		createPlan.click();
		
		String planTitle = "Test Plan - Create a Plan";
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("p"), planTitle));
	}
}
