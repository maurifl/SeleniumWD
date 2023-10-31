import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatosPersonales {
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
        driver.get("https://testingqarvn.com.es/datos-personales/");
    }

    @Test
    public void TestTutorial() {
        WebElement nombre = driver.findElement(By.id("wsf-1-field-21"));
        nombre.clear();
        nombre.sendKeys("Dante Mauricio");

        WebElement apellido = driver.findElement(By.id("wsf-1-field-22"));
        apellido.clear();
        apellido.sendKeys("Fontana Laplagne");

        WebElement mail = driver.findElement(By.id("wsf-1-field-23"));
        mail.clear();
        mail.sendKeys("maurifl@gmail.com");

        WebElement tel = driver.findElement(By.id("wsf-1-field-24"));
        tel.clear();
        tel.sendKeys("2645152222");

        WebElement dir = driver.findElement(By.id("wsf-1-field-28"));
        dir.clear();
        dir.sendKeys("Lima 336 B° Hualilán 1 Rawson San Juan");

        WebElement submit=driver.findElement(By.id("wsf-1-field-27"));
        submit.click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
