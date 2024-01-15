import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.*;
import java.util.List;

public class findDuplicated {
    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/s?k=iphone14&ref=nb_sb_noss");
        List<WebElement> views = driver.findElements(By.xpath("//span[@class ='a-size-base s-underline-text']"));
        for(int i = 0; i < views.size(); i++){
            String text = views.get(i).getText();
            System.out.println(text);
        }
        driver.quit();
    }
}
