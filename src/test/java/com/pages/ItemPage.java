package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ItemPage extends BasePage{

    public Select select;

    @FindBy(id = "add-to-cart-button")
    public WebElement addToCart;

    @FindBy(xpath = "//select[@id ='quantity']")
    public WebElement selectQuantity;


    public void getSelectQuantity(String quantity){

        select = new Select(selectQuantity);
        select.selectByVisibleText(quantity);

    }







}
