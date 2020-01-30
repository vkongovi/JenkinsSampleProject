package sampleJenkins;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;


public class invoketestng {
    static WebDriver driver;
    static String url="https://mvnrepository.com";

    @BeforeSuite
    public void driverinitialize(){
        System.setProperty( "webdriver.chrome.driver", "C:\\Vinaya\\Selenium\\drivers\\chromedriver.exe" );
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS) ;
    }

    @BeforeTest
    public void launchbrowser(){
        driver.manage().window().maximize();
        driver.get( url );
    }

    @BeforeMethod
    public void refreshpage() throws AWTException {
        Robot rbt = new Robot();
        rbt.keyPress( KeyEvent.VK_F5 );
        rbt.keyRelease( KeyEvent.VK_F5 );
    }


    @Test
    public void sampletestcase(){

        System.out.println("The number oflinks are : ");
    }

    @AfterClass
    public void teardown(){
        driver.close();

    }

    @AfterSuite
    public void shutdown(){
        driver.quit();
    }

}
