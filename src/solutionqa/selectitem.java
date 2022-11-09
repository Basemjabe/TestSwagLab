package solutionqa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class selectitem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		String passs="secret_sauce";
				String userNasme="standard_user";	
				driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(userNasme);
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(passs);
				driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
						
	          int ExpectedItem =6;					
		List <WebElement> MyList = driver.findElements(By.className("btn"));
	for (int i=0 ;i<MyList.size() ;i++) 
	{
		MyList.get(i).click();
	
	}
				
	String actualItemsAdded = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).getText();
	
	
	int theRealNumber = Integer.parseInt(actualItemsAdded);
	Assert.assertEquals(theRealNumber,ExpectedItem );
	
	
	
		
		
	}

	}
