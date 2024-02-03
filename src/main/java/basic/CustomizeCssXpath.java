package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomizeCssXpath extends DriverSetUp {
    @Test

    public void testNopCommerce() throws InterruptedException {

        driver.get("https://demo.nopcommerce.com/");

        //locate the search option from nopcommerce by css selector

        driver.findElement(By.cssSelector(" form>input ")).sendKeys("Apple MacBook Pro 13-inch");
        Thread.sleep(5000);
         //driver.findElement(By.xpath("//form/input")).clear();
        //Thread.sleep(5000);

        ///locate the search button by multiple css selector
        driver.findElement(By.cssSelector(" button[type='submit'][class='button-1 search-box-button']"));

        //locate the search button by multiple css selector And I will do get text then save it into the search_btn_text variable then print for the console
        String search_btn_text =  driver.findElement(By.xpath("//button[@type='submit' and @class='button-1 search-box-button']")).getText();
       System.out.println(search_btn_text);

       //if locate is not so easy then take the previous child  with start with and try to  make it unique value given the attribute value until unique id 1/1

        System.out.println(driver.findElement(By.xpath("//h2/a[starts-with(@href, '/apple-macbook-pro')]")).getText());

        // we can do the same things  inn css  selector just give it to the ^ without putting starts-with.it means you have to put the correct first letter on attribute value end name does not matter
        driver.findElement(By.cssSelector("a[href^= '/apple-macbook']")).click();



       //here I apply the contains method for locate add_to_cart button and i use element variable for gain get text this get text will be stored into add to cart variable as a string so that we can print out as string in the console.
        // Contains Is only use for random value so that we can locate it with any parts of the attribute value.

       WebElement element = driver.findElement(By.xpath("//*[contains(@id,'cart-button-4')]"));
       String add_to_cart=element.getText();
        System.out.println("add_to_cart");
        Thread.sleep(1000);


        //CONTAINS ONLY USE FOR XPATH BUT IF I TAKE THE SAME FACILITIES IN THE CSS SO I HAVE TO GIVE THE STAR SIGN AFTER THE ATTRIBUTE NAME AND THERE IS NO NEED TO ADD TAG NAME

        driver.findElement(By.cssSelector("[id*='cart-button-4']")).click();

        Thread.sleep(500);

        //locate the pop up message by link text


        driver.findElement(By.linkText("shopping cart")).click();

        Thread.sleep(5000);

      String actual_price=  driver.findElement(By.xpath("//tr/td[5]/preceding-sibling::td[1]")).getText();
        System.out.println(actual_price);
        String price=  driver.findElement(By.xpath("//tr/td[5]/following-sibling::td[1]")).getText();

        Assert.assertEquals(actual_price,"$1,800.00");
        Assert.assertEquals(price,"$3,600.00");



        Thread.sleep(5000);










    }
}
