package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_VerifyTitleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\aatil\\OneDrive\\Documents\\seleniumDependencies\\drivers\\chromedriver.exe");
        //  1.Create a new class: VerifyTitleTest
        WebDriver driver=new ChromeDriver();

        //2.Navigate to google homepage
        driver.get("https://www.google.com");
        //3.Verify if google title is “google”
        String expected="google";
        String actual=driver.getTitle();//GOOGLE.GooGLE.
        //getTitle() will return the title of the page AS STRING
        //TESTERS DO NOT WRITE A TEST TO PASS
        ///TESTERS WRITE A TEST TO CATCH A DEFECT/BUG
        if(expected.equals(actual)){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
            System.out.println("ACTUAL:"+actual);
            System.out.println("EXPECTED: "+expected);
        }
        //NOTE: TEST CASE FAILED ,SO WE FOUND A BUG .GOOGLE=!google.
        //when we find a bug we follow the steps
        //WHAT DO YOU DO WHEN YOU FIND A BUG?
        //1)run the scripts again we make sure the test case is failing
        //2) test the functionality manually to make ure
        //3)communicate with BA (WRITE AC)or Dev ,or PO(PROVIDING AC)
        //4)should i open the ticket if that is bug ?
        //follow the culture
        //some companies we open ticket whenever we find a bug
        //sometimes it is a quick fix, so we talk to dev to fix it .
        //AFTER CONFIRMING THE BIUG ,WE CAN OPEN TICKET AND ASSIGN TO THE DEVELOPER

        //5) WHAT HAPPENS THEY FIXED THE BUGS?
        //REtEST the application
        //if pass,close the ticket
        //if fails again,DO NOT OPEN NEW TICKET. JUST DO NOT CLOSE EXISTING TICKET

        //SPRINT:
        //What happens if the story is not finished in the sprint?
        //What happens if a bug cannot be fixed in the sprint?

        //This should not normally happen.
        //But this can rarely happen due to the not a good planning
        //But if we cannot complete a user story, we usually move it to the next sprint.
        //If the story is not clear, or need to be refined again, then we move it to the backlog and refine again

//        7:43 PM CENTRAL
        driver.quit();







    }



}
