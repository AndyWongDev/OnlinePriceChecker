import org.openqa.selenium.By;

import java.util.ArrayList;

public class ItemDetails {

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

    public void HomeDepot() {
        this.homePage = "https://www.homedepot.com";
        this.category1 = Main.driver.findElement(By.xpath("//a[@class='breadcrumb__link'][2]")).toString();
        this.category2 = Main.driver.findElement(By.xpath("//a[@class='breadcrumb__link'][3]")).toString();
        this.category3 = Main.driver.findElement(By.xpath("//a[@class='breadcrumb__link'][4]")).toString();
        this.modelId = Main.driver.findElement(By.xpath("//h2[@class='product_details modelNo']")).toString();
        this.internetId = Main.driver.findElement(By.xpath("//span[@itemprop='productID']")).toString();
        this.storeSku = Main.driver.findElement(By.xpath("//h2[@class='product_details'][2]")).toString();

        this.brandName = Main.driver.findElement(By.xpath("//span[@class='bttn__content'][3]")).toString();
        this.itemName = Main.driver.findElement(By.xpath("//h1[@class='product-title__title']")).toString();
        this.itemCost = Float.parseFloat(Main.driver.findElement(By.xpath("//*[@id='ajaxPrice']")).getText());
        this.color = Main.driver.findElement(By.xpath("//span[@class='attribute__name']")).toString();
        this.stock = 0; //TODO: 2 Step process
    }
}