package task;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class frames {
	public static WebDriver driver;

	public static void main(String[] args) {
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		WebElement frame1= driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		
		WebElement ele1=driver.findElement(By.name("mytext1"));
		ele1.sendKeys("Testing");
		driver.switchTo().defaultContent();
		//2 nd frame
		WebElement frame2= driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		WebElement ele2=driver.findElement(By.name("mytext2"));
		ele2.sendKeys("Developing");
		driver.switchTo().defaultContent();
		WebElement frame3= driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		WebElement ele3=driver.findElement(By.name("mytext3"));
		ele3.sendKeys("software development");
		driver.switchTo().frame(0);
		WebElement ele4=driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[1]"));
		ele4.click();
		driver.switchTo().defaultContent();
		
		WebElement frame4= driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);
		WebElement ele5=driver.findElement(By.name("mytext4"));
		ele5.sendKeys("Softwaretesting");
		driver.switchTo().defaultContent();
		
		
		WebElement frame5= driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		
		driver.switchTo().frame(frame5);
		WebElement ele6=driver.findElement(By.name("mytext5"));
		ele6.sendKeys("Execution completed");
		
		
	
		
		
		

	}
}
