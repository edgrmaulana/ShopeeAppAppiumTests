package org.shopeepay.tests.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.shopeepay.tests.pages.ProfilePage;
import org.shopeepay.tests.utils.CommonUtility;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class ShopeeProfilePageTestsSteps {
    CommonUtility commonUtility = new CommonUtility();

    ProfilePage profilePage = new ProfilePage();

    @Then("Verify profile page is showing up")
    public void verifyProfilePageIsShowingUp() {
        boolean isProfilePageButton = commonUtility.isElementPresentByXPath(profilePage.profileButton);

        assertThat("Profile button is not showing up", isProfilePageButton,
                equalTo(true));
    }

    @Then("User click on profile menu")
    public void userClickOnProfileMenu() {
        commonUtility.clickByXpath(profilePage.profileButton);
    }

    @Then("User should be shown up profile page menu")
    public void userShouldBeShownUpProfilePageMenu() {
        assertThat("Profile Page is not showing up",
                commonUtility.isElementPresentByXPath(profilePage.profileView),
                equalTo(true));
    }

    @And("Pesanan saya menu should be showing up")
    public void pesananSayaMenuShouldBeShowingUp() {
        assertThat("Pesanan saya menu is not displayed",
                commonUtility.isElementPresentByXPath(profilePage.pesananSayaTitle),
                equalTo(true));

        assertThat("Pesanan Saya menu text is incorrect",
                commonUtility.getTextByXpath(profilePage.pesananSayaTitle),
                containsString("Pesanan Saya"));
    }

    @And("Dompet saya section should be showing up")
    public void dompetSayaSectionShouldBeShowingUp() {
        assertThat("Dompet Saya menu is not displayed",
                commonUtility.isElementPresentByXPath(profilePage.dompetSayaSection),
                equalTo(true));

        assertThat("Dompet Saya menu text is incorrect",
                commonUtility.getTextByXpath(profilePage.dompetSayaSection),
                containsString("Dompet Saya"));
    }
}
