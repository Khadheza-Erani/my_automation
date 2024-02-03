package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandleSelect extends DriverSetUp{
    @Test
    public void test_select() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement dropdown =driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        Thread.sleep(5000);
        dropdown.click();
        Select select = new Select(dropdown);
        select.selectByIndex(2);
        Thread.sleep(5000);
        select.selectByVisibleText("Option3");
        Thread.sleep(5000);
        System.out.println(select.getFirstSelectedOption().getText());
        Thread.sleep(5000);

    }
}
