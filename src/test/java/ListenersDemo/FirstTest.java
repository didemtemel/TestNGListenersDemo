package ListenersDemo;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersDemo.TestNGListeners.class)
public class FirstTest extends BaseTest{

    @Test  //Successful Test
    public void GoogleTitleVerify() {
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Google");

    }

    @Test //Forcefully Failed Test
    public void SearchButtonTextVerify() throws InterruptedException {
        Thread.sleep(2000);
        String searchButtonText = driver.findElement(By.cssSelector("div[class='lJ9FBc'] input[name='btnK']")).getAttribute("value");
        Assert.assertEquals(searchButtonText, "Google Ara");

    }

}
