import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class baiduSearch {
    @Test
    public void baiduTest(){
        WebDriver driver = new ChromeDriver();
        WebDriver.Navigation navigation = driver.navigate();
        driver.get("https://www.baidu.com");
        driver.findElement(By.name("wd")).sendKeys("美国日全食");
        driver.findElement(By.xpath("//input[@class='s_ipt']")).sendKeys(Keys.ENTER);
        try{
            Thread.sleep(2000);
        }
        catch (Exception e){

        }
        //张开新页面取最后一个句柄
//        Set<String> windowHandles = driver.getWindowHandles();
//        String[] handlesArray = windowHandles.toArray(new String[0]);
//        String newHandle = handlesArray[handlesArray.length - 1];
//        driver.switchTo().window(newHandle);
        String winHandle = driver.getWindowHandle();
        driver.switchTo().window(winHandle);
        driver.findElement(By.id("kw")).clear();
        driver.findElement(By.cssSelector(".tts-title.group-sub-title_1EfHl")).click();
        WebElement hotSearch = driver.findElement(By.cssSelector(".tag-common_ty5J5.tag-selected_7MZSD"));
        String text = hotSearch.getText();
        System.out.println(text);
        assertEquals(text,"热搜榜");
        WebElement image = driver.findElement(By.cssSelector(".c-img-border.c-img-radius-large"));
        boolean imageDisplayed = image.isDisplayed();
        System.out.println(imageDisplayed);
        assertTrue(imageDisplayed);
        String tagImage = image.getTagName();
        System.out.println(tagImage);
        assertEquals(tagImage,"span");
        WebElement button = driver.findElement(By.id("su"));
        String value = button.getAttribute("value");
        System.out.println(value);
        assertEquals(value,"百度一下");
        String title = driver.getTitle();
        System.out.println(title);

        try{
            Thread.sleep(8000);
        }
        catch (Exception e){

        }
        navigation.back();
        driver.quit();
    }


}
