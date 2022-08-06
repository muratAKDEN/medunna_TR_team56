package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;


public class Driver {


    /*
       POM'de Driver icin TestBase class'ina extends etmek yerine
       Driver class'indan static method'lar kullanarak
       driver olusturup, ilgili ayarlarin yapilmasi
       ve en sonda driver'in kapatilmasi tercih edilmistir.
        */
    // POM de Driver Class indan obje olusturulmasi istenen 1 durum degildir.
    // Bu durumda Driver Class ndaki  Contructor Private yapilir. Buna Singleton pattern denir (tekli kullanim)



    private Driver(){

    }

    static WebDriver driver;


    public static WebDriver getDriver() {
        if (driver==null) {
            switch (ConfigReader.getProperty("browser")){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                default: WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }

        return driver;
    }

    public static void closeDriver() {
        if (driver!=null) {
            driver.close();
            driver=null;
        }
    }

}