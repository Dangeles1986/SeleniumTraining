package Navegadores;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MiPrimerTest {
    private WebDriver driver;
    @BeforeTest
     public void Setup(){
        //Se coloca la direccion del driver, segun corresponda, (chrome, mozilla, edge...)
        System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/chromedriver.exe");

        //Se crea la instancia u objeto del navegador.
        driver = new ChromeDriver();

        //Maximiza el navegador
        driver.manage().window().maximize();

        //Enviamos la URL al navegador
        driver.get("https://www.amazon.com.mx/");
        driver.manage().deleteAllCookies();
        //Thread.sleep(5000);
    }
    @Test
    public void MiPrimerTest() throws InterruptedException {

        WebElement inputSearch = driver.findElement(By.id("twotabsearchtextbox"));
        Thread.sleep(5000);
        inputSearch.click();
        Thread.sleep(5000);

        //sendkeys se utiliza para enviar texto a los inputs
        inputSearch.sendKeys("Alexa");
        Thread.sleep(2000);
        //submit se utiliza para simular un enter
        inputSearch.submit();
        Thread.sleep(6000);
    }
    @AfterTest
    public void TearDown(){
        //Cierra el navegador
        driver.close();
        driver.quit();
    }

}
