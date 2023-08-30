import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Task1 {
    WebDriver wd;
    @BeforeMethod

    public void precondition() {
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
    }
    @Test
    public void testCss(){
        WebElement element = wd.findElement(By.cssSelector("table#customers"));
        List<WebElement> tr = element.findElements(By.cssSelector("tr"));
        int size = tr.size();
        System.out.println("Amount of rows:"+ size);

        WebElement element1 = element.findElement(By.cssSelector("tr:first-child"));
        List<WebElement> elementss = element1.findElements(By.cssSelector("th"));
        int size1 = elementss.size();
        System.out.println("Amount of columns:"+ size1);

        String text = wd.findElement(By.cssSelector("#customers tr:nth-child(3)")).getText();
        System.out.println("third row: "+ text);

        String text1 = wd.findElement(By.cssSelector("#customers tr:first-child th:last-child")).getText();
        System.out.println("last column: "+ text1);



    }


    @AfterMethod
    public void postcondition() {

        wd.quit();

    }
}
