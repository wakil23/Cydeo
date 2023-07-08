package wakil.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstDay {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.google.com");
        WebElement aceptarTodo = driver.findElement(By.id("L2AGLb"));
        Thread.sleep(3000);
        aceptarTodo.click();

        WebElement search = driver.findElement(By.id("APjFqb"));
        search.sendKeys("afghanistan"+ Keys.ENTER);

        driver.close();
    }
}
