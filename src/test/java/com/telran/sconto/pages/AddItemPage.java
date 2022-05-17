package com.telran.sconto.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AddItemPage {

    private static By möbelMenu = By.cssSelector(".menu__link--moebel");
    private static By articleMenu = By.xpath("//a[text()='Kommoden']");
    private static By chosenArticle = By.xpath("//a[contains(@href,'/artikel/323302302')]");
    private static By inThenWarenkorbButton = By.xpath("//button[@id='add-to-cart']");
    public static By buttonWarenkorb = By.xpath("//button[text()='Zum Warenkorb']");
    private static By articleDisplayed = By.cssSelector(".headline--cart");

    public void clickOnSofasMenu() {

        $(möbelMenu).click();
    }

    public SelenideElement selectedArticleDisplayed() {

        return $(articleDisplayed);
    }

    public void clickOnArticleMenu() {

        $(articleMenu).click();
    }

    public void clickOnChosenArticle() {

        $(chosenArticle).click();
    }

    public void clickInDenWarenkorbBtn() {

        $(inThenWarenkorbButton).click();
    }

    public void clickOnBtnWarenkorb() {

        $(buttonWarenkorb).click();
    }
}
