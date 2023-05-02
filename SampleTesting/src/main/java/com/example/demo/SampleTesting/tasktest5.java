package com.example.demo.SampleTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tasktest5 {
	public static void main(String args[])
	{
		WebDriverManager.edgedriver().setup();
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver chromedriver=new ChromeDriver(co);
		chromedriver.get("");
		
	}

}
