package news;

import base.CommonAPI;
import org.testng.annotations.Test;

/**
 * Created by Rezina Sharmin on 5/3/2016.
 */
public class Search extends CommonAPI {
    @Test
    public void searchNews() throws InterruptedException{
        clickByCss("#search-button");
        Thread.sleep(1000);
        typekByCss("#search-input-field", "Politics");
        Thread.sleep(1000);
        takeEnterKeyByCss("#search-input-field");
    }
}
