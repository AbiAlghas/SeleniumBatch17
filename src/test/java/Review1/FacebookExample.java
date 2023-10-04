package Review1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookExample {
    public static void main(String[] args) throws InterruptedException {
        //instance
        WebDriver driver=new ChromeDriver();
        //go to facebook
        driver.get("https://www.facebook.com/");
        //maximize the window
        driver.manage().window().maximize();

        //find the button create new account

        WebElement createNewAccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
        createNewAccount.click();
        // fill in the first name
        Thread.sleep(2000);
        WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
        firstname.sendKeys("Abi");
        // fill in the last name


        System.out.println(driver.getTitle());






    }
}
