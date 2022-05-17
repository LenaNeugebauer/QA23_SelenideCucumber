package com.telran.sconto.steps;

import com.telran.sconto.pages.AddItemPage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public class AddItemSteps implements En {

    AddItemPage addItemPage;

    public AddItemSteps() {
        When("Click on the Möbel menu", () -> {
            addItemPage = page(AddItemPage.class);
            addItemPage.clickOnSofasMenu();
        });

        Then("Selected article displayed", () -> {
            addItemPage.selectedArticleDisplayed().should(exist);
            addItemPage.selectedArticleDisplayed().shouldHave(text("Warenkorb"));
        });

        And("Click on the article menu", () -> {
            addItemPage.clickOnArticleMenu();
        });

        And("Click on the chosen article", () -> {
            addItemPage.clickOnChosenArticle();
        });

        And("Click on In den Warenkorb button", () -> {
            addItemPage.clickInDenWarenkorbBtn();
        });

        And("Click on button Warenkorb", () -> {
            addItemPage.clickOnBtnWarenkorb();
        });

    }
}
