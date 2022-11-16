package utils;

import ListenersDemo.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestUtils extends BaseTest {

    public void takeScreenShot() throws IOException {
        Date currentDate = new Date();
        String fileName = currentDate.toString().replace(" ", "-").replace(":","-");
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File ("src/test/resources/" + fileName + ".png"));
    }
}
