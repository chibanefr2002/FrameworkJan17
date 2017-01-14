package SearchItems;

import base.CommonAPI;
import org.testng.annotations.Test;

/**
 * Created by Yassine on 1/2/2017.
 */
public class TestMicroCenterHome extends CommonAPI{
    @Test
    public void testHome(){
        clickByXpath(".//*[@id='nav']/div[2]/ul/li[1]/ul/li[8]/a");
        clickByXpath(".//*[@id='nav']/div[2]/ul/li[1]/ul/li[8]/div/ul/li[1]/ul/li[1]/a");
    }

}
