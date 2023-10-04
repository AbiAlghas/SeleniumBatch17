package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    //http://35.175.58.98/no-select-tag-dropdown-demo.php
    //select your dream destination from this calander

    public static void main(String[] args) {
        //instance
        WebDriver driver=new ChromeDriver();
        //go to website
        driver.get("http://35.175.58.98/no-select-tag-dropdown-demo.php");
        //maximize the window
        driver.manage().window().maximize();
        //find the dropdown or locate th drop down
        WebElement dreamDestination =driver.findElement(By.xpath("//div[contains(text(),'Dream')]"));
        dreamDestination.click();

        WebElement country=driver.findElement(By.xpath("//a[contains(text(),'Greece')]"));
        country.click();
    }
}
