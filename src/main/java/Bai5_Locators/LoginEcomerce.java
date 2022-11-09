package Bai5_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginEcomerce {

    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Mở trang eCommerce.com
        driver.get("https://demo.activeitzone.com/ecommerce/login");
        Thread.sleep(1000);
        //Click nút Login
        driver.findElement(By.id("email")).sendKeys("phong.tuchi@gmail.com");
        driver.findElement(By.name("password")).sendKeys("123456");
        //driver.findElement(By.linkText("Forgot password ?")).click();
        //driver.findElement(By.partialLinkText("Forgot")).click();
        driver.findElement(By.xpath("//input[@id='remember']")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        //Tắt browser
        //driver.quit();
    }


}
