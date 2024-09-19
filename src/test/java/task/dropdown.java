package task;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class dropdown {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement ele1=driver.findElement(By.xpath("//input[@name='username']"));
		ele1.sendKeys("vamsikumar");
		WebElement ele2=driver.findElement(By.xpath("//input[@name='password']"));
		ele2.sendKeys("CBFY24");
		WebElement ele3=driver.findElement(By.xpath("//input[@id='login']"));
		ele3.click();
		Thread.sleep(2000);
		WebElement dropdown1=driver.findElement(By.xpath("//select[@name='location']"));
		Select dropdown=new Select(dropdown1);
		//using selected visible text
		dropdown.selectByVisibleText("Brisbane");
		
		// using selected value
		WebElement dropdown2 =driver.findElement(By.xpath("//select[@name='hotels']"));
		Select dropdowna=new Select(dropdown2);
		dropdowna.selectByValue("Hotel Sunshine");
		// selected index number
		WebElement dropdown3 =driver.findElement(By.xpath("//select[@name='room_type']"));
		Select dropdownb=new Select(dropdown3);
		
		dropdownb.selectByIndex(3);
		// dropdown select by indexvalue
		WebElement dropdown4 =driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select dropdownc=new Select(dropdown4);
		
		dropdownc.selectByIndex(2);
		driver.findElement(By.xpath("//input[@name='datepick_in']")).sendKeys("28/07/2024");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='datepick_out']")).sendKeys("30/07/2024");
		// using index number
		WebElement dropdown5 =driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select dropdownd=new Select(dropdown5);
		
		dropdownc.selectByIndex(1);
		// using value
		WebElement dropdown6 =driver.findElement(By.xpath("//select[@name='child_room']"));
		Select dropdowne=new Select(dropdown6);
		
		dropdownc.selectByValue("2");
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
		
		
		
		
		
		
		
		
		

	}
}
