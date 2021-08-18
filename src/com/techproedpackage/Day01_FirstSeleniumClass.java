package com.techproedpackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_FirstSeleniumClass {

    //this is our first java automation class
    //1.step create a main method
    public static void main(String[] args) {
        //2.use System.setProperty("Driver Type","Driver Path")
        //   DRIVER TYPEFOR  : webdriver.chrome.driver
        //DRIVER PATH
        //WINDOWS USER :use
        System.setProperty("webdriver.chrome.driver","C:\\Users\\aatil\\OneDrive\\Documents\\seleniumDependencies\\drivers\\chromedriver.exe");

        //3)CREATE WEBDRIVER object

        WebDriver driver=new ChromeDriver();

        //NOTE:IF SELENIUM IS NOT IMPORTED , THEN IMPORT THE SELENIUM LIBRARIES

        //STEP 1,2,3 ARE MANDATORY FOR JAVA AUTOMATION FRAMEWORK

        //4.now that we are done with setup, we can write automation script
        driver.get("https://www.google.com");

    }
}
