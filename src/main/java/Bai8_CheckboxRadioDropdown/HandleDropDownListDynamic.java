package Bai8_CheckboxRadioDropdown;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class HandleDropDownListDynamic extends BaseTest{
    public static void main(String[] args) throws InterruptedException {
        createDriver();
        // Bước 1. Truy cập trang web
        driver.get("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
        Thread.sleep(10);

        // Bước 2. Click vào trường Category
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']")).click();
        Thread.sleep(5);

        // Bước 3. Search từ khóa cần tìm
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']/parent::a/following-sibling::div//input")).sendKeys("Hotels");
        Thread.sleep(5);

        // Bước 4. Click chọn category hiển thị trong dropdown phía dưới
        // driver.findElement(By.xpath("//li[@class='active-result result-selected']")).click();

        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER).perform();

        closeDriver();
    }
}
