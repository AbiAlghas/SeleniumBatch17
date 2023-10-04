package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown {
    public static void main(String[] args) throws InterruptedException {
        //instance
        WebDriver driver = new ChromeDriver();
        //go to website
        driver.get("http://35.175.58.98/basic-select-dropdown-demo.php");
        //maximize the window
        driver.manage().window().maximize();
        //find the dropdown
        WebElement dd=driver.findElement(By.xpath("//Select[@id='multi-select']"));
        // create an object of the select class
        Select sel=new Select(dd);
        ////use any method out of index(), by value to select your desired option
   //Select     sel.selectByVisibleText("Texas");
        sel.selectByValue("Florida");
        sel.selectByIndex(4);
        Thread.sleep(2500);
        //Deselect
        sel.deselectByVisibleText("Texas");

        //check weather the dropdown is multiselect or not
        System.out.println(sel.isMultiple());

    }
}