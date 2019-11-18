package ohtu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tester {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("http://localhost:4567");
        WebElement element; 

        /*
        sleep(2);
        
        element = driver.findElement(By.linkText("login"));
        element.click();
        sleep(2);

        element = driver.findElement(By.name("username"));
        element.sendKeys("pekka");
        element = driver.findElement(By.name("password"));
        element.sendKeys("pekka123");
        element = driver.findElement(By.name("login"));
        
        sleep(2);
        element.submit();

        sleep(3);
        */

        /*
        element = driver.findElement(By.linkText("register new user"));
        element.click();
        sleep(2);

        element = driver.findElement(By.name("username"));
        element.sendKeys("matti");
        element = driver.findElement(By.name("password"));
        element.sendKeys("luukkainen123");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("luukkainen123");
        element = driver.findElement(By.name("signup"));
        element.click(); 
        */

        element = driver.findElement(By.linkText("register new user"));
        element.click();
        sleep(2);

        element = driver.findElement(By.name("username"));
        element.sendKeys("matti");
        element = driver.findElement(By.name("password"));
        element.sendKeys("luukkainen123");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("luukkainen123");
        element = driver.findElement(By.name("signup"));
        element.click(); 
        sleep(2);


        element = driver.findElement(By.linkText("continue to application page"));
        element.click();
        sleep(2);
        element = driver.findElement(By.linkText("logout"));
        element.click();
        driver.quit();
    }
    
    private static void sleep(int n){
        try{
            Thread.sleep(n*1000);
        } catch(Exception e){}
    }
}
