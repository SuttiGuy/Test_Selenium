import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TC_05_NotEnterEmail {

	@Test
	void test05() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Home
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?biz=false&cc=TH&continue=https%3A%2F%2Fwww.google.com%3Fhl%3Dth&dsh=S1962944456%3A1680965813808190&flowEntry=SignUp&flowName=GlifWebSignIn&hl=th");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Suttipoxn");
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Kaewsakunnee");
//		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Guyeiei2003guy");
		driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input")).sendKeys("Guyzapan");
		driver.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input")).sendKeys("Guyzapan");
		driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button/span")).click();
		driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/div[3]/div/div[1]/div/div/div[1]/div/input")).click();
		String result = driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[2]/div[1]/div/div[2]/div[2]/div")).getText();
		assertEquals("เลือกที่อยู่ Gmail", result);
		Thread.sleep(5000);
		driver.close();
		
	}

}
