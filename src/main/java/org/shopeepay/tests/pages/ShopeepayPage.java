package org.shopeepay.tests.pages;

import org.shopeepay.tests.utils.CommonUtility;

public class ShopeepayPage extends CommonUtility {

    String riwayatButton = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[2]";

    String firstRiwayat = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]";

    String nominalOrder = "//android.widget.TextView[contains(@text, 'Rp')]";

    String transaksiSN = "//android.widget.TextView[@text='Transaksi SN']";

    String orderNumber = "//android.widget.TextView[@text='103239926792932361']";

    public void clickRiwayatButton(){
        waitForElementVisibleByXpath(riwayatButton);
        clickByXpath(riwayatButton);
    }

    public void clickFirstRiwayat(){
        waitForElementVisibleByXpath(firstRiwayat);
        clickByXpath(firstRiwayat);
    }

    public String getNominalOrder(){
        waitForElementVisibleByXpath(nominalOrder);
        return getTextByXpath(nominalOrder);
    }

    public String getTransaksiSN(){
        waitForElementVisibleByXpath(transaksiSN);
        return getTextByXpath(transaksiSN);
    }

    public String getOrderNumber(){
        waitForElementVisibleByXpath(orderNumber);
        return getTextByXpath(orderNumber);
    }
}
