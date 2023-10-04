package Review1;

import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW3 {
    public static void main(String[] args) {
        //Navigate to http://35.175.58.98/basic-checkbox-demo.php.
        //Check the if Checkbox1 is enabled
        //If Checkbox1 is disabled:
        //Click on the "enable checkboxes" button.
        //Verify that Checkbox1 is now enabled.
        //Click on Checkbox1.
        //Confirm that Checkbox1 is selected.

        //instance
        WebDriver driver = new ChromeDriver();
        //go to url
        driver.get("http://35.175.58.98/basic-checkbox-demo.php");
        //maximize the window
        driver.manage().window().maximize();
        //Check the if Checkbox1 is enabled
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='checkbox-field']"));
        for (WebElement checkBox : checkboxes) {
            String option = checkBox.getAttribute("value");
            if (option.equals("Checkbox-1")) {
                boolean state = checkBox.isEnabled();
                System.out.println(state);
                //If Checkbox1 is disabled:
                if (!state) {
                    WebElement enableBtn = driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));       //Click on the "enable checkboxes" button.
                    enableBtn.click();
                    //Verify that Checkbox1 is now enabled
                    boolean state2 = checkBox.isEnabled();
                    if (state2) {
                        checkBox.click();
                        //Click on Checkbox1.
                        boolean isSelectedStatus=checkBox.isSelected();
                        System.out.println(isSelectedStatus);

                    }


                }


            }
        }}}