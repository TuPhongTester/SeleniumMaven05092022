package phongtester.com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class TestSelenium {

 public static void main(String[] args) {

  //Khởi tạo browser với Chrome
  WebDriver driver;
  WebDriverManager.chromedriver().setup();
  driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

  //Mở trang anhtester.com
  driver.get("https://anhtester.com/");

  //Click nút Login
  driver.findElement(By.xpath("//a[@id='btn-login']")).click();
  driver.findElement(By.xpath("//input[@name='email']")).click();
  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("phong.tuchi@gmail.com");
  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");

  //Tắt browser
  //driver.quit();
 }

}
