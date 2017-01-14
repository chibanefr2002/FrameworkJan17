package SearchItems;

import base.CommonAPI;
//import homeFeatures.AmazonBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class TestHomePage extends CommonAPI {

    @Test
    public void testHome() {
        System.out.println(driver.getCurrentUrl());
        clickByXpath("//*[@id='nav-xshop']/a[2]");
//public class TestHomePage extends AmazonBase {
//
//    @Test
//    public void homePageOfAmazon()throws InterruptedException{
//        System.out.println(driver.getCurrentUrl());
//        typeAndEnterByCss("#twotabsearchtextbox", "book");
//        sleepFor(4);
//        List<String> list = getListOfTextByCss("#nav-subnav .nav-a");
//        displayText(list);
//        // List<WebElement> bookNavBar = getWebElements("#nav-subnav .nav-a");
//        for(int i=1; i<list.size(); i++){
//            clickByText(list.get(i));
//        }
//        sleepFor(2);
//    }
    }


}