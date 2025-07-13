package org.shopeepay.tests.pages;

import org.shopeepay.tests.utils.CommonUtility;

public class HomePage extends CommonUtility {
    public String promoBanner = "//android.view.ViewGroup[@resource-id='popup_banner_image']/android.widget.ImageView";

    public String closePromoBanner = "commonUtility.waitForElementVisibleByXpath(shopeePage.promoBanner);";

    public String shopeePayMenu = "//android.widget.LinearLayout[@content-desc='wallet_bar_cell_wallet']";

    public String tutorialButton = "//android.widget.Button[@content-desc='tutorial_0_button']";

    public String homeBackButton = "//android.widget.ImageButton[@resource-id='com.shopee.id:id/home_btn']";

    public String inputUsername = "//android.widget.EditText[@resource-id='com.shopee.id:id/cret_edit_text' and @text='No. Handphone/Email/Username']";

    public String inputPassword = "//android.widget.EditText[@resource-id='com.shopee.id:id/cret_edit_text' and @text='Password']";

    public String loginWithGoogle = "//android.widget.TextView[@resource-id='com.shopee.id:id/txt_method_name' and @text='Log In dengan Google']";

    public String loginWithFacebook = "//android.widget.TextView[@resource-id='com.shopee.id:id/txt_method_name' and @text='Log In dengan Facebook']";
}
