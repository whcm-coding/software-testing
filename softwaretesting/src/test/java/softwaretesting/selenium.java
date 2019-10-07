package softwaretesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {

	@Test
	public void test() {
		assertEquals("1","1");
	}
	@Test
	public void testBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zhuni\\Desktop\\chromedriver.exe");
		WebDriver  webDriver = new ChromeDriver();
		webDriver.manage().deleteAllCookies();
		Thread.sleep(5);
		webDriver.get("http://www.baidu.com");
		System.out.println("成功打开google浏览器！");
		webDriver.close();
	}
	
	@Test
	public void testBaidu() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zhuni\\Desktop\\chromedriver.exe");
		WebDriver  webDriver = new ChromeDriver();
		webDriver.manage().deleteAllCookies();
		Thread.sleep(5);
		webDriver.get("http://www.baidu.com");
		webDriver.findElement(By.id("kw")).clear();
		webDriver.findElement(By.id("kw")).sendKeys("武汉传媒学院");
		Thread.sleep(6000);
		webDriver.close();
	}
	@Test
	public void testName() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zhuni\\Desktop\\chromedriver.exe");
		WebDriver  webDriver = new ChromeDriver();
		webDriver.manage().deleteAllCookies();
		Thread.sleep(5);
		webDriver.get("http://www.baidu.com");
		System.out.println("成功打开google浏览器！");
		
		webDriver.findElement(By.id("kw")).clear();
		webDriver.findElement(By.id("kw")).sendKeys("武汉传媒学院校长");
		Thread.sleep(1000);
		String text = webDriver.findElement(By.className("op_exactqa_s_answer")).getText();
		assertEquals(text, "桑建平");
		Thread.sleep(6000);
		webDriver.close();
	}
}
