import java.util.ArrayList;

class ItemDetails {
    //Default Fields:
    String category1;
    String category2;
    String category3;
    String modelId;
    String internetId;
    String storeSku;

    //Product Description
    String brandName;
    String itemName;
    float itemCost; //TODO: Consider using something besides primitive types for money
    String color;
    int stock;

    //Product Overview
    String productOverview;
    ArrayList<String> productDescription;
}
