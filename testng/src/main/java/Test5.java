import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test5 {
	WebDriver driver;
	
	public void TC_001() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.godaddy.com/en-in");
		driver.manage().window().maximize();	
			
	}
	
	

}
