package org.tcs;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mani {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manikantan\\eclipse-workspace\\Mani\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.moneycontrol.com/markets/fno-market-snapshot");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement stats = driver.findElement(By.xpath("(//div[@class='leftD'])[2]"));
		stats.click();
		TakesScreenshot shot=(TakesScreenshot)driver;
		File S= shot.getScreenshotAs(OutputType.FILE);
		File file=new File("C:\\Users\\Manikantan\\Pictures\\New folder\\mani\\output.png");
		Thread.sleep(2000);
		FileUtils.copyFile(S, file);
	}

}
