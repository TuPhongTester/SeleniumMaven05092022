package Bai7_WebDriver;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ListWebElement extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();
        driver.get("https://app.hrsale.com/");
        driver.findElement(By.xpath("//input[@id='iusername']")).sendKeys("frances.burns");
        driver.findElement(By.xpath("//input[@id='ipassword']")).sendKeys("frances.burns");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(6000);

        List<WebElement> listMenu = driver.findElements(By.xpath("//ul[@class='pc-navbar']/li"));
        System.out.println(listMenu.get(3).getText());
       // listMenu.get(3).click();
        for(int i=0; i<listMenu.size(); i++) {
            System.out.println(listMenu.get(i).getText());

        }
    }
}
