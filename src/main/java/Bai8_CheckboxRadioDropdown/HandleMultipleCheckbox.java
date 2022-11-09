package Bai8_CheckboxRadioDropdown;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HandleMultipleCheckbox extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();
        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        List<WebElement> listCheckbox = driver.findElements(By.xpath("//div[normalize-space()='Multiple Checkbox Demo']/following-sibling::div//input[@type='checkbox']"));
        System.out.println(listCheckbox.size());

        for (int i =1 ; i<= listCheckbox.size(); i++){
             Thread.sleep(1);
             driver.findElement(By.xpath("//label[normalize-space()='Option "+ i +"']/input")).click();
        }

        // Kiểm tra lại đã được click chưa, lưu ý lấy xpath của input
        for (int i =1 ; i<= listCheckbox.size(); i++){
            Thread.sleep(1);
            boolean isSelected = driver.findElement(By.xpath("//label[normalize-space()='Option "+ i +"']/input")).isSelected();
            System.out.println(isSelected);
        }

        // closeDriver();
    }
}
