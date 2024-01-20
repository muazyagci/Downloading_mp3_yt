package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Map<String, Object> prefs = new HashMap<String, Object>();
prefs.put("profile.default_content_setting_values.notifications", 2);
ChromeOptions options = new ChromeOptions();
options.setExperimentalOption("prefs", prefs);
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        List<String> urlCollection = new ArrayList<>();

        // Add the URLs to the collection
        urlCollection.add("https://youtu.be/tEH1cF8HDGY?si=OKTzpjgNrrgiujgz");
        urlCollection.add("https://youtu.be/Pl7--yxZjng?si=XBYnKBXvw1_z2Q-9");
        urlCollection.add("https://youtu.be/XHwOPkFMtZg?si=sAHGQXwmv3pV9YOJ");
        urlCollection.add("https://youtu.be/P8K0d6mw71Q?si=5rQkf2p7aummZupn");
        urlCollection.add("https://youtu.be/xpjRba5c7-s?si=kp6-dkj6IzSalmcA");
        urlCollection.add("https://youtu.be/rE7O2niluqE?si=sZsJx6-n4DL3Zf7p");

        // You can now iterate over the collection using a forEach loop or any other method.
        for (String url : urlCollection) {
            driver.get("https://ytmp3.nu/nBlF/");
            driver.findElement(By.id("url")).sendKeys(url);
            driver.findElement(By.cssSelector("input[type='submit']")).click();
           Thread.sleep(1500);
            driver.findElement(By.linkText("Download")).click(); 
            //driver.findElement(By.xpath("(//a[@rel='nofollow'])[2]")).click();

        }

    }
}