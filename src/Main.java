import org.openqa.selenium.WebDriver;

public class Main {

    public static final WebDriver driver = Selenium.Start();

    public static void main(String[] args) {
        Website.HomeDepot.goShop("Microwaves", 0, 100);
    }
}