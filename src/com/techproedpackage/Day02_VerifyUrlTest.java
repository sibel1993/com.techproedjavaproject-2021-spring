package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_VerifyUrlTest {
    public static void main(String[] args) {

        //STEP1 : SET UP
        System.setProperty("webdriver.chrome.driver","C:\\Users\\aatil\\OneDrive\\Documents\\seleniumDependencies\\drivers\\chromedriver.exe");
        //STEP2: CREATE DRIVER ;

        WebDriver driver=new ChromeDriver();
        //navigate to google homepage
        driver.get("https://www.google.com");
        //verify if google homepage url is"www.google.com"
        String expectedUrl="www.google.com";
        String actualUrl=driver.getCurrentUrl();//returns url of the current page AS STRING
        if(expectedUrl.equals(actualUrl)){
            System.out.println("PASS");

        }else{
            System.out.println("FAIL");
            System.out.println("Actual URL:"+actualUrl);
            System.out.println("Expected  URL:"+expectedUrl);


        }
        driver.quit();
    }
}
