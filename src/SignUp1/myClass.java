package SignUp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String tesEmail="mhmmed_mhmmed5@hotmail.com";
		String testPass="Mhmmed12345";
		
		System.setProperty("webdriver.chrome.driver", "E:\\mohammed\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.booking.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[@class='bui-button__text'][normalize-space()='Register'])[1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys(tesEmail);
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

	}

}
