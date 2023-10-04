package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
    public static void main(String[] args) throws InterruptedException {
            //instance
            WebDriver driver = new ChromeDriver();
// goto demoqa.com
            driver.get("https://demoqa.com/text-box");
//        maximize the window
            driver.manage().window().maximize();
            //fill the full name text box


        WebElement FullName=driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        FullName.sendKeys("Abi Alghas");
        //  //fill the Email text box
        WebElement Email=driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
        Email.sendKeys("abcd@gmail.com");
        // send keys to get current address
        WebElement address=driver.findElement(By.xpath("//textarea[starts-with(@id,'currentAddress')]"));
        address.sendKeys("Canada");
        //  // send keys to get permanent address
        WebElement address1=driver.findElement(By.xpath("//textarea[starts-with(@id,'permanentAddress')]"));
        address1.sendKeys("Toronto,Ontario");

        Thread.sleep(3000);

        //find the Submit button
           WebElement Submit=driver.findElement(By.xpath("//button[@id='submit']"));
       Submit.click();






        }
    }
