import org.openqa.selenium.WebDriver;

public class Website {
	
	static WebDriver driver = Main.driver;
	
	public static class HomeDepot {
		
		static String homePage = "https://www.homedepot.com";
		static String categoryPage;
		
		static void goShop(String category, int minPrice, int maxPrice) {
			switch(category) {
			case "Microwaves":
				categoryPage = "/b/Appliances-Microwaves/N-5yc1vZc3ok";
				driver.get(homePage+categoryPage+"?lowerBound="+minPrice+"&upperBound="+maxPrice);
				break;
			default:
				System.out.println("Error: Invalid Category: "+category);
			}
		}
	}
}
