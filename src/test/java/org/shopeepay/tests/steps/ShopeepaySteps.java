package org.shopeepay.tests.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.shopeepay.tests.pages.ShopeepayPage;
import org.shopeepay.tests.utils.CommonUtility;

import java.net.MalformedURLException;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;


public class ShopeepaySteps{

    CommonUtility commonUtility = new CommonUtility();

    ShopeepayPage shopeepayPage = new ShopeepayPage();

    @When("User tried to open shopeepay homepage")
    public void userTriedToOpenShopeepayHomepage() throws MalformedURLException {
        commonUtility.launchAndroid();
    }

    @Then("User tried to open riwayat page")
    public void userTriedToOpenRiwayatPage(){
        shopeepayPage.clickRiwayatButton();
    }

    @Then("User click on the first transaction history")
    public void userClickOnTheFirstTransactionHistory() {
        shopeepayPage.clickFirstRiwayat();
    }

    @Then("Transaction history should contains transactions amount")
    public void transactionHistoryShouldContainsTransactionsAmount() {
        assertThat("Transactions amount is unavailable", shopeepayPage.getNominalOrder(),
                containsString("Rp"));
        System.out.println(shopeepayPage.getNominalOrder());
    }

    @And("Transaction history should contains order number")
    public void transactionHistoryShouldContainsOrderNumber() {
        assertThat("Order Number is unavailable", shopeepayPage.getOrderNumber(),
                containsString("103239926792932361"));
        System.out.println(shopeepayPage.getOrderNumber());
    }

    @And("Transaction history should contains transaction number")
    public void transactionHistoryShouldContainsTransactionNumber() {
        assertThat("Transactions SN is Unavailable", shopeepayPage.getTransaksiSN(),
                containsString("Transaksi SN"));
        System.out.println(shopeepayPage.getTransaksiSN());
    }
}
