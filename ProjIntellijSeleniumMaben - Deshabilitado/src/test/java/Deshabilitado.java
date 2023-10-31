import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deshabilitado {
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
        driver.get("https://testingqarvn.com.es/campos-disabled/");
    }
    @Test
    public void TestTutorial() throws InterruptedException {

        //************************************************************************************************
        //INPUTS
        WebElement no = driver.findElement(By.name("field_117"));
        if (no.getAttribute("disabled") == null) {
            System.out.println("El campo de nombre esta habilitado.");
            //Encuentra el campo de nombre y lo completa
            driver.findElement(By.name("field_117")).sendKeys("Dante");
        } else {
            System.out.println("El campo de nombre no esta habilitado.");
        }

        WebElement ap = driver.findElement(By.name("field_118"));
        if (ap.getAttribute("disabled") == null) {
            System.out.println("El campo de apellido esta habilitado.");
            //Encuentra el campo de apellido y lo completa
            driver.findElement(By.name("field_118")).sendKeys("Fontana");
        } else {
            System.out.println("El campo de apellido no esta habilitado.");
        }

        WebElement em = driver.findElement(By.name("field_119"));
        if (em.getAttribute("disabled") == null) {
            System.out.println("El campo de nombre esta habilitado.");
            //Encuentra el campo de email y lo completa
            driver.findElement(By.name("field_119")).sendKeys("maurifl@gmail.com");
        } else {
            System.out.println("El campo de email no esta habilitado.");
        }

        WebElement te = driver.findElement(By.name("field_119"));
        if (te.getAttribute("disabled") == null) {
            System.out.println("El campo de teléfono esta habilitado.");
            //Encuentra el campo de teléfono y lo completa
            driver.findElement(By.name("field_119")).sendKeys("2645152222");
        } else {
            System.out.println("El campo de teléfono no esta habilitado.");
        }

        WebElement di = driver.findElement(By.name("field_121"));
        if (di.getAttribute("disabled") == null) {
            System.out.println("El campo de dirección esta habilitado.");
            //Encuentra el campo de dirección y lo completa
            driver.findElement(By.name("field_121")).sendKeys("lima 333 B° huali");
        } else {
            System.out.println("El campo de dirección no esta habilitado.");
        }

        //************************************************************************************************
        //CHECKBOX
        WebElement req = driver.findElement(By.id("wsf-1-field-122-row-1"));
        if (req.getAttribute("required") == null) {
            System.out.println("El campo de php esta habilitado.");
            WebElement ch = driver.findElement(By.id("wsf-1-label-122-row-1"));
            Thread.sleep(500);
            ch.click();
        } else {
            System.out.println("El campo de php no esta habilitado.");
        }

        WebElement req1 = driver.findElement(By.id("wsf-1-field-122-row-2"));
        if (req1.getAttribute("required") == null) {
            System.out.println("El campo de python esta habilitado.");
            WebElement ch = driver.findElement(By.id("wsf-1-label-122-row-2"));
            Thread.sleep(500);
            ch.click();
        } else {
            System.out.println("El campo de python no esta habilitado.");
        }

        WebElement req2 = driver.findElement(By.id("wsf-1-field-122-row-3"));
        if (req2.getAttribute("required") == null) {
            System.out.println("El campo de js esta habilitado.");
            WebElement ch = driver.findElement(By.id("wsf-1-label-122-row-3"));
            Thread.sleep(500);
            ch.click();
        } else {
            System.out.println("El campo de js no esta habilitado.");
        }

        //************************************************************************************************
        //RADIOBUTTONS
        Thread.sleep(500);
        WebElement cy = driver.findElement(By.id("wsf-1-label-123-row-1"));
        if (cy.getAttribute("required") == null) {
            System.out.println("El campo de cypress esta habilitado.");
            cy.click();
        } else {
            System.out.println("El campo de cypress no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement wd = driver.findElement(By.id("wsf-1-label-123-row-2"));
        if (wd.getAttribute("required") == null) {
            System.out.println("El campo de webdriver esta habilitado.");
            wd.click();
        } else {
            System.out.println("El campo de webdriver no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement se = driver.findElement(By.id("wsf-1-label-123-row-3"));
        if (se.getAttribute("required") == null) {
            System.out.println("El campo de selenium esta habilitado.");
            se.click();
        } else {
            System.out.println("El campo de selenium no esta habilitado.");
        }

        //************************************************************************************************
        //COMBOBOX
        Thread.sleep(500);
        WebElement so = driver.findElement(By.id("wsf-1-field-124"));
        if (so.getAttribute("required") == null) {
            System.out.println("El campo de sistema operativo esta habilitado.");
            WebElement cb = driver.findElement(By.id("wsf-1-field-124"));
            Select CBox= new Select(cb);
            System.out.println("El campo de opciones de so esta habilitado.");
            WebElement cb1=driver.findElement(By.id("wsf-1-field-125"));
            Select CBox1 = new Select(cb1);

            CBox.selectByVisibleText("Windows");

            CBox1.selectByVisibleText("Windows 7");
            CBox1.selectByVisibleText("Windows 10");
            CBox1.selectByVisibleText("Windows Server");

            CBox.selectByVisibleText("Linux");

            WebElement cb2 = driver.findElement(By.id("wsf-1-field-126"));
            Select CBox2 = new Select(cb2);
            CBox2.selectByVisibleText("Ubuntu");
            CBox2.selectByVisibleText("Debian");
            CBox2.selectByVisibleText("Read Hat");

            CBox.selectByVisibleText("Mac");

            WebElement cb3 = driver.findElement(By.id("wsf-1-field-127"));
            Select CBox3 = new Select(cb3);
            CBox3.selectByVisibleText("Capitan");
            CBox3.selectByVisibleText("Yosemite");
            CBox3.selectByVisibleText("Mavericks");
        } else {
            System.out.println("El campo de selenium no esta habilitado.");
        }

        //************************************************************************************************
        //CALENDAR
        Thread.sleep(500);
        WebElement ev = driver.findElement(By.id("wsf-1-field-128"));
        if (ev.getAttribute("required") == null) {
            System.out.println("El campo de eventos esta habilitado.");
            ev.sendKeys("30092023");
        } else {
            System.out.println("El campo de eventos no esta habilitado.");
        }

        Thread.sleep(500);
        WebElement ca = driver.findElement(By.id("wsf-1-field-129"));
        if (ca.getAttribute("required") == null) {
            System.out.println("El campo de calendario esta habilitado.");
            ca.sendKeys("30092023");
        } else {
            System.out.println("El campo de calendario no esta habilitado.");
        }

        //************************************************************************************************
        //BUTTON
        WebElement submit = driver.findElement(By.id("wsf-1-field-130"));
        submit.click();
    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
