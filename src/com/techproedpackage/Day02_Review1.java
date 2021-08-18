package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_Review1 {
    public static void main(String[] args) throws InterruptedException {
        // 8.create chrome driver .Maximize the window
       // 1.Create a new class : Review1
       // 2.Using ChromeDriver, Go to youtube and verify if page title is “youtube”, If not, print the correct title.
       // 3.Verify if the page URL contains youtube if not, print the right url.
        // 4.Then Navigate to https://www.amazon.com/
       // 5.Navigate back to youtube
       // 6.Refresh the page
       // 7.Navigate forward to amazon

       // 9.Then verify if page title includes “Amazon”, If not, print the correct title.
        // 10.Verify if the page URL is https://www.amazon.com/, if not print the correct url
       // 11.Quit the browser
        System.setProperty("webdriver.chrome.driver","C:\\Users\\aatil\\OneDrive\\Documents\\seleniumDependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //// 2.Using ChromeDriver, Go to youtube and verify if page title is “youtube”, If not, print the correct title.
        driver.get("http://www.youtube.com/");
        Thread.sleep(5000);
        //THREAD.SLEEP USING FOR WAIT ON THE PAGE
        String expectedTitle="youtebe";
        String actualTitle=driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Actual title :"+actualTitle);
        }
        // 3.Verify if the page URL contains youtube if not, print the right url.
        String actualUrl=driver.getCurrentUrl();
        if(actualUrl.contains("youtube")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actual url:"+actualUrl);
        }
        // 4.Then Navigate to https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
        // 5.Navigate back to youtube
        driver.navigate().back();
        // 6.Refresh the page
        driver.navigate().refresh();
        // 7.Navigate forward to amazon
        driver.navigate().forward();
        // 9.Then verify if page title includes “Amazon”, If not, print the correct title.
        String actualTitleAmazon=driver.getTitle();
        if(actualTitleAmazon.contains("Amazon")){
            System.out.println("PASS");

        }else {
            System.out.println("FAIL");
            System.out.println("actual title :"+actualTitleAmazon);

        }
        // 10.Verify if the page URL is https://www.amazon.com/, if not print the correct url
        String expectedUrl="https://www.amazon.com/";
        String actualAmazonUrl=driver.getCurrentUrl();
        if(expectedUrl.equals(actualAmazonUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ActualAmazon url:"+actualAmazonUrl);
        }
        // 11.Quit the browser
        driver.quit();







    }
}
