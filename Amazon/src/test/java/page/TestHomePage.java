package page;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class TestHomePage extends CommonAPI {

    @Test
    public void testHome(){
        System.out.println(driver.getCurrentUrl());
        clickByXpath("//*[@id='nav-xshop']/a[2]");
    }
}
