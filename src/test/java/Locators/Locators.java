package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Locators {
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
            driver.get("https://demo.guru99.com/test/newtours/");

            driver.manage().deleteAllCookies();
        }
        @Test
        public void Locators() throws InterruptedException {
            //Localizar por "ID"
            /*WebElement demoSite = driver.findElement(By.id("site name"));
            demoSite.click();
            Thread.sleep(300);*/

            //Localizar por name
            /*WebElement userName = driver.findElement(By.name("userName"));
            //sendKeys se utliza para enviar texto a las inputs
            userName.sendKeys("Automation23");
            Thread.sleep(3000);*/

            //Localizar por className
            /*WebElement logo = driver.findElement(By.className("logo"));
            logo.click();
            Thread.sleep(3000);*/

            //Localizar por texto Link Test
            /*WebElement demoSite = driver.findElement(By.linkText("Demo Site"));
            demoSite.click();
            Thread.sleep(3000);*/

            //Localizador por Partial Link Text
            /* WebElement demoSite = driver.findElement(By.partialLinkText("Demo"));
            demoSite.click();
            Thread.sleep(3000);*/

            //Localizar por cssSelector
            //WebElement userName = driver.findElement(By.cssSelector("input[name='userName']"));
            //WebElement demoSite = driver.findElement(By.cssSelector("div#site-name"));
            //WebElement demoSite = driver.findElement(By.cssSelector("#site-name"));
            //demoSite.click();
            //WebElement userName = driver.findElement(By.cssSelector("input[type='text'][name='userName']"));
            //userName.sendKeys("Automation");
            //Thread.sleep(3000);

            //****************** X P A T H S *******************
            //Existen dos tipos de xpaths: ABSOLUTO y RELATIVO
            //El xpath absoluto por buenas practias NO se debe utilziar o bien abusar de él
            //Diferencias
            //El xphat abosluto es toda la ruta del elemoento, es decir la ubicacion del mismo y su
            //sintaxis inicia con una diagonal
            //**************************************************

            WebElement userName = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/input"));
            userName.sendKeys("Locura");
            Thread.sleep(3000);
        }
        @AfterTest
        public void TearDown(){
            //Cierra el navegador
            driver.close();
            driver.quit();
        }

}

