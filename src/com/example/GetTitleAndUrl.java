package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrl {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("web driver.chrome.driver", "./Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.navigate().to("https://www.bietdvg.edu/");
        String url = driver.getCurrentUrl();
        String title = driver.getTitle();
        System.out.println("The url is: "   +url );
        System.out.println("The title is: " + title);
        driver.quit();
    }
}
