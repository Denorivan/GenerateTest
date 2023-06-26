package classes.pages;

import classes.constants.Constant;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    private final SelenideElement min = $x("//input[@id='redorsybyjzwyzozpirkmpzgrfxzvxpzadqsaspkqlhpzfdhxouwdscuyzs-min']");
    private final SelenideElement max = $x("//input[@name='qor-max']");
    private final SelenideElement generate = $x("//input[@type='button']");
    private final SelenideElement generateResult = $x("//span[@id=\"redorsybyjzwyzozpirkmpzgrfxzvxpzadqsaspkqlhpzfdhxouwdscuyzs-result\"]/center/span");
    private final Response response = RestAssured.get(Constant.UrlVariable.API_URL);
        public void typeMinElement(){
            String totalPages = response.path("total_pages").toString();
            Selenide.sleep(3000); // Затримка на 3 секунди

            min.clear();
            min.setValue(totalPages);
        }

        public void typeMaxElement(){
            String total = response.path("total").toString();
            Selenide.sleep(3000); // Затримка на 3 секунди

            max.clear();
            max.setValue(total);
        }

        public void openWebSite(String url){
            Selenide.open(url);
        }
        public void clickOnGenerateButton(){
            Selenide.sleep(3000); // Затримка на 3 секунди

            generate.click();
        }

        public void getResultNumber(){
            Selenide.sleep(3000); // Затримка на 3 секунди
            String result = generateResult.getValue();
            System.out.println(result);
        }


}
