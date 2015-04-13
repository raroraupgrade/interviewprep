import static org.junit.Assert.*;

import java.security.SecureRandom;
import java.math.BigInteger;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.pagefactory.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TechEx {

    WebDriver driver = new FirefoxDriver();

    @Before
    public void setUp() throws Exception {
        String username = "rajantestingtwr";
        String password = "Tweetingtweety!!";

        // Set implicit wait to 10 seconds
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Go to twitter.com
        driver.get("http://www.twitter.com");

        // Enter username
        WebElement username_input = driver.findElement(By.id("signin-email"));
        username_input.sendKeys(username);

        // Enter password
        WebElement password_input = driver.findElement(By.id("signin-password"));
        password_input.sendKeys(password + Keys.RETURN);

    }

    @After
    public void tearDown() throws Exception {
        try {
            // Go to twitter.com
            driver.get("http://www.twitter.com");

            // Click to get to Logout button
            driver.findElement(By.cssSelector(".settings")).click();

            // Click on Logout
            driver.findElement(By.id("signout-button")).click();
        } finally {
            driver.quit();
        }
    }

    @Test
    public void editProfileFromHomePage() {
        // Open top menu for clicking on Profile button
        driver.findElement(By.cssSelector(".settings")).click();

        // Get one of the mini profile links from the profile summary view
        WebElement profile_link = driver.findElement(By.cssSelector(".js-mini-current-user"));

        // Click to get to the profile page
        profile_link.click();

        // Get the edit profile button
        WebElement edit_profile_link = driver.findElement(By
                .cssSelector(".UserActions-editButton.edit-button.btn"));

        // Verify that the text in the edit profile button equals 'Edit profile'
        assertEquals(edit_profile_link.getText(), "Edit profile");
    }

    @Test
    public void tweetFromHomePage() {
        // Locate the global Tweet button on top right corner
        WebElement global_Tweet_Button = driver.findElement(By.cssSelector(".js-global-new-tweet"));

        // Click to open the Tweet dialog
        global_Tweet_Button.click();

        // Locate the Tweet text box
        WebElement tweet_Box = driver.findElement(By.cssSelector("#tweet-box-global"));

        // Create a random String
        String rand = new BigInteger(130, new SecureRandom()).toString(32);
        
        // Enter text
        tweet_Box.sendKeys(rand + " This tweet sent by webdriver #webdrivertesttweet");

        // Click on the Tweet button
        driver.findElement(
                By.xpath("//button[@class='btn primary-btn tweet-action tweet-btn js-tweet-btn']"))
                .click();
        
        // Refresh page for the new tweet to appear
        driver.navigate().refresh();
        
        // Get element for the tweet just posted
        WebElement posted_Tweet = driver.findElements(By.cssSelector(".js-tweet-text.tweet-text")).get(0);
        
        // Explicit wait for the newly posted tweet
        // WebDriverWait wait = new WebDriverWait(driver, 10);
        // wait.until(ExpectedConditions.textToBePresentInElement(posted_Tweet, rand +
        // " This tweet sent by webdriver #webdrivertesttweet"));
        
        // Verify text of the tweet that was posted
        assertEquals (rand + " This tweet sent by webdriver #webdrivertesttweet", posted_Tweet.getText());
    }
}
