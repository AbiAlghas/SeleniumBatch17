package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.WatchEvent;

public class XPath {
    public static void main(String[] args) {

        //instance
        WebDriver driver = new ChromeDriver();
// goto facebook.com
        driver.get("http://35.175.58.98/Xpath.php");
//        maximize the window
        driver.manage().window().maximize();
        //find the text box and send some keys
        WebElement textBox1=driver.findElement(By.xpath("//input[@id='title']"));
        textBox1.sendKeys("Batch16");
        ////find the next text box and send  keys
        WebElement textBox2=driver.findElement(By.xpath("//input[@name='title']"));
        textBox2.sendKeys("Batch17");
        //send the security question
        WebElement question1 = driver.findElement(By.xpath("//input[contains(@name,'security')]"));
        question1.sendKeys("Whats the color of sun?");
        //get the text
        WebElement theMagicalText=driver.findElement(By.xpath("//label[contains(text(),'Lorem')]"));
        System.out.println(theMagicalText);
        //get the text box
        WebElement textBoxAPI=driver.findElement(By.xpath(" //input[starts-with(@id,'api')]"));
        textBoxAPI.sendKeys("abracadabra");
        //get the email
        WebElement Email=driver.findElement(By.xpath(" (//input[@class='form-control backup'])[1]"));
        Email.sendKeys("hello1@gmail.com");
        //get the email2
        WebElement Email2=driver.findElement(By.xpath(" (//input[@class='form-control backup'])[2]"));
        Email2.sendKeys("caicancomein@gmail.com");
        //get the email3
        WebElement Email3=driver.findElement(By.xpath(" (//input[@class='form-control backup'])[3]"));
        Email3.sendKeys("whatsyour@gmail.com");
        //get the below fields
        WebElement field1=driver.findElement(By.xpath("//input[@data-detail='one' and @name='customField']"));
        field1.sendKeys("cat");

        //get the below fields
        WebElement field2=driver.findElement(By.xpath("//input[@name='customField' and @data-detail='two']"));
        field2.sendKeys("Catterpiller");

        //get the fields
        WebElement Field1=driver.findElement(By.xpath("//input[@name='customField1']"));
        Field1.sendKeys("Abi");

        //get the fields
        WebElement Field2=driver.findElement(By.xpath("//input[@name='customField1' and @data-detail='two']"));
        Field2.sendKeys("Alghas");









    }
}

