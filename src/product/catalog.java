package product;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class catalog {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void cart() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://customlabels.universaltag.com/viewitems/custom-printed-tags-and-labels/thermal-transfer-and-direct-thermal-tags");
		driver.findElement(By.xpath("//a[.='larger image']")).click();
		Thread.sleep(3000);
		Set<String> child = driver.getWindowHandles();
		for(String v:child)
//		Thread.sleep(3000);
		driver.switchTo().window(v);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	
	}
	
	}