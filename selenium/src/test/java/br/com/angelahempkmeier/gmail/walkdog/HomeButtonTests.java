package br.com.angelahempkmeier.gmail.walkdog;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Automation Test Button 'Quero ser Dog Walker'")
public class HomeButtonTests {

    @Test
    @DisplayName("Click on button 'Quero ser Dog Walker'")
    public void testToClickOnButtonQueroSerDogWalker(){
        //Open the https://walkdog.vercel.app/ site
        WebDriverManager.chromedriver().setup();
        WebDriver browser = new ChromeDriver();
        browser.get("https://walkdog.vercel.app/");

        //Click on button with anchore a (the unique in this page)
        browser.findElement(By.tagName("a")).click();

    }
}
