package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class selenium {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/shambho/Downloads/chromedriver_mac_arm64/chromedriver");
        WebDriver d = new ChromeDriver();
        d.get("https://linkedin.com");
        d.findElement(By.id("session_key")).sendKeys("amitgavali@proton.me");
        d.findElement(By.id("session_password")).sendKeys("Testing1234");
        d.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div/div/form/div[2]/button")).click();
        String u=d.getCurrentUrl();
        if(u.equals("https://www.linkedin.com/feed/?trk=homepage-basic_sign-in-submit"))
        {
            System.out.println("Test Case Passed");
        }
        else
        {
            System.out.println("Test Case Failed");
        }
    d.close();
    }
    
}
