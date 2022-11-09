package Bai8_CheckboxRadioDropdown;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleCheckbox extends BaseTest {
    public static void main(String[] args) {
        createDriver();
        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
        WebElement checkboxOne = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        boolean  checkboxStatusBefore = checkboxOne.isSelected();
        System.out.println("trạng thái checkbox trước khi chọn: " + checkboxStatusBefore);
        if(checkboxStatusBefore == false){
            checkboxOne.click();
        }
        boolean checkboxStatusAfter = checkboxOne.isSelected();
        System.out.println("trang thái checkbox sau khi chọn:" + checkboxStatusAfter);
        WebElement message = driver.findElement(By.xpath("//div[@id='txtAge']"));
        System.out.println("Trạng thái Message: " + message.isDisplayed());
        System.out.println(message.getText());


        //MULTI CHECKBOX


        // closeDriver();
    }
}
