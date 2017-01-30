﻿

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Valtech {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\JARS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        //Navigate to HOME PAGE
		driver.get("http://www.valtech.com");
		driver.manage().window().maximize();
	//Navigate to SERVICES
		driver.findElement(By.xpath(".//*[@id='navigationMenuWrapper']/div/ul/li[2]/a/span")).click();
	//Navigate to JOBS
		driver.findElement(By.xpath(".//*[@id='navigationMenuWrapper']/div/ul/li[5]/a/span")).click();
	//Navigate to CONTACT
		driver.findElement(By.xpath("html/body/div[1]/header/div/nav/div/div[1]/label[1]/div/a/div/div/div[1]/i")).click();


		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		 driver.quit();
		 System.exit(0);
	}

}
