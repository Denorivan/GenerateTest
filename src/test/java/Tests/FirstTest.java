package Tests;

import classes.constants.Constant;
import classes.pages.MainPage;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$x;

public class FirstTest {
    private final SelenideElement frameElement = $x("//iframe[@frameborder='0']");
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
