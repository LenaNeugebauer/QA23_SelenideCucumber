package com.telran.sconto.steps;

import com.telran.sconto.pages.HomePage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Selenide.open;
import static com.telran.sconto.pages.HomePage.baseUrl;

public class HomePageSteps implements En {

    HomePage homePage;

    public HomePageSteps() {
        Given("Navigate to Homepage",() ->{
            homePage = open(baseUrl,HomePage.class);
            homePage.acceptCookies();
        });
    }


}
