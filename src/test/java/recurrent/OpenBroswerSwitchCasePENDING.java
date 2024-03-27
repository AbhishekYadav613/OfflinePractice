package recurrent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

// open browser chosen by user using switch case.
public class OpenBroswerSwitchCasePENDING {
    public static void main(String[] args) throws InterruptedException {
        OpenBroswerSwitchCasePENDING ob = new OpenBroswerSwitchCasePENDING();
        ob.check();

    }

    public void check() throws InterruptedException {
        System.out.println("Enter the browser you want to open");
        Scanner sc = new Scanner(System.in);
        String brow = sc.nextLine();
        WebDriver driver = null;

        switch (brow) {
            case ("Chrome"):

                driver = new ChromeDriver();

//                WebElement button = driver.findElement(By.xpath("//"));
                //*[@id="yDmH0d"]/c-wiz/div/div/c-wiz/div/div/div/div[2]/div[2]/button
                //              button.click();
                break;


            case ("Firefox"):
                driver = new FirefoxDriver();
                break;

            case ("Safari"):
                System.out.println("Please select either CHROME or FIREFOX");
                break;
            default:
                System.out.println("BROWSER NOT INSTALLED.");

        }
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        Thread.sleep(5000);
        driver.quit();


    }


}
