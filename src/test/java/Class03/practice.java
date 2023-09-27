package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
    public static void main(String[] args) {
        //instance
        WebDriver driver=new ChromeDriver();
        //go to website
        driver.get("http://35.175.58.98/input-form-locator.php");
        //maximize the window
        driver.manage().window().maximize();
        //fill the first name text box
        driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Abi");
        //fill the last name text box
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Alghas");
        //fill the email text box
        driver.findElement(By.xpath("//input[contains(@placeholder,'E-Mail Address')]")).sendKeys("abc@gmail.com");
        //click the submit button
        driver.findElement(By.xpath("//button[starts-with(@id,'submit_button')]")).click();









    }
}
