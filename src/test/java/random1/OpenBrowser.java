package random1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Objects;
import java.util.Scanner;

//Open browser on the basis of user's input.
public class OpenBrowser {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Enter Your Choice Of Browser: ");
        Scanner scan = new Scanner(System.in);
        String browser = scan.nextLine();
        WebDriver driver= null;

        if (Objects.equals(browser, "chrome"))
        {
            driver = new ChromeDriver();

        } else if (Objects.equals(browser, "firefox")) {
            driver= new FirefoxDriver();

        } else if (Objects.equals(browser, "safari")) {
            System.out.println("Browser not installed.");


        }else
            System.out.println("CHECK THE BROWSER YOU ENTERED.");
        driver.get("http:www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.quit();

    }
}

