/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.test;

import java.util.List;
import java.util.concurrent.TimeUnit;
import static javax.swing.UIManager.get;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.By.tagName;
/**
 *
 * @author Liza
 */
public class BookingSignInTest {
    
    public BookingSignInTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
   WebDriver driver;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "c:\\qa\\chromedriver.exe");
        driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    /* @Test
    public void BookingTestLogin() throws InterruptedException{
        driver.get("http://www.booking.com");
        WebElement e=driver.findElement(By.partialLinkText("Sign in"));
        e.click();
        e=driver.findElement(By.id("username"));
        e.clear();
        e.sendKeys("aperkovskaia@gmail.com");
        e.submit();
        Thread.sleep(3000);
        e=driver.findElement(By.name("password"));
        e.sendKeys("Selenium@123!");
        e.submit();
}*/
}
