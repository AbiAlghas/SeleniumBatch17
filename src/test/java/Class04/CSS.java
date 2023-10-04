package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) {
         //instance
        WebDriver driver=new ChromeDriver();
         //go to website
        driver.get("http://35.175.58.98/cssSelector.php");
         //maximize the window
        driver.manage().window().maximize();
        //fill in the profile ID
       WebElement profileID= driver.findElement(By.cssSelector("input[id='profileID']"));
       profileID.sendKeys("Abi");
       //fill in the profileName textBox
        WebElement profileName=driver.findElement(By.cssSelector("input#profileBox"));
        profileName.sendKeys("Hello");
        //fill in the feedback from jenny
        WebElement feedbackJenny=driver.findElement(By.cssSelector("input[class='form-control feedbackBox1']"));
        feedbackJenny.sendKeys("Website not working");
        //fill in the feedback from jenny
        WebElement feedbackRaj=driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        feedbackRaj.sendKeys("Website is working");
        //contains method to fill course topic
        WebElement courseTopics=driver.findElement(By.cssSelector("input[name*='contentInput']"));
        courseTopics.sendKeys("Selenium");
        //using starts with
        WebElement introAdv=driver.findElement(By.cssSelector("input[name^='IntroInput']"));
        introAdv.sendKeys("Welcome");
        //ends with
        WebElement conclusion=driver.findElement(By.cssSelector("input[name$='Input']"));
        conclusion.sendKeys("Bye");







    }
}

