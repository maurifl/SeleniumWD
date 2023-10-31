import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CamposRequeridos {
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
        driver.get("https://testingqarvn.com.es/campos-requeridos/");
    }

    @Test
    public void TestTutorial() throws InterruptedException {

        //************************************************************************************************
        //INPUTS
        WebElement nombre = driver.findElement(By.id("wsf-1-field-95"));
        nombre.clear();
        nombre.sendKeys("Dante Mauricio");
        if (nombre.getAttribute("required") != null) {
            System.out.println("El campo de nombre es requerido.");
        } else {
            System.out.println("El campo de nombre no es requerido.");
        }

        WebElement apellido = driver.findElement(By.id("wsf-1-field-96"));
        apellido.clear();
        apellido.sendKeys("Fontana Laplagne");
        if (apellido.getAttribute("required") != null) {
            System.out.println("El campo de apellido es requerido.");
        } else {
            System.out.println("El campo de apellido no es requerido.");
        }

        WebElement mail = driver.findElement(By.id("wsf-1-field-97"));
        mail.clear();
        mail.sendKeys("maurifl@gmail.com");
        if (mail.getAttribute("required") != null) {
            System.out.println("El campo de email es requerido.");
        } else {
            System.out.println("El campo de email no es requerido.");
        }

        WebElement tel = driver.findElement(By.id("wsf-1-field-98"));
        tel.clear();
        tel.sendKeys("2645152222");
        if (tel.getAttribute("required") != null) {
            System.out.println("El campo de teléfono es requerido.");
        } else {
            System.out.println("El campo de teléfono no es requerido.");
        }

        WebElement dir = driver.findElement(By.id("wsf-1-field-99"));
        dir.clear();
        dir.sendKeys("Lima 336 B° Hualilán 1 Rawson San Juan");
        if (dir.getAttribute("required") != null) {
            System.out.println("El campo de dirección es requerido.");
        } else {
            System.out.println("El campo de dirección no es requerido.");
        }

        //************************************************************************************************
        //CHECKBOX - CHECK
        WebElement php = driver.findElement(By.id("wsf-1-label-100-row-1"));
        Thread.sleep(500);
        php.click();
        if (php.getAttribute("required") != null) {
            System.out.println("El campo de php es requerido.");
        } else {
            System.out.println("El campo de php no es requerido.");
        }

        WebElement py = driver.findElement(By.id("wsf-1-label-100-row-2"));
        Thread.sleep(500);
        py.click();
        if (py.getAttribute("required") != null) {
            System.out.println("El campo de python es requerido.");
        } else {
            System.out.println("El campo de python no es requerido.");
        }

        WebElement js = driver.findElement(By.id("wsf-1-label-100-row-3"));
        Thread.sleep(500);
        js.click();
        if (js.getAttribute("required") != null) {
            System.out.println("El campo de javascript es requerido.");
        } else {
            System.out.println("El campo de javascript no es requerido.");
        }

        //CHECKBOX - UNCHECK
        php.click();
        Thread.sleep(500);
        py.click();
        Thread.sleep(500);
        js.click();
        Thread.sleep(500);

        //VALIDATION
        // isDisplayed: T/F if th element is displayed
        // isSelected: T/F if the element is selected
        // isEnabled: T/F if the element is enabled

        //isDisplayed()
        /*Boolean bool1 = php.isDisplayed();
        System.out.println(bool1);
        if (bool1 == true) {
            php.click();
        }

        //isSelected()
        Boolean bool2 = py.isSelected();
        System.out.println(bool2);
        if (bool2 == false) {
            py.click();
        }

        //isEnable
        Boolean bool3 = js.isEnabled();
        System.out.println(bool3);
        if (bool3 == true) {
            js.click();
        }*/

        //************************************************************************************************
        //RADIO BUTTONS
        Thread.sleep(500);
        WebElement cy = driver.findElement(By.id("wsf-1-label-101-row-1"));
        cy.isDisplayed();
        cy.isEnabled();
        if (!cy.isSelected()) {
            cy.click();
        }
        if (cy.getAttribute("required") != null) {
            System.out.println("El campo de cypress es requerido.");
        } else {
            System.out.println("El campo de cypress no es requerido.");
        }

        Thread.sleep(500);
        WebElement wd = driver.findElement(By.id("wsf-1-label-101-row-2"));
        wd.isDisplayed();
        wd.isEnabled();
        if (!wd.isSelected()) {
            wd.click();
        }
        if (wd.getAttribute("required") != null) {
            System.out.println("El campo de webdriver es requerido.");
        } else {
            System.out.println("El campo de webdriver no es requerido.");
        }

        Thread.sleep(500);
        WebElement se = driver.findElement(By.id("wsf-1-label-101-row-3"));
        se.isDisplayed();
        se.isEnabled();
        if (!se.isSelected()) {
            se.click();
        }
        if (se.getAttribute("required") != null) {
            System.out.println("El campo de selenium es requerido.");
        } else {
            System.out.println("El campo de selenium no es requerido.");
        }

        //************************************************************************************************
        //COMBOBOX
        WebElement cb = driver.findElement(By.id("wsf-1-field-102"));
        Select CBox= new Select(cb);
        String reqAtt = cb.getAttribute("required");
        if (reqAtt != null) {
            System.out.println("El combo sistema operativo es requerido.");
        } else {
            System.out.println("El combo sistema operativo no es requerido.");
        }

        WebElement cb1=driver.findElement(By.id("wsf-1-field-103"));
        Select CBox1 = new Select(cb1);
        String reqAtt1 = cb1.getAttribute("required");
        if (reqAtt1 != null) {
            System.out.println("El combo opciones es requerido.");
        } else {
            System.out.println("El combo opciones no es requerido.");
        }

        CBox.selectByVisibleText("Windows");

        CBox1.selectByVisibleText("Windows 7");
        CBox1.selectByVisibleText("Windows 10");
        CBox1.selectByVisibleText("Windows Server");

        CBox.selectByVisibleText("Linux");

        WebElement cb2 = driver.findElement(By.id("wsf-1-field-104"));
        Select CBox2 = new Select(cb2);
        CBox2.selectByVisibleText("Ubuntu");
        CBox2.selectByVisibleText("Debian");
        CBox2.selectByVisibleText("Read Hat");

        CBox.selectByVisibleText("Mac");

        WebElement cb3 = driver.findElement(By.id("wsf-1-field-105"));
        Select CBox3 = new Select(cb3);
        CBox3.selectByVisibleText("Capitan");
        CBox3.selectByVisibleText("Yosemite");
        CBox3.selectByVisibleText("Mavericks");

        //************************************************************************************************
        //Calendar
        WebElement dt=driver.findElement(By.id("wsf-1-field-106"));
        dt.sendKeys("30092023");
        String DT = dt.getAttribute("required");
        if (DT != null) {
            System.out.println("El campo eventos es requerido.");
        } else {
            System.out.println("El campo eventos no es requerido.");
        }

        WebElement dt1= driver.findElement(By.id("wsf-1-field-107"));
        dt1.sendKeys("30092023");
        String Cal = dt1.getAttribute("required");
        if (Cal != null) {
            System.out.println("El campo calendario es requerido.");
        } else {
            System.out.println("El campo calendario no es requerido.");
        }

        //************************************************************************************************
        //UpLoadFiles
        WebElement upload= driver.findElement(By.id("wsf-1-field-108"));
        String Up = upload.getAttribute("required");
        if (Up != null) {
            System.out.println("El combo file upload es requerido.");
        } else {
            System.out.println("El combo file upload no es requerido.");
        }

        upload.sendKeys("C:\\Users\\SkyNet\\Desktop\\SELENIUM WEB\\ProjIntellijSeleniumMaben\\src\\test\\java\\img\\cuadro.jpg");
        Thread.sleep(1000);

        //************************************************************************************************
        //BUTTON
        WebElement submit = driver.findElement(By.id("wsf-1-field-109"));
        submit.click();
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
