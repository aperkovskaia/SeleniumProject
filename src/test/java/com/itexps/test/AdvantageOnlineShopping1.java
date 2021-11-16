/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.test;

import java.util.concurrent.TimeUnit;
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

/**
 *
 * @author Liza
 */
public class AdvantageOnlineShopping1 {
    
    public AdvantageOnlineShopping1() {
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
@Test
     public void AdvantageOnlineShoppingShopping1() throws InterruptedException{
        driver.get("https://www.advantageonlineshopping.com/#/");
        // special offer
        WebElement e=driver.findElement(By.xpath("//*[@id=\"see_offer_btn\"]"));
        e.click();
        //choose color
        e=driver.findElement(By.xpath("//*[@id=\"productProperties\"]/div[1]/h2"));
        e.click();
        e=driver.findElement(By.id("bunny"));
        e.click();
        //add to cart
        e=driver.findElement(By.xpath("//*[@id=\"productProperties\"]/div[4]/button"));
        e.click();
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
}
