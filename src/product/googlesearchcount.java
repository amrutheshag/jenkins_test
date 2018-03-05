package product;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class googlesearchcount {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void cart() throws InterruptedException {

    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.co.in/");
    driver.manage().window().maximize();        
    driver.findElement(By.id("lst-ib")).sendKeys("iloveindia"+Keys.ENTER);
Thread.sleep(3000);
    int result = driver.findElements(By.tagName("//@href")).size();
    System.out.println(result);   
	}

    }