package Tests;

import classes.constants.Constant;
import classes.pages.UaGenerator;
import org.testng.annotations.Test;

public class SecondTest {
    @Test
    public void test(){
        UaGenerator uaGenerator =new UaGenerator();

        uaGenerator.openWebSite(Constant.UrlVariable.RANDOM_UA);
        uaGenerator.typeMinElement();
        uaGenerator.typeMaxElement();
        uaGenerator.clickOnGenerateButton();
    }
}
