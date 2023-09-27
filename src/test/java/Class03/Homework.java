package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) {
        //instance
        WebDriver driver = new ChromeDriver();
// goto facebook.com
        driver.get("http://35.175.58.98/Xpath.php");
//        maximize the window
        driver.manage().window().maximize();

        //get the fields
        WebElement Field1=driver.findElement(By.xpath("//input[@name='customField1']"));
        Field1.sendKeys("Abi");

        //get the fields
        WebElement Field2=driver.findElement(By.xpath("//input[@name='customField1' and @data-detail='two']"));
        Field2.sendKeys("Alghas");

    }
}
