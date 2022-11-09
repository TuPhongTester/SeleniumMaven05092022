package Bai8_CheckboxRadioDropdown;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleRadioButton extends BaseTest {
    public static void main(String[] args) {
        createDriver();
        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");

        WebElement radioButton = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//label[normalize-space()='Male']/input"));
        System.out.println(radioButton.isSelected());

        if(radioButton.isSelected()== false ){
            radioButton.click();
        }
        System.out.println(radioButton.isSelected());

        WebElement radio5to15 = driver.findElement(By.xpath("//h4[normalize-space()='Age Group :']/following-sibling::label[normalize-space()='5 to 15']/input"));
        radio5to15.click();
        System.out.println("trạng thái Radio radio 5 to 15 : " + radio5to15.isSelected());

        WebElement radio0to5 = driver.findElement(By.xpath("//h4[normalize-space()='Age Group :']/following-sibling::label[normalize-space()='0 to 5']/input"));
        WebElement radio15to50 = driver.findElement(By.xpath("//h4[normalize-space()='Age Group :']/following-sibling::label[normalize-space()='15 to 50']/input"));

        System.out.println("Trạng thái radio 0 to 5: " + radio0to5.isSelected());
        System.out.println("Trạng thái radio 15 to 50: " + radio15to50.isSelected());

        //closeDriver();

    }
}
