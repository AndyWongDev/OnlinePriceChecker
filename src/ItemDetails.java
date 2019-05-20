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
    private String brandName;
    private String itemName;
    private float itemCost; //TODO: Consider using something besides primitive types for money
    private String color;
    private int stock;

    //Product Overview
    private String productOverview;
    private ArrayList<String> productDescription;

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public String getCategory1() {
        return category1;
    }

    public void setCategory1(String category1) {
        this.category1 = category1;
    }

    public String getCategory2() {
        return category2;
    }

    public void setCategory2(String category2) {
        this.category2 = category2;
    }

    public String getCategory3() {
        return category3;
    }

    public void setCategory3(String category3) {
        this.category3 = category3;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getInternetId() {
        return internetId;
    }

    public void setInternetId(String internetId) {
        this.internetId = internetId;
    }

    public String getStoreSku() {
        return storeSku;
    }

    public void setStoreSku(String storeSku) {
        this.storeSku = storeSku;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getItemCost() {
        return itemCost;
    }

    public void setItemCost(float itemCost) {
        this.itemCost = itemCost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getProductOverview() {
        return productOverview;
    }

    public void setProductOverview(String productOverview) {
        this.productOverview = productOverview;
    }

    public ArrayList<String> getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(ArrayList<String> productDescription) {
        this.productDescription = productDescription;
    }

    public static void Website(ItemDetails product, String url) {
        driver.get(url);
        product.HomeDepot();
    }

    private void HomeDepot() {
        setHomePage("https://www.homedepot.com");
        setCategory1(driver.findElement(By.xpath("(//a[@class='breadcrumb__link'])[2]")).getText());
        setCategory2(driver.findElement(By.xpath("(//a[@class='breadcrumb__link'])[3]")).getText());
        setCategory3(driver.findElement(By.xpath("(//a[@class='breadcrumb__link'])[4]")).getText());
        setModelId(driver.findElement(By.xpath("//h2[@class='product_details modelNo']")).getText());
        setInternetId(driver.findElement(By.xpath("//span[@itemprop='productID']")).getText());
        setStoreSku(driver.findElement(By.xpath("(//h2[@class='product_details'])[2]")).getText());

        setBrandName(driver.findElement(By.xpath("(//span[@class='bttn__content'])[3]")).getText());
        setItemName(driver.findElement(By.xpath("//h1[@class='product-title__title']")).getText());
//        setItemCost(Float.parseFloat(driver.findElement(By.xpath("//*[@id='ajaxPrice']")).getText()));
        setColor(driver.findElement(By.xpath("//span[@class='attribute__name']")).getText());
        setStock(0); //TODO: 2 Step process
    }
}