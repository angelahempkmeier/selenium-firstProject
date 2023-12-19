package br.com.angelahempkmeier.gmail.walkdog;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Automation test 'Faça seu cadastro'")
public class RegisterTests {

    @Test
    @DisplayName("Complete all the fields with valid information")
    public void testRegisterInQueroSerWalkie(){
        WebDriverManager.chromedriver().setup();
        WebDriver browser = new ChromeDriver();
        browser.get("https://walkdog.vercel.app/signup");

    }
}
