import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

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
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get("https://rambler.ru");
    }

    @Test
    public void Test() {

        driver.manage().window().maximize();

        WebElement explicitWaitEmail = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Введите e-mail']")));
        explicitWaitEmail.sendKeys("5first12@rambler.ru");

        driver.findElement(By.xpath("//div[@class='_2_6D _3EZH']//button[@type='button']")).click();

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        WebElement explicitWaitPassw = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Введите пароль']")));
        explicitWaitPassw.sendKeys("1a2b3c");

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        WebElement explicitWaitWriteLetter  = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='_3TeJ']")));
        explicitWaitWriteLetter.click();

        WebElement explicitWaitKomy = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='receivers']")));
        explicitWaitKomy.sendKeys("a.nechitaylo@hypervsn.com");

        driver.findElement(By.xpath("//input[@id='subject']")).sendKeys("Zdrassцэ, zabor pokrassцэ!!!");

        driver.findElement(By.xpath("//body[@class='mce-content-body']")).sendKeys("Hello world");

        driver.findElement(By.xpath("//span[contains(text(),'Отправить')]")).click();

    }

    @AfterTest
    public void afterTest(){
        driver.close();
    }

        }

