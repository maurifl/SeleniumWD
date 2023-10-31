import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CBDependiente {
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
        driver.get("https://testingqarvn.com.es/combobox-dependiente/");
    }

    @Test
    public void TestTutorial() throws InterruptedException {

        //************************************************************************************************
        //INPUTS
        WebElement nombre = driver.findElement(By.id("wsf-1-field-54"));
        nombre.clear();
        nombre.sendKeys("Dante Mauricio");

        WebElement apellido = driver.findElement(By.id("wsf-1-field-55"));
        apellido.clear();
        apellido.sendKeys("Fontana Laplagne");

        WebElement mail = driver.findElement(By.id("wsf-1-field-56"));
        mail.clear();
        mail.sendKeys("maurifl@gmail.com");

        WebElement tel = driver.findElement(By.id("wsf-1-field-57"));
        tel.clear();
        tel.sendKeys("2645152222");

        WebElement dir = driver.findElement(By.id("wsf-1-field-58"));
        dir.clear();
        dir.sendKeys("Lima 336 B° Hualilán 1 Rawson San Juan");

        //************************************************************************************************
        //CHECKBOX - CHECK
        WebElement php = driver.findElement(By.id("wsf-1-label-59-row-1"));
        Thread.sleep(500);
        php.click();

        WebElement py = driver.findElement(By.id("wsf-1-label-59-row-2"));
        Thread.sleep(500);
        py.click();

        WebElement js = driver.findElement(By.id("wsf-1-label-59-row-3"));
        Thread.sleep(500);
        js.click();

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
        Boolean bool1 = php.isDisplayed();
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
        }

        //************************************************************************************************
        //RADIO BUTTONS
        Thread.sleep(500);
        WebElement cy = driver.findElement(By.id("wsf-1-label-60-row-1"));
        cy.isDisplayed();
        cy.isEnabled();
        if (!cy.isSelected()) {
            cy.click();
        }

        Thread.sleep(500);
        WebElement wd = driver.findElement(By.id("wsf-1-label-60-row-2"));
        wd.isDisplayed();
        wd.isEnabled();

        if (!wd.isSelected()) {
            wd.click();
        }

        Thread.sleep(500);
        WebElement se = driver.findElement(By.id("wsf-1-label-60-row-3"));
        se.isDisplayed();
        se.isEnabled();

        if (!se.isSelected()) {
            se.click();
        }

        //************************************************************************************************
        //COMBOBOX
        WebElement cb = driver.findElement(By.id("wsf-1-field-61"));
        Select CBox= new Select(cb);
        WebElement cb1=driver.findElement(By.id("wsf-1-field-63"));
        Select CBox1 = new Select(cb1);

        CBox.selectByVisibleText("Windows");

        CBox1.selectByVisibleText("Windows 7");
        CBox1.selectByVisibleText("Windows 10");
        CBox1.selectByVisibleText("Windows Server");


        CBox.selectByVisibleText("Linux");

        WebElement cb2 = driver.findElement(By.id("wsf-1-field-64"));
        Select CBox2 = new Select(cb2);
        CBox2.selectByVisibleText("Ubuntu");
        CBox2.selectByVisibleText("Debian");
        CBox2.selectByVisibleText("Read Hat");


        CBox.selectByVisibleText("Mac");

        WebElement cb3 = driver.findElement(By.id("wsf-1-field-65"));
        Select CBox3 = new Select(cb3);
        CBox3.selectByVisibleText("Capitan");
        CBox3.selectByVisibleText("Yosemite");
        CBox3.selectByVisibleText("Mavericks");

        //************************************************************************************************
        //BUTTON
        WebElement submit = driver.findElement(By.id("wsf-1-field-62"));
        submit.click();
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
