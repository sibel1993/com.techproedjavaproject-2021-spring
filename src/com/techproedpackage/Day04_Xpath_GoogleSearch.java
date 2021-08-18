package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day04_Xpath_GoogleSearch {
    public static void main(String[] args) {


       // When user goes to https://www.google.com/
       // Search for “porcelain teapot”
       // And print how many related results displayed on Google
        System.setProperty("webdriver.chrome.driver","C:\\Users\\aatil\\OneDrive\\Documents\\seleniumDependencies\\drivers\\chromedriver.exe");
        //STEP2: CREATE DRIVER ;

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
       WebElement googleSearchBox= driver.findElement(By.xpath("//input[@name='q']"));
       //search for "porcelain teapot"
        //way 1. we can type then press enter .Keys.Enter to press

        googleSearchBox.sendKeys("porcelain teapot"+ Keys.ENTER);//typing porcelain teapot then
        WebElement searchButton=driver.findElement(By.xpath("(//input[@class='gN089b'])[2]"));
         searchButton.click();
         WebElement result=driver.findElement(By.xpath("//div[@id='result-stats']"));
        System.out.println("RESULT"+result.getText().substring(6,17));


    }
}
