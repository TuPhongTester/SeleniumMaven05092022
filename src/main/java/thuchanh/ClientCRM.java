package thuchanh;

import common.BaseTest;
import org.openqa.selenium.By;

public class ClientCRM extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();
        driver.get("https://rise.fairsketch.com/signin");
        driver.findElement(By.xpath("//input[@id='email']")).clear();
        driver.findElement(By.xpath("//input[@id='password']")).clear();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@demo.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("riseDemo");
        driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
        Thread.sleep(6000);

        public static void openClientPage(){
            driver.findElement(By.xpath("//span[normalize-space()='Clients']")).click();
            driver.findElement(By.xpath("//div[@id='page-content']//a[normalize-space()='Clients']")).click();
        }

        public static void enterdataAddClent(){
            driver.findElement(By.xpath("//a[normalize-space()='Add client']")).click();
            driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("Sanjay Napad");
            driver.findElement(By.xpath(""))
            driver.findElement(By.xpath(""))
            driver.findElement(By.xpath(""))
            driver.findElement(By.xpath(""))
            driver.findElement(By.xpath(""))
            driver.findElement(By.xpath(""))




        }

        closeDriver();
    }
}
