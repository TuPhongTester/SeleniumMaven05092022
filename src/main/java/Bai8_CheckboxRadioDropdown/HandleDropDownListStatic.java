package Bai8_CheckboxRadioDropdown;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.*;

public class HandleDropDownListStatic extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();
        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        // Khởi tạo đối tượng select và giá trị của thẻ select trong HTML
        Select select = new Select(driver.findElement(By.xpath("//select[@id='select-demo']")));

        System.out.println("Giá trị default: " + select.getFirstSelectedOption().getText());
        System.out.println("Kiểm tra dropdown có hỗ trợ dạng multi-select hay không: "+ select.isMultiple());
        System.out.println("Kiểm tra dropdown có:" + select.getOptions().size()+ " giá trị");

        // get option với các hàm của class Select
        select.selectByVisibleText("Saturday");
        sleep(5);
        System.out.println("Giá trị lần 1:" + select.getFirstSelectedOption().getText());

        select.selectByValue("Sunday");
        sleep(5);
        System.out.println("Giá trị lần 2:" + select.getFirstSelectedOption().getText());

        select.selectByIndex(3);
        sleep(5);
        System.out.println("Giá trị lần 3:" + select.getFirstSelectedOption().getText());

        // closeDriver();
    }


}
