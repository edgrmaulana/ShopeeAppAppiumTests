package org.shopeepay.tests.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.shopeepay.tests.pages.HomePage;
import org.shopeepay.tests.utils.CommonUtility;

import java.net.MalformedURLException;

import org.assertj.core.api.SoftAssertions;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class ShopeeHomepageTestsSteps {

    CommonUtility commonUtility = new CommonUtility();

    HomePage homePage = new HomePage();

    SoftAssertions softAssert = new SoftAssertions();

    @When("User tried to open shopee homepage")
    public void userTriedToOpenShopeeHomepage() throws MalformedURLException {
        commonUtility.launchAndroid();

        boolean pageNotFound = commonUtility.isElementPresentByXPath(homePage.homeBackButton);

        boolean tutorial = commonUtility.isElementPresentByXPath(homePage.tutorialButton);

        if (pageNotFound){
            commonUtility.clickByXpath(homePage.homeBackButton);
        }

        if (tutorial){
            commonUtility.clickByXpath(homePage.tutorialButton);
        }
    }

    @Then("Verify promo is showing up")
    public void verifyPromoIsShowingUp(){
        boolean pageNotFound = commonUtility.isElementPresentByXPath(homePage.homeBackButton);

        if (pageNotFound){
            commonUtility.clickByXpath(homePage.homeBackButton);
        }

        boolean promoBannerVisibility = commonUtility.isElementPresentByXPath(homePage.promoBanner);
        softAssert.assertThat(promoBannerVisibility).isTrue();

        if (promoBannerVisibility){
            commonUtility.clickByXpath(homePage.closePromoBanner);
        }
    }

    @Then("Verify shopeepay menu is showing up")
    public void verifyShopeepayMenuIsShowingUp(){
        boolean shopeePayMenu = commonUtility.isElementPresentByXPath(homePage.shopeePayMenu);

        assertThat("Shopeepay Menu is not Displayed", shopeePayMenu,
                equalTo(true));
    }

    @Then("User click on Shopeepay menu")
    public void userClickOnShopeepayMenu() {
        commonUtility.clickByXpath(homePage.shopeePayMenu);
    }

    @Then("Verify user are redirected to login page")
    public void verifyUserAreRedirectedToLoginPage() {
        assertThat("Input Username field is missing",
                commonUtility.isElementPresentByXPath(homePage.inputUsername),
                equalTo(true));

        assertThat("Input Password field is missing",
                commonUtility.isElementPresentByXPath(homePage.inputPassword),
                equalTo(true));

        assertThat("Login with Google button is missing",
                commonUtility.isElementPresentByXPath(homePage.loginWithGoogle),
                equalTo(true));

        assertThat("Login with Facebook button is missing",
                commonUtility.isElementPresentByXPath(homePage.loginWithFacebook),
                equalTo(true));
    }
}
