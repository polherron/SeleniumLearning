package com.seleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSelectItemsOld {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Paul/eclipse-workspace/WebDriverDemo/src/main/we"
				+ "bapp/SelectItemTest.html");
		
		WebElement selectOptions = driver.findElement(By.id("select1"));
		
		List<WebElement> options = selectOptions.findElements(By.tagName("option"));

		for (WebElement option : options) {

			if("Maybe".equals(option.getText().trim()))
			{
				option.click();   
			}
		}
	}

}
