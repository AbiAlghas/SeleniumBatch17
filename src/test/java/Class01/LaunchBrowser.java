package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
   //declare the instance of webDriver
        WebDriver driver=new ChromeDriver();
        //use the driver.get() method

        driver.get("https://www.google.com"); //driver.get=Navigate to particular website

        //maximize your window
        driver.manage().window().maximize();

        //get the url of the website
        String currentUrl=driver.getCurrentUrl();

        System.out.println("the current url is : "+currentUrl);

        //get the title
       String title=driver.getTitle();
        System.out.println("the title of the page is : "+title);

        //added a wait for 5 second to slow the closing the window(once code is finalized better to delete it)
        Thread.sleep(5000);

        //close the browser

        driver.quit();


    }
}
