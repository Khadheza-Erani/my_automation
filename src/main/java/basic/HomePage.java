package basic;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage extends DriverSetUp {
    @Test

    //take a method
    public void  loadGoogleHomePage() throws InterruptedException {
        // take new variable driver because  I want to open a b a browser and doing all the activities
       // WebDriver driver= new ChromeDriver();
        // put the  link which want to load by helping of get and variable driver

        driver.get(" https://www.google.com/");

        // NOW I WANT  TO SEE MY  TITLE AND CURRENT URL
        Assert.assertEquals(driver.getTitle(),"Google");
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/");



        /// for stop sometimes

        //Thread.sleep(5000);

        //for close the driver

       // driver.close();




    }

}
