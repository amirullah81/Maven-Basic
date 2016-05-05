package homePage;

import base.CommonAPI;
import org.testng.annotations.Test;
import reader.ReadLogInData;

import java.io.IOException;

/**
 * Created by Rezina Sharmin on 5/4/2016.
 */
public class LogIn extends CommonAPI {

    ReadLogInData readLogInData = new ReadLogInData();
    @Test
    public void logIn() throws IOException, InterruptedException {
        String data[][] = readLogInData.getDataFromExcelFile();
        for(int j = 1; j < data.length; j++){
            for(int k = 0; k < data[j].length; k++){
                switch (k){
                    case 0:
                        //Thread.sleep(2000);
                        typekByCss("#email", data[j][k]);
                        break;
                    case 1:
                        //Thread.sleep(2000);
                        typekByCss("#pass", data[j][k]);
                }
            }
            //Thread.sleep(3000);
            clickByCss("#u_0_y");
            //Thread.sleep(3000);
            clickById("userNavigationLabel");
            clickByLinkText("Log Out");
            driver.navigate().back();
        }

    }
}
