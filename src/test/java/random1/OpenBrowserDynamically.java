package random1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

// take input from user and open a browser.
// hit a URL and wait for 3 seconds.
// minimize and maximize the screen.
// close the browser.

public class OpenBrowserDynamically {

    public static void main(String[] args) throws InterruptedException {
        OpenBrowserDynamically nw = new OpenBrowserDynamically();
        nw.open();

    }

    public void open() throws InterruptedException {
        System.out.println("Enter the required browser: ");
        Scanner scan = new Scanner(System.in);
        String browser = scan.nextLine();
        WebDriver driver = null;

        switch (browser) {
            case ("chrome"):
                driver = new ChromeDriver();
                break;

            case ("firefox"):
                driver = new FirefoxDriver();
                break;

            case ("safari"):
                System.out.println("Browser not available.");
                break;
            default:
                System.out.println("OK TESTED.");
        }
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        Thread.sleep(3000);
        driver.manage().window().minimize();
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.quit();
    }
}
