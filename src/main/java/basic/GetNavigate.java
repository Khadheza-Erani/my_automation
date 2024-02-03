package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class GetNavigate extends DriverSetUp{
    @Test
    public void testNavigate() throws InterruptedException {
        //load with driver + get
        driver.get("https://www.google.com/");
        //load with driver + navigate
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(2000);
        //back
        driver.navigate().back();
        Thread.sleep(2000);
        //forward
        driver.navigate().forward();
        Thread.sleep(2000);
        //refresh
        driver.navigate().refresh();
        Thread.sleep(2000);
        //open new tab
        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(2000);
        //open new WINDOW
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        Thread.sleep(2000);


            }
            @Test
            public void testNewWindow() throws InterruptedException {
            driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
                System.out.println(driver.getWindowHandles());

                System.out.println(driver.getWindowHandle());
                System.out.println(driver.getCurrentUrl());
                System.out.println(driver.getTitle());
                Thread.sleep(2000);



            }
}
