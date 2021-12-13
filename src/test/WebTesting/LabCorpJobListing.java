package src.test.WebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LabCorpJobListing {
    @Test
    public void SearchJobs (){
      System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
      WebDriver driver  = new ChromeDriver();
      driver.get("http://labcorp.com");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      driver.findElement(By.xpath("//*[@id=\"topofpage\"]/div/footer/div[1]/div/div[1]/div/nav[1]/ul/li[3]/a")).click();
      driver.findElement(By.name("k")).sendKeys("QA Automation Developer");
      driver.findElement(By.className("search-form__submit")).click();


    }
}
