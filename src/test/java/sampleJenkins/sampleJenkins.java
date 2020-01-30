package sampleJenkins;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class sampleJenkins {
    static WebDriver driver;
    static String url="https://mvnrepository.com";

public static void main(String[] args){
    driverinitialize();
    launchbrowser();
    shutdown();
}//end of main

    public static void driverinitialize(){
        System.setProperty( "webdriver.chrome.driver", "C:\\Vinaya\\Selenium\\chromedriver.exe" );
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
    }

    public static void launchbrowser(){
        driver.manage().window().maximize();
        driver.get( url );
    }



    public static void shutdown(){
    driver.close();driver.quit();
    }
}//end of class
