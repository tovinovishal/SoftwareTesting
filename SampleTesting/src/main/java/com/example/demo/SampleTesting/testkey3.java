package com.example.demo.SampleTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testkey3 {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		
		//launch the url
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		//input box
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("401",Keys.ENTER);
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
		Thread.sleep(5000);
		
		//delete the customer id 402
		//enter the value 402
		
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).clear();
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("402",Keys.ENTER);
		alert.accept();
		
		String msg=alert.getText();
		System.out.println(msg);
		alert.accept();
		
	}

}
