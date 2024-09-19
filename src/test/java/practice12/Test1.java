package practice12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
public static WebDriver driver;
	public static void main(String[] args) {
    driver=new ChromeDriver();
    driver.get("snapchat");
    driver.navigate().to("snapchat");
    
	}

}
