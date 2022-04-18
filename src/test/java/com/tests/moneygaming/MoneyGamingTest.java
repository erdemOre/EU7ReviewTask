package com.tests.moneygaming;

import com.pages.moneyaming.MainPage;
import com.pages.moneyaming.SubmitPage;
import com.utilities.BrowserUtils;
import org.testng.annotations.Test;

public class MoneyGamingTest extends TestBase {

    /*
    Task 2:
    1. Navigate to: https://moneygaming.qa.gameaccount.com/
    2. Click the JOIN NOW button to open the registration page
    3. Select a title value from the dropdown
    4. Enter your first name and surname in the form
    5. Check the tick box with text 'I accept the Terms and Conditions and
    certify that I am over the age of 18.'
    6. Submit the form by clicking the JOIN NOW button
    7. Validate that a validation message with text ‘ This field is required’ appears
    under the date of birth box
     */

    @Test
    public void test1(){
        //2. Click the JOIN NOW button to open the registration page
        MainPage mainPage = new MainPage();
        BrowserUtils.waitForPageToLoad(10);
        mainPage.joinNowButton.click();


        // Select a title value from the dropdown
        SubmitPage submitPage = new SubmitPage();
        submitPage.selectRandomTitle();



    }

}
