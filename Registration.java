package src.main;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Registration {
    WebDriver driver = null;

    @BeforeTest
    public void OpenBrowser ()throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\mennatallahw\\IdeaProjects" +
                        "\\MavenSelenium\\src\\main\\resources\\chromedriver.exe");

        driver = new ChromeDriver();

    }
    @Test
    public void RegistrationValiddata() throws InterruptedException{
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Menna");
        driver.findElement(By.id("LastName")).sendKeys("Mahmoud");
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("20");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("April");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1992");
        driver.findElement(By.id("Email")).sendKeys("mennawahby92@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("BM");
        driver.findElement(By.id("Password")).sendKeys("MennaMenna");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("MennaMenna");
        driver.findElement(By.id("register-button")).click();

        Thread.sleep(7000);


        driver.quit();


    }
    @Test

    public void LoginValiddata () throws InterruptedException {
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]")).click();
        Thread.sleep(7000);
        driver.findElement(By.id("Email")).sendKeys("mennawahby92@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("MennaMenna");
        driver.findElement(By.xpath("//form//button[@type=\"submit\"]")).click();
        Thread.sleep(7000);



    }
    @Test

    public void ResetPassword () throws InterruptedException {

        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]")).click();
        driver.findElement(By.cssSelector("a[href=\"/passwordrecovery\"]")).click();
        driver.findElement(By.id("Email")).sendKeys("mennawahby92@gmail.com");
        driver.findElement(By.xpath("//form//button[@type=\"submit\"]")).click();


        Thread.sleep(7000);
        driver.quit();

    }
    @Test

    public void SearchProduct () throws InterruptedException {

        driver.get("https://demo.nopcommerce.com/");
        // el mafrood a3ml login
        driver.findElement(By.id("small-searchterms")).sendKeys("macbook");
        driver.findElement(By.id("small-searchterms")).sendKeys(Keys.ENTER);
        Thread.sleep(7000);
    }
    @Test

    public void SwitchCurrency () throws InterruptedException {

        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(7000);

        driver.findElement(By.id("customerCurrency")).sendKeys("Euro");
        driver.findElement(By.id("customerCurrency")).sendKeys(Keys.ENTER);
        Thread.sleep(7000);

        }
        @Test

    public void SelectCateogry() throws InterruptedException {
        //fih failure 3ashan bey5tar electronics ely foo2
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.id("small-searchterms")).sendKeys("Electronics");
        driver.findElement(By.id("small-searchterms")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a[href=\"/electronics\"]")).click();

        driver.findElement(By.cssSelector("a[href=\"/cell-phones\"]")).click();


        Thread.sleep(7000);
        driver.quit();





    }
    @Test

    public void FilterColor() throws InterruptedException {
        driver.get("https://demo.nopcommerce.com/shoes");
        driver.findElement(By.id("attribute-option-15")).click();
        Thread.sleep(7000);
        driver.quit();

    }

    @Test

    public void SelectTop() throws InterruptedException{
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.id("small-searchterms")).sendKeys("clothing");
        driver.findElement(By.id("small-searchterms")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("a[href=\"/nike-tailwind-loose-short-sleeve-running-shirt\"]")).click();
        Thread.sleep(7000);



    }

    @Test

    public void AddtoShoppingcart() throws InterruptedException{
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.cssSelector("a[href=\"/25-virtual-gift-card\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("giftcard_43_RecipientName")).sendKeys("Donia");
        driver.findElement(By.id("giftcard_43_RecipientEmail")).sendKeys("donia@gmail.com");
        driver.findElement(By.id("giftcard_43_SenderName")).sendKeys("menna");
        driver.findElement(By.id("giftcard_43_SenderEmail")).sendKeys("Menna@gmail.com");
        driver.findElement(By.id("giftcard_43_Message")).sendKeys("Happy birthday");
        driver.findElement(By.id("add-to-cart-button-43")).click();
        driver.findElement(By.cssSelector("a[href=\"/cart\"]")).click();
        Thread.sleep(3000);
        driver.quit();







    }

    @Test

    public void AddtoWishlist() throws InterruptedException{
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.cssSelector("a[href=\"/htc-one-m8-android-l-50-lollipop\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("add-to-wishlist-button-18")).click();
        Thread.sleep(3000);





    }




}
