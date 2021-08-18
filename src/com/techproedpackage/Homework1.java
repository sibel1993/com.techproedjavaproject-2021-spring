package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    /*
    Create a new class : Homework1
[9:54 PM]
 2.Using ChromeDriver, Go to facebook and verify if page title is “facebook”, If not, print the correct title.
3.Verify if the page URL contains facebook if not, print the right url.
 4.Then Navigate to https://www.walmart.com/
 5.Verify if the walmart page title includes “Walmart.com”
  6.Navigate back to facebook
7.Refresh the page
8.Maximize the window
9.Close the browser
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\aatil\\OneDrive\\Documents\\seleniumDependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       // 2.Using ChromeDriver, Go to facebook and verify if page title is “facebook”, If not, print the correct title
        driver.get("http://facebook.com//");
        String expectedTitle="facebook";
        String actualTitle=driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actual title:"+actualTitle);
        }
        //3.Verify if the page URL contains facebook if not, print the right url.
        String actualUrl=driver.getCurrentUrl();
        if(actualUrl.contains("facebook")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actualUrl:"+actualUrl);
        }
       // 4.Then Navigate to https://www.walmart.com/
        driver.navigate().to("https://www.walmart.com/");
        // 5.Verify if the walmart page title includes “Walmart.com”
        String expectedwalmarttitle="Walmart.com";
        String actualwalmarttitle=driver.getTitle();
        if(expectedwalmarttitle.equals(actualwalmarttitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUALWALMARTTITLE:"+actualwalmarttitle);
        }
       // 6.Navigate back to facebook
        driver.navigate().back();
       // 7.Refresh the page
        driver.navigate().refresh();
        //8.Maximize the window
        driver.manage().window().maximize();
        //9.Close the browser
        driver.close();


    }

}
