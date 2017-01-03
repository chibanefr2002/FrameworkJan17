package Home;

import base.CommonAPI;
import org.testng.annotations.Test;

/**
 * Created by Yassine on 1/2/2017.
 */
public class TestChaseHome extends CommonAPI{
    @Test
    public void testHome(){
        clickByXpath(".//*[@id='nav']/div[2]/div[7]/main/div/div[3]/div[2]/div/div/div/div[2]/div/div/div[10]/a/div[2]");
        clickByXpath(".//*[@id='nav']/div[2]/div[5]/header/div[4]/div[3]/ul/li[1]/a");

    }

}

