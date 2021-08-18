package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework02 {
    /*
        Go to http://automationpractice.com/index.php
        Click on Sign in link
        Enter you email (you can create a fake email and use that email)
        And click on Create an account link
        And Verify the CREATE AN ACCOUNT isDisplayed() on the page
        And Verify the YOUR PERSONAL INFORMATION isDisplayed() on the page
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\aatil\\OneDrive\\Documents\\seleniumDependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //Go to http://automationpractice.com/index.php
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        //Click on Sign in link
        WebElement signinButton=driver.findElement(By.partialLinkText("Sign in"));
        signinButton.click();
        // Enter you email (you can create a fake email and use that email)
        WebElement email=driver.findElement(By.id("email_create"));
        email.sendKeys(" s.ssbssjd@gmail.com");
        // And click on Create an account link
        WebElement account=driver.findElement(By.name("SubmitCreate"));
        account.click();

        //And Verify the CREATE AN ACCOUNT isDisplayed() on the page
        WebElement createAnAccount=driver.findElement(By.className("page-heading"));
        if(createAnAccount.isDisplayed()){
            System.out.println("PASS");
        }else {
            System.out.println("FAILD ");
            System.out.println("element is displayed"+createAnAccount.isDisplayed());
        }
        // And Verify the YOUR PERSONAL INFORMATION isDisplayed() on the page
        WebElement personalInformation=driver.findElement(By.className("page-subheading"));
        if(personalInformation.isDisplayed()){
            System.out.println("PASS");
        }else{
            System.out.println("FAILD");
            System.out.println("information displayed"+personalInformation.isDisplayed());
        }







    }

}
