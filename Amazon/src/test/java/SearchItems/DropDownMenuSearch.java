package SearchItems;

import PageFactorySearch.DropDownMenuPage;
import org.testng.annotations.Test;

import java.util.List;


/**
 * Created by Yassine on 1/11/2017.
 */
public class DropDownMenuSearch extends DropDownMenuPage {
    @Test
    public void dropDownMenu()throws InterruptedException {
        List<String> text = getMenus();
        typeOnInputSearch(text);
    }
}

