package windows;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowshandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Set<String> Windowids=driver.getWindowHandles();
		//Approach 1 convert set to List identify the elements
		/*List<String> WindowList=new ArrayList(Windowids);
		String Parentid=WindowList.get(0);
		String Childid=WindowList.get(1);
		
		driver.switchTo().window(Childid);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(Parentid);
		System.out.println(driver.getTitle());
		*/
		
		
//		for(String Winid:Windowids) {
//			String title=driver.switchTo().window(Winid).getTitle();
//			if(title.equals("OrangeHRM")) {
//				System.out.println(driver.getCurrentUrl());
//			}
//	}
		for(String Winid:Windowids) {
			String title=driver.switchTo().window(Winid).getTitle();
			if(title.equals("OrangeHRM")||title.equals("Human Resources Management Software | OrangeHRM")) {
				driver.close();
			}
	}
		

	}



	}


