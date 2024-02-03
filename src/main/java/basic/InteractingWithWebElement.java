package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InteractingWithWebElement extends DriverSetUp {
    @Test
    public void webElementTest() throws InterruptedException {
        //load the url which I want to test
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        // LOCATE THE SEARCH BOX WITH CSS SELECTOR RETURN WEB ELEMENT AND SAVE THE INPUT_BOX
        WebElement input_box =driver.findElement(By.cssSelector("#autocomplete"));
        //I WANT TO SEE THE TAG NAME IF ITS RETURN TEXT SO I PUT STRING AND SAVE THE STRING IN THE  TAG_NAME VARIABLE
        String tag_name = input_box.getTagName();
        // PRINT THE TAG NAME IN THE IN THE CONSOLE
        System.out.println("tag_name");
        // GIVE SOME INPUT AND CLEAR IT
        input_box.sendKeys("Erani");
        Thread.sleep(1000);
        input_box.clear();
        Thread.sleep(1000);
        String attribute = input_box.getAttribute("placeholder");
        System.out.println(attribute);
        Thread.sleep(1000);
        //test textbox  is displayed or not
        System.out.println(input_box.isDisplayed());
        Thread.sleep(1000);
        // LOCATE THE SEARCH BOX WITH XPATH  RETURN WEB ELEMENT AND SAVE THE CLICK_BOX
        WebElement click_box =driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
        click_box.click();
        click_box.isDisplayed();
        System.out.println("clickcbox is selected:" );
        Thread.sleep(1000);
        // see the css value



    }

}
