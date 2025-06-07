package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInSelenium {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web driver.chrome.driver", "./Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        Thread.sleep(2000);// Hard wait not recommended
        driver.navigate().to("https://www.selenium.dev/");
        Thread.sleep(2000);
        driver.navigate().to("https://www.saucedemo.com/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        driver.findElement(By.name("user-name")).sendKeys("Usha");
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.close();


    }
}
