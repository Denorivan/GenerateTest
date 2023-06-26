package classes.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class UaGenerator {
    private final SelenideElement min = $x("//input[@id='nomer12']");
    private final SelenideElement max = $x("//input[@id='nomer22']");
    private final SelenideElement generate = $x("//*[@id=\"custom_html-5\"]/div/section[2]/div/div/div/div/div/div/div/center/p/input");
    public void typeMinElement(){
        min.clear();
        min.setValue("2");
    }

    public void typeMaxElement(){
        max.clear();
        max.setValue("10");
    }

    public void openWebSite(String url){
        Selenide.open(url);
    }
    public void clickOnGenerateButton(){
        generate.click();
    }
}
