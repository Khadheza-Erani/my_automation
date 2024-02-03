package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

//EXTENDS DRIVER SETUP FOR MAIN CLASS

public class GoogleSearchBox extends DriverSetUp {

    @Test
    //CREATE A METHOD
    public void googleSearchBox() throws InterruptedException {
        // I WANT TO EXPERIMENT WITH GOOGLE SEARCH BOX
        driver.get("https://www.google.com/");
        // FIND THE ELEMENT DRIVER FIND ELEMENT RETURN YPE WEB ELEMENT AND FOR SAVE SEARCH BOX VARIABLE
        //LOCATE WITH ID
        // WebElement searchBox = driver.findElement(By.id("APjFqb"));
        //LOCATE WITH  NAME
        //WebElement searchBox = driver.findElement(By.name("q"));

        //LOCATE WITH CLASS NAME
        //WebElement searchBox = driver.findElement(By.className("gLFyf"));
        //LOCATE WITH tag NAME
        WebElement searchBox = driver.findElement(By.tagName("textarea"));
       searchBox.sendKeys("Erani zaman");
        Thread.sleep(5000);
        searchBox.clear();

       // now I WANT TO LOCATE THE GMAIL AND PRINT THE TEXT IN IT UNDER THE  SAME PAGE ON THE CONSOLE
             WebElement gmailLink =driver.findElement(By.linkText("Gmail"));
        System.out.println(gmailLink.getText());
        // now I WANT TO LOCATE THE image  AND click with partial link text.
        WebElement imageSearch =driver.findElement(By.partialLinkText("mages"));
        //imageSearch.click();
        //PRINT THE TEXT IN IT UNDER THE  SAME PAGE ON THE CONSOLE
        System.out.println(imageSearch.getText());

        //noW I WANT TO LOCATE THE BANGLADESH WORD BY CSS SELECTOR
       //WebElement countryName =driver.findElement(By.cssSelector("div[class='uU7dJb']"));
       // System.out.println(countryName.getText());
        //noW I WANT TO LOCATE THE BANGLADESH WORD BY XPATH

        WebElement countryName =driver.findElement(By.xpath("//div[@class='uU7dJb']"));
        System.out.println(countryName.getText());

        // noW I WANT TO LOCATE THE  language  WORD BY XPATH and print it

        WebElement languageOption =driver.findElement(By.xpath("//div[@id='SIvCob']"));
        System.out.println(languageOption.getText());


       Thread.sleep(5000);
    }


}
