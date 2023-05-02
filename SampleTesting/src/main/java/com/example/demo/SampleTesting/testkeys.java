package com.example.demo.SampleTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testkeys {
	public static void main(String args[])
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		//launch the URL
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();		
		
		//drag
		driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		
		//dropped
		driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		
		//Actions
		Actions act=new Actions(driver);
		
		
		//drop drag
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		
		//drop dropped
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		//performing add option
		act.dragAndDrop(drag,drop).build().perform();
		
		//run and close
		driver.quit();
	
		
		
		
	}
}
