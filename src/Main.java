public class Main {

    public static void main(String[] args) {
        ItemDetails product = new ItemDetails();

        String url = "https://www.homedepot.com/p/Magic-Chef-1-1-cu-ft-Countertop-Microwave-in-Black-with-Gray-Cavity-HMM1110B/305708078";

        ItemDetails.Website(product, url);

        System.out.println(product.color);
    }
}