package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownWithSelectClass {
    public static void main(String[] args) throws InterruptedException {
        //instance
        WebDriver driver=new ChromeDriver();
        //go to website
        driver.get("http://35.175.58.98/basic-select-dropdown-demo.php");
        //maximize the window
        driver.manage().window().maximize();
        //find the dropdown or locate th drop down
       WebElement dropDown =driver.findElement(By.xpath("//Select[@id='select-demo']"));
       //CREATE OBJECT OF SELECT CLASS AND PASS IN THE DD ELEMENT
        Select sel=new Select(dropDown);
        //use any method out of index(), by value to select your desired option
        sel.selectByVisibleText("Friday");
        Thread.sleep(2000);
        sel.selectByValue("Tuesday");
        Thread.sleep(2000);
        sel.selectByIndex(2);


        //Just an example how the get option work
        /* List<WebElement> options=sel.getOptions();
        for(WebElement option:options){
            System.out.println(option.getText());
            Thread.sleep(2500);
            //I want to click on all the options
            option.click();
        }*/

    }
}
