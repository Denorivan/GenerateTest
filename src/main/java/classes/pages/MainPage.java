package classes.pages;

import classes.constants.Constant;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement  frameElement = $x("//iframe[@frameborder='0']");

    private final SelenideElement min = $x("//input[substring(@id, string-length(@id) - 2) = 'min']");
    private final SelenideElement max = $x("//input[substring(@id, string-length(@id) - 2) = 'max']");
    private final SelenideElement generate = $x("//input[@type='button']");
    private final SelenideElement generateResult = $x("//center/span[1]");
    private final Response response = RestAssured.get(Constant.UrlVariable.API_URL);

        public void typeMinElement(){
            Selenide.switchTo().frame(frameElement);
            String totalPages = response.path("total_pages").toString();
            min.clear();
            min.setValue(totalPages);
            Selenide.switchTo().defaultContent();
        }

        public void typeMaxElement(){
            Selenide.switchTo().frame(frameElement);
            String total = response.path("total").toString();
            max.clear();
            max.setValue(total);
            Selenide.switchTo().defaultContent();
        }

        public void openWebSite(String url){
            Selenide.open(url);
        }
        public void clickOnGenerateButton(){
            Selenide.switchTo().frame(frameElement);
            generate.click();
            Selenide.switchTo().defaultContent();
        }

        public void getResultNumber(){
            Selenide.switchTo().frame(frameElement);
            String result = generateResult.getText();
            System.out.println(result);
        }




}
