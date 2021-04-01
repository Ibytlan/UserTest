import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UsersTest {


    public static WebDriver driver;

    @Test

    public void login() throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","C://chromedriver//chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://users.bugred.ru/user/login/index.html");
        driver.findElement(By.name("login")).sendKeys("vanjel@mail.ru");
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/form/table/tbody/tr[3]/td[2]/input")).click();

        WebElement Ivan = driver.findElement(By.xpath("//a[contains(text(),'Добавить пользователя')]"));
        Assert.assertEquals(true,Ivan.isDisplayed());

        driver.findElement(By.xpath("//*[@id=\"fat-menu\"]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"fat-menu\"]/ul/li[1]/a")).click();
        driver.findElement(By.name("gender")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("27/02/2000");
        driver.findElement(By.name("hobby")).sendKeys("FOOTBALL");
        driver.findElement(By.name("inn")).sendKeys("010101010101");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[8]/td[2]/input")).click();

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a/span")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/p[1]/a")).click();
        driver.findElement(By.name("name")).sendKeys("TASK1");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/table/tbody/tr[2]/td[2]/textarea")).sendKeys("2+2");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/table/tbody/tr[4]/td[2]/input")).click();

        driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[1]/td[2]/a")).click();
        driver.findElement(By.name("hours")).sendKeys("23");
        driver.findElement(By.name("minuts")).sendKeys("59");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/table/tbody/tr[3]/td[2]/select/option[@value='9']")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/table/tbody/tr[4]/td[2]/select/option[@value='3']")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/table/tbody/tr[5]/td[2]/select/option[@value='7']")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/table/tbody/tr[6]/td[2]/input")).click();

        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/a/span")).click();
        driver.findElement(By.xpath("/html/body/div[3]/p[1]/a")).click();
        driver.findElement(By.name("noibiz_name")).sendKeys("Нэйм");
        driver.findElement(By.name("noibiz_email")).sendKeys("sharashkinakontora@mail.ru");
        driver.findElement(By.name("noibiz_password")).sendKeys("1111");
        driver.findElement(By.name("noibiz_birthday")).sendKeys("31/12/1999");
        driver.findElement(By.name("noibiz_date_start")).sendKeys("01/01/2000");
        driver.findElement(By.name("noibiz_hobby")).sendKeys("SUPER QA Manual Engineer");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[21]/td[2]/input")).click();

        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/p[1]/a")).click();
        driver.findElement(By.name("name")).sendKeys("ФИРМА ВЕНИКОВ НЕ ВЯЖЕТ!");
        driver.findElement(By.name("inn")).sendKeys("010101010101");
        driver.findElement(By.name("ogrn")).sendKeys("0101010101010");
        driver.findElement(By.name("kpp")).sendKeys("010101010");
        driver.findElement(By.name("phone")).sendKeys("0800800800");
        driver.findElement(By.name("adress")).sendKeys("ул.Бассейна");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/table/tbody/tr[9]/td[2]/input")).click();

    }
}
