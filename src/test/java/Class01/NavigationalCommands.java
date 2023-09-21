package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //Go to Google.com
        driver.get("https://www.google.com");
        //max the window
        driver.manage().window().maximize();
        //slow down to observe the process
        Thread.sleep(2000);
        // go to facebook
        driver.navigate().to("https://www.facebook.com");
        //difference between navigate and get. get does not allow you to move back and
        // forward in history but navigate allows you to go back and forth
        Thread.sleep(5000);
        //Go back
        driver.navigate().back();
        Thread.sleep(3500);
        //Go Forward
        driver.navigate().forward();
        //slow down to observe the process
        Thread.sleep(4000);
        driver.navigate().refresh();
        //close or we can use quit
       driver.close();  //close the current tab
        driver.quit();



    }
}
