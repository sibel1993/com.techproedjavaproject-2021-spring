package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day02_FireFoxBrowserDemo {
    public static void main(String[] args) {
        //    Set Path
        System.setProperty("webdriver.gecko.driver","C:\\Users\\aatil\\OneDrive\\Documents\\seleniumDependencies\\drivers\\geckodriver.exe");


//    Create gecko driver
        //we are using polymorphism when we create drivers
        WebDriver driver=new FirefoxDriver();
        //all other steps
//    Open google home page https://www.google.com/
        driver.get("https://www.google.com/");
//    // Maximize the window
        driver.manage().window().maximize();
//    Close/Quit the browser
        driver.quit();
    }
}
