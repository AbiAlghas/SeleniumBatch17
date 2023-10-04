package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
        public static void main(String[] args) throws InterruptedException {
            //Navigate to http://35.175.58.98/basic-radiobutton-demo.php.
            //Check if the "Female" radio button is displayed.
            //Click on the "Show Button".
            //Check again if the "Female" radio button is displayed or not.
            //Print the results of the checks to the console.

            WebDriver driver = new ChromeDriver();
            driver.get("http://35.175.58.98/basic-radiobutton-demo.php");
            driver.manage().window().maximize();

            WebElement femaleButton = driver.findElement(By.cssSelector("input[value*='gender-female']"));
            femaleButton.isDisplayed();
            boolean status = femaleButton.isDisplayed();
            System.out.println("check box status: " + status);

            WebElement showButton = driver.findElement(By.cssSelector("button[id='toggleRadioButtons']"));
            showButton.click();

            Thread.sleep(2000);

            boolean checkagain = femaleButton.isDisplayed();
            System.out.println("check box displayed: " + checkagain);

            Thread.sleep(2000);
            driver.quit();
        }
        }
