package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Day03_LocatorsIntro {
    public static void main(String[] args) throws InterruptedException {
        /*
        Create a class : LocatorsIntro 
       Create main method and complete the following task. 
       user goes to http://a.testaddressbook.com/sign_in 
        Locate the elements of email textbox, password textbox, and signin button 
       Enter below username and password then click sign in button 
      Username :  testtechproed@gmail.com 
       Password : Test1234! 
       Then verify that the expected user id  testtechproed@gmail.com (USE getText() method to get the text from the page) 
       Verify the Addresses and Sign Out  texts are displayed  
       Find the number of total link on the page 
       Sign out from the page
         */
        // user goes to http://a.testaddressbook.com/sign_in 
        //STEP1 : SET UP
        System.setProperty("webdriver.chrome.driver","C:\\Users\\aatil\\OneDrive\\Documents\\seleniumDependencies\\drivers\\chromedriver.exe");
        //STEP2: CREATE DRIVER ;

        WebDriver driver=new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");
        driver.manage().window().maximize();
        //Locate the elements of email textbox, password textbox, and signin button
        WebElement emailTextBox =driver.findElement(By.id("session_email"));
        emailTextBox.sendKeys("testtechproed@gmail.com");
        //sendKeys() types inside the input box
        WebElement passwordTaxtBox=driver.findElement(By.id("session_password"));
        passwordTaxtBox.sendKeys("Test1234!");

        WebElement signinButton=driver.findElement(By.name("commit"));
        signinButton.click();//click() used to click on the elements

        //so far we automated login functionallty of the application

        Thread.sleep(3000);

        // Then verify that the expected user id  testtechproed@gmail.com (USE getText() method to get the text from the page) 

        WebElement userId=driver.findElement(By.className("navbar-text"));
        String userIdText=userId.getText();
        String expectedUserId="testtechproed@gmail.com";
        if(userIdText.equals("testtechproed@gmail.com")){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("ACTUAL ID:"+userIdText);
            System.out.println("EXPECTED ID:+testtechproed@gmail.com");
        }
        //Verify the Addresses and Sign Out  texts are displayed
        //find the addresses element
       WebElement addresses= driver.findElement(By.partialLinkText("Addresses"));
        if(addresses.isDisplayed()){//isDisplayed()==> return boolean,returns false if element is not the page
            System.out.println("PASS");

        }else {
            System.out.println("FAIL");
            System.out.println("ELEMENT IS DISPLAYED:"+addresses.isDisplayed());
        }

      //  Finding and verifying the signout element
       WebElement signout=driver.findElement(By.partialLinkText("Addresses"));
        if(signout.isDisplayed()){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ELEMENT IS DISPLAYED: "+signout.isDisplayed());
        }
        // Find the number of total link on the page
        // a is used to create the links  we can use tagName=a to find total number of links
        List<WebElement> allLinks=driver.findElements(By.tagName("a"));//return all elements who tag=a
        System.out.println("THERE ARE :"+allLinks.size()+"links on the page ");
     //  Sign out from the page
        Thread.sleep(3000);
        driver.findElement(By.linkText("Sign out")).click();

        //we need to understand the user is no longer signed in
        WebElement homelink=driver.findElement(By.partialLinkText("Home"));
        if(homelink.isDisplayed()){
            System.out.println("SIGN OUT is success ");
        }else{
            System.out.println("SIGN OUT FAILED ");

        }
        driver.quit();

    }
}
