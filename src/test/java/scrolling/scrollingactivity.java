package scrolling;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingactivity {
	public static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//step1: perform the scrolling by using the pixel value (0,1450);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		/*jse.executeScript("window.scrollBy(0,1450);", "");
		System.out.println(jse.executeScript("return window.pageYOffset;" ));
		//step 2: perform the scrolling upto footer top sign-in button*/
		//WebElement ele=driver.findElement(By.xpath("//span[@class='action-inner']"));
		//jse.executeScript("arguments[0].scrollIntoView();", ele);
		//System.out.println(jse.executeScript("return window.pageYOffset;" ));
		  //step 3: perform scrolling upto end of the page
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(jse.executeScript("return window.pageYOffset;" ));
		
		// step 4: perform scrolling upto initial stage of the page
		jse.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(jse.executeScript("return window.pageYOffset;" ));

		
	}

}
