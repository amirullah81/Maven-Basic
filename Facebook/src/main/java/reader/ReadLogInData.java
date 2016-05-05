package reader;

import util.DataReader;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

/**
 * Created by Rezina Sharmin on 5/4/2016.
 */
public class ReadLogInData{

    DataReader dataReader = new DataReader();

    public String[][] getDataFromExcelFile()throws IOException{
        String path = System.getProperty("user.dir")+"\\data\\fb.xls";
        String[][] logInData = dataReader.fileReader1(path);
        return logInData;
    }
}
