import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PruebaCheckBox {
    private WebDriver driver;

    @Before
    public void setUp() {
        //inicializamos el webdriver para chrome
        driver = new ChromeDriver();
        //maximizamos la pantalla del navegador chrome
        driver.manage().window().maximize();
        //Borramos la Caché
        driver.manage().deleteAllCookies();
        //abrimos la página de sesión
        driver.get("https://testingqarvn.com.es/prueba-de-campos-checkbox/");
    }

    @Test
    public void TestTutorial() {
        WebElement nombre = driver.findElement(By.id("wsf-1-field-29"));
        nombre.clear();
        nombre.sendKeys("Dante Mauricio");

        WebElement apellido = driver.findElement(By.id("wsf-1-field-30"));
        apellido.clear();
        apellido.sendKeys("Fontana Laplagne");

        WebElement mail = driver.findElement(By.id("wsf-1-field-31"));
        mail.clear();
        mail.sendKeys("maurifl@gmail.com");

        WebElement tel = driver.findElement(By.id("wsf-1-field-32"));
        tel.clear();
        tel.sendKeys("2645152222");

        WebElement dir = driver.findElement(By.id("wsf-1-field-33"));
        dir.clear();
        dir.sendKeys("Lima 336 B° Hualilán 1 Rawson San Juan");

        WebElement php=driver.findElement(By.id("wsf-1-label-36-row-1"));


        WebElement py=driver.findElement(By.id("wsf-1-label-36-row-2"));
        py.click();

        WebElement js=driver.findElement(By.id("wsf-1-label-36-row-3"));
        js.click();

        WebElement submit=driver.findElement(By.id("wsf-1-field-34"));
        submit.click();
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}


/*
DEPENDENCY
JUNIT
https://junit.org/junit4/dependency-info.html

SELENIUM
https://www.selenium.dev/documentation/webdriver/getting_started/install_library/

CHROME WEBDRIVER
https://chromedriver.storage.googleapis.com/index.html?path=114.0.5735.90/

NOTA
A partir de la version 4.6 cambian ciertas cosas
drive manage timeouts no va en @Test sino en @Before despues de maximize
al igual que la parte de implicitWait (10, TimeUnit.SECONDS) muta por
implicitlyWait(Duration.ofSeconds(10))

System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
esa linea con las versiones nuevas no se escribe para versiones antes de la 4.6 si es necesaria

Hay que tener en cuenta la versión del idioma sino también tirará error, en Google Search por Buscar en Google

*/