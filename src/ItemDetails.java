import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class ItemDetails {
    private static final WebDriver driver = Selenium.Start();
    private String homePage;

    //Default Fields:
    private String category1;
    private String category2;
    private String category3;
    private String modelId;
    private String internetId;
    private String storeSku;

    //Product Description
    String brandName;
    String itemName;
    float itemCost; //TODO: Consider using something besides primitive types for money
    String color;
    int stock;

    //Product Overview
    String productOverview;
    ArrayList<String> productDescription;

    public static void Website(ItemDetails product, String url) {
        if(url.contains("www.homedepot.com")) {
            driver.get(url);
            product.HomeDepot();
        }
    }

    private void HomeDepot() {
        this.homePage = "https://www.homedepot.com";
        this.category1 = driver.findElement(By.xpath("//a[@class='breadcrumb__link'][2]")).toString();
        this.category2 = driver.findElement(By.xpath("//a[@class='breadcrumb__link'][3]")).toString();
        this.category3 = driver.findElement(By.xpath("//a[@class='breadcrumb__link'][4]")).toString();
        this.modelId = driver.findElement(By.xpath("//h2[@class='product_details modelNo']")).toString();
        this.internetId = driver.findElement(By.xpath("//span[@itemprop='productID']")).toString();
        this.storeSku = driver.findElement(By.xpath("//h2[@class='product_details'][2]")).toString();

        this.brandName = driver.findElement(By.xpath("//span[@class='bttn__content'][3]")).toString();
        this.itemName = driver.findElement(By.xpath("//h1[@class='product-title__title']")).toString();
        this.itemCost = Float.parseFloat(driver.findElement(By.xpath("//*[@id='ajaxPrice']")).getText());
        this.color = driver.findElement(By.xpath("//span[@class='attribute__name']")).toString();
        this.stock = 0; //TODO: 2 Step process
    }
}