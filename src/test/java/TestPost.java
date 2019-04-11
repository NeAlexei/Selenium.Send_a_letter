import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;
import static org.testng.Assert.assertTrue;

public class TestPost {
    WebDriver driver;
//    private String URL = "";
//    private String URL_letter_page = "";
//    public static final String LOGIN = "";
//    public static final String PASSW = "";
//    public static final String LOG_BUTTON = "";

    @BeforeTest
    public void preCondition(){
//        System.setProperty("webdriver.edge.driver","D:\\Java\\TestPost\\src\\main\\resources\\MicrosoftWebDriver.exe");
        System.setProperty("webdriver.chrome.driver","D:\\Java\\TestPost\\src\\main\\resources\\chromedriver.exe");
//        driver = new EdgeDriver();
        driver = new ChromeDriver();
//        driver.get("https://rambler.ru");

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get("https://gmail.com");

    }

    @Test
    public void Test() {

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='identifierId']"));
        driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("nechytaila89@gmail.com");

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//span[contains(text(),'Далее')]"));
        driver.findElement(By.xpath("//span[contains(text(),'Далее')]")).click();

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        WebElement explicitWaitPassword = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='password']")));
        explicitWaitPassword.sendKeys("y9cn41k5");

//        driver.findElement(By.xpath("//input[@name='password']"));
//        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("y9cn41k5");

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//span[contains(text(),'Далее')]"));
        driver.findElement(By.xpath("//span[contains(text(),'Далее')]")).click();

//        WebElement explicitWait1 = (new WebDriverWait(driver, 12))
//                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='identifierId']")));
//        explicitWait1.sendKeys("nechytaila89@gmail.com");
//
//        WebElement explicitWait2 = (new WebDriverWait(driver, 12))
//                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Далее')]")));
//        explicitWait2.click();

//        driver.findElement(By.xpath("//span[contains(text(),'Далее')]")).click();

//        driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("nechytaila89@gmail.com");
//        WebElement explicitWait1 = (new WebDriverWait(driver, 5))
//                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Далее')]")));

//        WebDriverWait wait = new WebDriverWait(driver, 10);

//        WebElement explicitWait3 = (new WebDriverWait(driver, 12))
//                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class='whsOnd zHQkBf']")));
//        explicitWait3.sendKeys("y9cn41k5");
//
//        WebElement explicitWait4 = (new WebDriverWait(driver, 12))
//                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Далее')]")));
//        explicitWait4.click();

//
//        driver.findElement(By.xpath("//span[contains(text(),'Далее')]")).click();

//        driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("y9cn41k5");
//        driver.findElement(By.xpath("//span[contains(text(),'Далее')]")).click();

        WebElement explicitWaitCreate = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3 T-I-JW T-I-JO']")));
        explicitWaitCreate.click();

        WebElement explicitWaitComy = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//textarea[@id=':1uz']")));
        explicitWaitComy.sendKeys("a.nechitaylo@hypervsn.com");

        driver.findElement(By.xpath("//input[@id=':1uh']")).sendKeys("Приветствие");
        driver.findElement(By.xpath("//div[@id=':1u7']")).click();


//        driver.findElement(By.xpath("//textarea[@id=':om']")).sendKeys("a.nechitaylo@hypervsn.com");
//        driver.findElement(By.xpath("//input[@id=':o4']")).sendKeys("Приветствие");
//        driver.findElement(By.xpath("//div[@id=':p9']")).sendKeys("Здрасссьцэ!");
//        driver.findElement(By.xpath("//div[@id=':nu']")).click();
    }

    @AfterTest
    public void afterTest(){
        driver.close();
    }

        }

