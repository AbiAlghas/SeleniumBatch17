package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HW1 {
    //Check the if Checkbox1 is enabled,If Checkbox1 is disabled:
    //Click on the "enable checkboxes" button.
    //Verify that Checkbox1 is now enabled.
    //Click on Checkbox1.
    //Confirm that Checkbox1 is selected.
    public static void main(String[] args) {
        //instance
        WebDriver driver = new ChromeDriver();
        //go to website
        driver.get("http://35.175.58.98/basic-checkbox-demo.php.");
        //maximize the window
        driver.manage().window().maximize();
        //select the checkbox
        WebElement enabled = driver.findElement(By.cssSelector("input.checkbox-field"));
        enabled.click();
        //if it is enabled or not
        boolean status=enabled.isEnabled();
        System.out.println("check box status: "+status);

        WebElement checkBox1= driver.findElement(By.cssSelector("button#enabledcheckbox"));
        checkBox1.click();

        boolean enabledStatus=checkBox1.isEnabled();
        System.out.println("enabled status : "+enabledStatus);

        enabled.click();

        boolean checkbox1selected=enabled.isSelected();
        System.out.println("checkbox1selected : "+checkbox1selected);







    }
}
