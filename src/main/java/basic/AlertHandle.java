package basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertHandle extends DriverSetUp {
    @Test
    public void test_alert() throws InterruptedException {
        //website load
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        //alert box location and click
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Thread.sleep(5000);
        //create an object by helping selenium alert class so that we can move the current alert window.
        Alert alert = driver.switchTo().alert();

        //now check the alert ber text with assert where alert.getText collect the website values and I am a js alert is coppied from the website compare
        Assert.assertEquals(alert.getText(),"I am a JS Alert");

        //after clicking accept the okay button
        alert.accept();
        Thread.sleep(5000);

        //locate the message is okay or not after pressing olay
        String result = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Thread.sleep(5000);
        //check by assert So we need to create a variable and store like result
        Assert.assertEquals(result,"You successfully clicked an alert");
        Thread.sleep(5000);

        //Second alert locate and click,applying cancel button
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        //USE THW BEFORE GENERATED VARIABLE FOR  MOVED TO THE CURRENT ALERT
         alert = driver.switchTo().alert();
        //NOW I WANT TO CANCEL  THE ALERT
         alert.dismiss();
        Thread.sleep(5000);
       // locate the message after cancel
        result= driver.findElement(By.xpath("//p[@id='result']")).getText();
        Thread.sleep(5000);
        //compare
        Assert.assertEquals(result,"You clicked: Cancel");
        Thread.sleep(5000);


        //Second alert locate and click applying okay button
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        //USE THW BEFORE GENERATED VARIABLE FOR  MOVED TO THE CURRENT ALERT
        alert = driver.switchTo().alert();
        //NOW I WANT TO CANCEL  THE ALERT
        alert.accept();
        Thread.sleep(5000);
        // locate the message after cancel
        result= driver.findElement(By.xpath("//p[@id='result']")).getText();
        Thread.sleep(5000);
        //compare
        Assert.assertEquals(result,"You clicked: Ok");
        Thread.sleep(5000);


        //Second alert locate and click,applying cancel button
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        //USE THW BEFORE GENERATED VARIABLE FOR  MOVED TO THE CURRENT ALERT
        alert = driver.switchTo().alert();
        //NOW I WANT TO CANCEL  THE ALERT
        alert.dismiss();
        Thread.sleep(5000);
        // locate the message after cancel
        result= driver.findElement(By.xpath("//p[@id='result']")).getText();
        Thread.sleep(5000);
        //compare
        Assert.assertEquals(result,"You entered: null");
        Thread.sleep(5000);


        //Second alert locate and click applying okay button
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        //USE THW BEFORE GENERATED VARIABLE FOR  MOVED TO THE CURRENT ALERT
        alert = driver.switchTo().alert();
        // give the input
        alert.sendKeys("Erani Zaman");
        //NOW I WANT TO CANCEL  THE ALERT
        alert.accept();
        Thread.sleep(5000);
        // locate the message after cancel
        result= driver.findElement(By.xpath("//p[@id='result']")).getText();
        Thread.sleep(5000);
        //compare
        Assert.assertEquals(result,"You entered: Erani Zaman ");
        Thread.sleep(5000);

    }
}
