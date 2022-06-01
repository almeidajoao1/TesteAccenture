package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class MyStepsDefinition {

    public WebDriver driver;

    @Before
    public void createDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\TesteAccenture\\AccentureTestCucumber\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Dado("^que eu esteja na página do formulário Enter Vehicle Data$")
    public void que_eu_esteja_na_página_do_formulário_Enter_Vehicle_Data() throws Throwable {
        driver.get("http://sampleapp.tricentis.com/101/app.php");
    }

    @Quando("^eu preencher o formulário Enter Vehicle Data$")
    public void eu_preencher_o_formulário_Enter_Vehicle_Data() throws Throwable {
        WebElement make = driver.findElement(By.id("make"));
        Select select = new Select(make);
        select.selectByVisibleText("Audi");

        WebElement model = driver.findElement(By.id("model"));
        Select select1 = new Select(model);
        select1.selectByVisibleText("Scooter");

        driver.findElement(By.id("cylindercapacity")).sendKeys("1");

        driver.findElement(By.id("engineperformance")).sendKeys("1");

        driver.findElement(By.id("dateofmanufacture")).sendKeys("04/25/1996");

        WebElement numberofseats = driver.findElement(By.id("numberofseats"));
        Select select2 = new Select(numberofseats);
        select2.selectByVisibleText("5");

        ((JavascriptExecutor)driver).executeScript("scroll(0, 400)");

        driver.findElement(By.className("ideal-radio")).click();

        WebElement numberofseatsmotorcycle = driver.findElement(By.id("numberofseatsmotorcycle"));
        Select select3 = new Select(numberofseatsmotorcycle);
        select3.selectByVisibleText("3");

        WebElement fuel = driver.findElement(By.id("fuel"));
        Select select4 = new Select(fuel);
        select4.selectByVisibleText("Petrol");

        driver.findElement(By.id("payload")).sendKeys("1");

        driver.findElement(By.id("totalweight")).sendKeys("111");

        driver.findElement(By.id("listprice")).sendKeys("1111");

        driver.findElement(By.id("licenseplatenumber")).sendKeys("1");

        driver.findElement(By.id("annualmileage")).sendKeys("111");
    }

    @Quando("^clicar o botão Next Enter Insurant Data$")
    public void clicar_o_botão_Next_Enter_Insurant_Data() throws Throwable {
        driver.findElement(By.id("nextenterinsurantdata")).click();
    }

    @Quando("^preencher o formulário Enter Insurant Data$")
    public void preencher_o_formulário_Enter_Insurant_Data() throws Throwable {
        ((JavascriptExecutor)driver).executeScript("scroll(400, 0)");

        driver.findElement(By.id("firstname")).sendKeys("Genilson");

        driver.findElement(By.id("lastname")).sendKeys("Novalis");

        driver.findElement(By.id("birthdate")).sendKeys("04/25/1996");

        driver.findElement(By.xpath("//body/div[@id='site-content']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[4]/p[1]/label[1]")).click();

        ((JavascriptExecutor)driver).executeScript("scroll(0, 400)");

        driver.findElement(By.id("streetaddress")).sendKeys("111");

        WebElement country = driver.findElement(By.id("country"));
        Select select5 = new Select(country);
        select5.selectByVisibleText("Brazil");

        driver.findElement(By.id("zipcode")).sendKeys("1111");

        driver.findElement(By.id("city")).sendKeys("a");

        WebElement occupation = driver.findElement(By.id("occupation"));
        Select select6 = new Select(occupation);
        select6.selectByVisibleText("Employee");

        driver.findElement(By.xpath("//body/div[@id='site-content']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[10]/p[1]/label[1]/span[1]")).click();

        driver.findElement(By.id("website")).sendKeys("https://www.cirogomes.com.br/");
    }

    @Quando("^preencher o formulário Enter Product Data$")
    public void preencher_o_formulário_Enter_Product_Data() throws Throwable {
        ((JavascriptExecutor)driver).executeScript("scroll(400, 0)");

        driver.findElement(By.id("startdate")).sendKeys("12/31/2022");

        WebElement insurancesum = driver.findElement(By.id("insurancesum"));
        Select select7 = new Select(insurancesum);
        select7.selectByVisibleText("3.000.000,00");

        WebElement meritrating = driver.findElement(By.id("meritrating"));
        Select select8 = new Select(meritrating);
        select8.selectByVisibleText("Super Bonus");

        WebElement damageinsurance = driver.findElement(By.id("damageinsurance"));
        Select select9 = new Select(damageinsurance);
        select9.selectByVisibleText("No Coverage");

        driver.findElement(By.xpath("//body/div[@id='site-content']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[3]/div[5]/p[1]/label[1]")).click();

        WebElement courtesycar = driver.findElement(By.id("courtesycar"));
        Select select10 = new Select(courtesycar);
        select10.selectByVisibleText("No");
    }

    @Quando("^clicar o botão Next Enter Product Data$")
    public void clicar_o_botão_Next_Enter_Product_Data() throws Throwable {
        driver.findElement(By.id("nextenterproductdata")).click();
    }

    @Quando("^preencher o formulário Select Price Option$")
    public void preencher_o_formulário_Select_Price_Option() throws Throwable {
        driver.findElement(By.xpath("//body/div[@id='site-content']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[1]/table[1]/tfoot[1]/tr[1]/th[2]/label[1]")).click();
        Thread.sleep(5000);
    }

    @Quando("^clicar o botão Next Select Price Option$")
    public void clicar_o_botão_Next_Select_Price_Option() throws Throwable {
        driver.findElement(By.xpath("//button[@id='nextselectpriceoption']")).click();
    }

    @Quando("^clicar o botão Next Send Quote$")
    public void clicar_o_botão_Next_Send_Quote() throws Throwable {
        driver.findElement(By.xpath("//button[@id='nextsendquote']")).click();
    }

    @Quando("^preencher o formulário Send Quote$")
    public void preencher_o_formulário_Send_Quote() throws Throwable {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("a@a.om");
        driver.findElement(By.id("phone")).sendKeys("11111111");
        driver.findElement(By.id("username")).sendKeys("aaaa");
        driver.findElement(By.id("password")).sendKeys("Aaaaa1");
        driver.findElement(By.id("confirmpassword")).sendKeys("Aaaaa1");
        driver.findElement(By.id("Comments")).sendKeys("N/A");
    }

    @Quando("^clicar o botão Send$")
    public void clicar_o_botão_Send() throws Throwable {
        driver.findElement(By.xpath("//button[@id='sendemail']")).click();
        Thread.sleep(15000);
    }

    @Então("^eu receberei a mensagem Sending e-mail success$")
    public void eu_receberei_a_mensagem_Sending_e_mail_success() throws Throwable {
        WebElement msg = driver.findElement(By.xpath("//h2[contains(text(),'Sending e-mail success!')]"));
        Assert.assertEquals( "Sending e-mail success!", msg.getText());
    }

    @After
    public void fechar() {
        driver.quit();
    }
}