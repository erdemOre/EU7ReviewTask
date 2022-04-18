package com.pages.moneyaming;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class SubmitPage extends BasePage{

    @FindBy(id = "title")
    public WebElement selectTitle;

    public void selectRandomTitle(){
        Select select = new Select(selectTitle);
        List<WebElement> options = select.getOptions();
        Random random = new Random();
        select.selectByIndex(random.nextInt(options.size()));
    }
}
