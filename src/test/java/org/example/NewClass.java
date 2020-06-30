package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NewClass {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\soft\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.nopcommerce.com/");
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Divya");
        driver.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys("Patel");
        String pageText = driver.findElement(By.xpath("//div/strong")).getText();
        System.out.println(pageText);
    }
}