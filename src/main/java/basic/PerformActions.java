package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PerformActions extends DriverSetUp{
    @Test
    public void testActions() throws InterruptedException {
        driver.get("https://demoqa.com/menu#");
        //main item2 ke inspect kore locate  and variable e store
        WebElement mainItem2 = driver.findElement(By.xpath("//a[normalize-space()='Main Item 2']"));
        Thread.sleep(5000);
        //MAIN ITEM HAS  TO HOVER SO WE HAVE TO CREATE ACTION OBJECT FOR ACTION CLASS
        Actions actions =new Actions(driver);
        //only locate does not enough  now i have to hover by build perform action and hold to see the sub menu
        actions.clickAndHold(mainItem2).build().perform();
        Thread.sleep(5000);
        // I HAVE TO CLICK AND LOCATE
        driver.findElement(By.xpath("(//a[@href='#'][normalize-space()='Sub Item'])[2]")).click();
        Thread.sleep(5000);
        //we can simply locate hover  by actions , build perform
        actions.clickAndHold(driver.findElement(By.xpath("(//a[normalize-space()='SUB SUB LIST »'])[1]"))).build().perform();
        Thread.sleep(5000);
        //AS USUALLY NORMALLY
        //driver.findElement(By.xpath("(//a[normalize-space()='Sub Sub Item 2'])[1]")).click();
        //Thread.sleep(5000);



    }


    @Test
    public void testMultiSelect(){
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
        //create actions class because take the input from  keyboard
        Actions actions = new Actions(driver);
        // have to enter i frame
        driver.switchTo().frame("iframeResult");
        //inspect  and locate the list by helping the select option
        Select select=new Select(driver.findElement(By.xpath("")));
        // MULTI SELECT KEY DOWN FOE COTROL PRESS KEY UP FOR RELEASE CONTROL  AND CLICK SELECT .GET OPTIOND .GET FOR MULTISELECT




    }
}
