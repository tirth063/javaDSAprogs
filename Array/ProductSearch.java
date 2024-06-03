package Array;

import java.util.ArrayList;
import java.util.List;

public class ProductSearch {
    public static void main(String[] args) {
        List<List<String>> products = new ArrayList<>();

        // Assume products is populated with data
        String targetCategory = "category1";
        String targetPrice = "10.00";

        List<String> matchingProducts = searchProducts(products, targetCategory, targetPrice);

        if (matchingProducts.isEmpty()) {
            System.out.println("No matching products found.");
        } else {
            System.out.println("Matching products:");
            for (String product : matchingProducts) {
                System.out.println(product);
            }
        }
    }

    public static List<String> searchProducts(List<List<String>> products, String targetCategory, String targetPrice) {
        List<String> matchingProducts = new ArrayList<>();

        for (List<String> product : products) {
            String category = product.get(2); // Assuming category is at index 2
            String price = product.get(1); // Assuming price is at index 1

            if (category.equals(targetCategory) && price.equals(targetPrice)) {
                matchingProducts.add(product.get(0)); // Assuming product name is at index 0
            }
        }

        return matchingProducts;
    }
}
