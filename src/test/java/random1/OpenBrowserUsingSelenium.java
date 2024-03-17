package random1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class OpenBrowserUsingSelenium {
    public static void main(String[] args) {
        System.out.println("Enter Browser Name: ");
        Scanner scan = new Scanner(System.in);
        String browser = scan.next();
        WebDriver driver = null;


        if (browser.equals("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            driver = new FirefoxDriver();
        }

            else if (browser.equals("safari")) {
            System.out.println("Browser NOT AVAILABLE.");
        }
            else
                System.out.println("TRY AGAIN");
            driver.get("www.google.com");
            driver.manage().window().maximize();
            driver.close();
        }
    }
