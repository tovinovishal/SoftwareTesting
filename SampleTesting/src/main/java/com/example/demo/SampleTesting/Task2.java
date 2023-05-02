package com.example.demo.SampleTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2 {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		//URL
		driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		
	    //RECIPENT NAME
	    driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("Vishal");
	    
	
	    
	  //RECIPENT EMAIL
	  	 driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("vishalantony1817@gmail.com");
	  	 
	  	
	  	 
	  //YOUR NAME
    	 driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("vishal");
    	 
    	 
    	 
   	  //YOUR EMAIL
       	 driver.findElement(By.xpath("//*[@id=\"input-from-email\"]")).sendKeys("vishalantony1817@gmail.com");
       	 
       	 
       	Thread.sleep(5000);
	  	 
      //GIFT CERTIFICATE THEME
       	 driver.findElement(By.xpath("//*[@id=\"input-theme-6\"]")).click();
       	 
       
	 	
	  //MESSAGE
       	 driver.findElement(By.xpath("//*[@id=\"input-message\"]")).sendKeys("Merry Christmas!");
       	 
      
	  	
      //AMOUNT
       	driver.findElement(By.xpath("//*[@id=\"input-amount\"]")).sendKeys("50");
       	Thread.sleep(3000);
       	
       	
       	 
       //CHECKBOOX
       	driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input")).click();
      
    	Thread.sleep(2000);
       //CONTINUE
       	driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button")).click();
       	
	}
	
}
