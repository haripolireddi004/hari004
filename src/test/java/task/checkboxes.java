package task;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class checkboxes {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(" https://www.hyrtutorials.com/p/basic-controls.html");
		//driver.manage().window().maximize();
		int width=700;
		int height=1500;
		Dimension d=new Dimension(width,height);
		driver.manage().window().setSize(d);
		
		//  Approach1> select a Specific check box
		// WebElement ele1=driver.findElement(By.xpath("//input[@id='hindichbx']"));
		// ele1.click();
		// Approach 2> Select a multiple Checkboxes
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@class='bcCheckBox'and@type='checkbox']"));
	  /* for(int i=0;i<checkbox.size();i++) {
			checkbox.get(i).click();
		}
	   */
	   //Approach 3 select checkboxes last 3 checkboxes
		/*for(  int i=3;i<checkbox.size();i++) {
			checkbox.get(i).click();
		}*/
		
		//Approach -4 select first2checkboxes
		/*for(int i=0;i<2;i++) {
			checkbox.get(i).click();
		}*/
		
		//Approach-5 select random check boxes
		
		for (int i=0;i<checkbox.size();i+=2) {
			checkbox.get(i).click();
		}
		
	   
		
		
		
		

	}

}
