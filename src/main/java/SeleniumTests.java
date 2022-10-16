import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class SeleniumTests {

    WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("file:///C:/Users/Tatiana/Desktop/Индивидуальное%20задание/index.html");

    }

    @After
    public void close(){
        driver.quit();
    }


    /*Тестирование переходов на другие страницы*/

    @Test
    public void mainToCoffee()
    {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]"));
        element.click();
        var expectedResult = "Кофе";
        var actualResult = driver.findElement(By.xpath("/html/body/content/center/h2")).getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void mainToProduction()
    {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]"));
        element.click();
        var expectedResult = "Изготовление";
        var actualResult = driver.findElement(By.xpath("/html/body/content/center/h2")).getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void mainToEquipment()
    {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]"));
        element.click();
        var expectedResult = "Оборудование";
        var actualResult = driver.findElement(By.xpath("/html/body/content/center/h2")).getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void mainToService()
    {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]"));
        element.click();
        var expectedResult = "Сервис";
        var actualResult = driver.findElement(By.xpath("/html/body/content/center/h2")).getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void mainToContacts()
    {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[6]"));
        element.click();
        var expectedResult = "Контакты";
        var actualResult = driver.findElement(By.xpath("/html/body/content/center/h2")).getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    /*Тестирование наличия карточек*/

    @Test
    public void mainCard1() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("/html/body/content/div[1]/div"));
        var expectedResult = driver.findElement(By.xpath("/html/body/content/div[1]/div"));
        var actualResult = driver.findElement(By.xpath("/html/body/content/div[1]/div"));
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void mainCard2()
    {
        WebElement element = driver.findElement(By.xpath("/html/body/content/div[2]/div"));
        var expectedResult = driver.findElement(By.xpath("/html/body/content/div[2]/div"));
        var actualResult = driver.findElement(By.xpath("/html/body/content/div[2]/div"));
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void mainCard3()
    {
        WebElement element = driver.findElement(By.xpath("/html/body/content/div[3]/div"));
        var expectedResult = driver.findElement(By.xpath("/html/body/content/div[3]/div"));
        var actualResult = driver.findElement(By.xpath("/html/body/content/div[3]/div"));
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void mainCard4()
    {
        WebElement element = driver.findElement(By.xpath("/html/body/content/div[4]/div"));
        var expectedResult = driver.findElement(By.xpath("/html/body/content/div[4]/div"));
        var actualResult = driver.findElement(By.xpath("/html/body/content/div[4]/div"));
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void mainCard5()
    {
        WebElement element = driver.findElement(By.xpath("/html/body/content/section/div/div/div[1]/div"));
        var expectedResult = driver.findElement(By.xpath("/html/body/content/section/div/div/div[1]/div"));
        var actualResult = driver.findElement(By.xpath("/html/body/content/section/div/div/div[1]/div"));
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void mainCard6()
    {
        WebElement element = driver.findElement(By.xpath("/html/body/content/section/div/div/div[2]/div"));
        var expectedResult = driver.findElement(By.xpath("/html/body/content/section/div/div/div[2]/div"));
        var actualResult = driver.findElement(By.xpath("/html/body/content/section/div/div/div[2]/div"));
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void mainCard7()
    {
        WebElement element = driver.findElement(By.xpath("/html/body/content/section/div/div/div[3]/div"));
        var expectedResult = driver.findElement(By.xpath("/html/body/content/section/div/div/div[3]/div"));
        var actualResult = driver.findElement(By.xpath("/html/body/content/section/div/div/div[3]/div"));
        Assert.assertEquals(expectedResult, actualResult);
    }

    /*Тестирование кнопок элемента carousel*/

    @Test
    public void Carousel()
    {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"carouselExampleIndicators\"]/div[2]/div[1]/img"));
        var expectedResult = driver.findElement(By.xpath("//*[@id=\"carouselExampleIndicators\"]/div[2]/div[1]/img"));
        var actualResult = driver.findElement(By.xpath("//*[@id=\"carouselExampleIndicators\"]/div[2]/div[1]/img"));
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void CarouselTo2() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"carouselExampleIndicators\"]/button[2]/span[1]"));
        element.click();
        sleep(1000);
        var expectedResult = driver.findElement(By.xpath("//*[@id=\"carouselExampleIndicators\"]/div[2]/div[2]/img"));
        var actualResult = driver.findElement(By.xpath("//*[@id=\"carouselExampleIndicators\"]/div[2]/div[2]/img"));
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void CarouselTo3() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"carouselExampleIndicators\"]/button[1]/span[1]"));
        element.click();
        sleep(1000);
        var expectedResult = driver.findElement(By.xpath("//*[@id=\"carouselExampleIndicators\"]/div[2]/div[3]/img"));
        var actualResult = driver.findElement(By.xpath("//*[@id=\"carouselExampleIndicators\"]/div[2]/div[3]/img"));
        Assert.assertEquals(expectedResult, actualResult);
    }

    /*Проверка наличия футера на странице "Контакты"*/

    @Test
    public void contactsFooter() {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[6]/a"));
        element.click();
        WebElement elementF = driver.findElement(By.xpath("/html/body/footer"));
        var expectedResult = driver.findElement(By.xpath("/html/body/footer"));
        var actualResult = driver.findElement(By.xpath("/html/body/footer"));
        Assert.assertEquals(expectedResult, actualResult);
    }

    /*Проверка возможности ввода данных в поля ввода*/

    @Test
    public void contactsField1() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[6]/a"));
        element.click();
        WebElement elementField = driver.findElement(By.xpath("/html/body/content/div/div[2]/div/div/form/input[1]"));
        elementField.sendKeys("12@b.");
        sleep(3000);
        var expectedResult = "12@b.";
        var actualResult = driver.findElement(By.xpath("/html/body/content/div/div[2]/div/div/form/input[1]")).getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void contactsField2() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[6]/a"));
        element.click();
        WebElement elementField = driver.findElement(By.xpath("/html/body/content/div/div[2]/div/div/form/input[2]"));
        elementField.sendKeys("12@b.");
        sleep(3000);
        var expectedResult = "12@b.";
        var actualResult = driver.findElement(By.xpath("/html/body/content/div/div[2]/div/div/form/input[2]")).getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void contactsField3() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[6]/a"));
        element.click();
        WebElement elementField = driver.findElement(By.xpath("/html/body/content/div/div[2]/div/div/form/input[3]"));
        elementField.sendKeys("12@b.");
        sleep(3000);
        var expectedResult = "12@b.";
        var actualResult = driver.findElement(By.xpath("/html/body/content/div/div[2]/div/div/form/input[3]")).getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void contactsField4() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[6]/a"));
        element.click();
        WebElement elementField = driver.findElement(By.xpath("/html/body/content/div/div[2]/div/div/form/textarea"));
        elementField.sendKeys("12@b.");
        sleep(3000);
        var expectedResult = "12@b.";
        var actualResult = driver.findElement(By.xpath("/html/body/content/div/div[2]/div/div/form/textarea")).getText();
        Assert.assertEquals(expectedResult, actualResult);
    }
}