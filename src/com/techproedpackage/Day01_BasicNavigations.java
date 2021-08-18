package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_BasicNavigations {
    public static void main(String[] args) {
        //STEP1 : SET UP
        System.setProperty("webdriver.chrome.driver","C:\\Users\\aatil\\OneDrive\\Documents\\seleniumDependencies\\drivers\\chromedriver.exe");
        //STEP2: CREATE DRIVER ;

        WebDriver driver=new ChromeDriver();
        //3.STEP WE WRITE THE AUTOMATION SCRIPT
        driver.get("https://www.google.com/");

        //get ("url") ==>takes to the url
        //        On the same class, Navigate to amazon home page https:// www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
        //navigate().to("https://www.amazon.com/");===>takes to the url


        //WHAT IS THE DIFFERENTS BETWEEN GET AND NAVIGATE ?
        //1)get is shorter and more common
        //2)get is a little faster
        //3)navigate has more choice (to(),back(),forward(),refresh()
        //4)get()"TYPE STRING" BUT navigate().to("type url)

      //Navigate back to google
        driver.navigate().back();
        //Navigate forward to amazon
        driver.navigate().forward();
        //Refresh the page
        driver.navigate().refresh();

      //  Maximize the window
        driver.manage().window().maximize();
        // driver.manage().window().maximize();==> make the full screen

        //  Close/Quit the browser
        driver.close();
        //close ==>close the current working browser
        driver.quit();
        //quit will close all working browser.this will be stronger


    }
}
