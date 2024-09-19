package file;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class fileuploading {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		WebElement file=driver.findElement(By.id("file-upload"));
		Thread.sleep(3000);
		//file.sendKeys("C:\\Users\\pc\\Downloads\\team module list1");
		Actions ac=new Actions(driver);
		ac.moveToElement(file).click().perform();
		StringSelection ss=new StringSelection("C:\\Users\\pc\\Downloads\\team module list1");
		Thread.sleep(3000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Thread.sleep(3000);
		Robot r=new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
       // C:\Users\pc\Downloads
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        
        WebElement submit=driver.findElement(By.id("file-submit"));
        Thread.sleep(3000);
		submit.click();
		
	}

}

