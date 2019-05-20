public class Main {

    public static void main(String[] args) {

        ItemDetails product = new ItemDetails();
        String url = "https://www.homedepot.com/p/Magic-Chef-1-1-cu-ft-Countertop-Microwave-in-Black-with-Gray-Cavity-HMM1110B/305708078";
        ItemDetails.Website(product, url);
        System.out.println("Start");
        System.out.println(product.getBrandName());
        System.out.println(product.getCategory1());
        System.out.println(product.getProductDescription());
    }
}