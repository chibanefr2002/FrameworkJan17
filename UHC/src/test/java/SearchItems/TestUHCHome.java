package SearchItems;

import base.CommonAPI;
import org.testng.annotations.Test;

/**
 * Created by Yassine on 1/6/2017.
 */
public class TestUHCHome extends CommonAPI {
    @Test
    public void testHome(){
        clickByXpath("html/body/div[2]/div[2]/div[1]/header/div[4]/div[1]/div/a");
        clickByXpath("html/body/div[2]/div[2]/div[3]/div/div/div[2]/div[4]/div/div/div[1]/div/div/div/div/div/h3/a/img");
    }
}
