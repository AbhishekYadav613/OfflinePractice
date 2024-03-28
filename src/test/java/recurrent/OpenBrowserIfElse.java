package recurrent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Objects;
import java.util.Scanner;

//taking input from user and opening that browser using IF ELSE.
public class OpenBrowserIfElse {
    public static void main(String[] args) throws InterruptedException {
        OpenBrowserIfElse dr = new OpenBrowserIfElse();
        dr.browse();

    }

    public void browse() throws InterruptedException {
        System.out.println("Enter the browser you want to open: " );
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        WebDriver driver = null;

        if (name.equalsIgnoreCase("Chrome"))
        {
            driver = new ChromeDriver();

        } else if (name.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();

        } else if (name.equalsIgnoreCase("Safari")) {
            System.out.println("Browser not installed. Please select from Chrome or Firefox.");
        }
        else
            System.out.println("PLEASE TRY AGAIN.");

        driver.get("https://www.facebook.com");
        Thread.sleep(5000);
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        System.out.println("Page Title is: " +driver.getTitle());
        driver.quit();
    }

}
