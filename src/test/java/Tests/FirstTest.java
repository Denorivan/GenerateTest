package Tests;

import classes.constants.Constant;
import classes.pages.MainPage;
import org.testng.annotations.Test;

public class FirstTest {
    @Test
    public void test(){
        MainPage mainPage = new MainPage();
        mainPage.openWebSite(Constant.UrlVariable.RANDOM_ORG_MAIN_PAGE);
        mainPage.typeMinElement();
        mainPage.typeMaxElement();
        mainPage.clickOnGenerateButton();
        mainPage.getResultNumber();
    }
}
