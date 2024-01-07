import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class ShopItEasy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a map to store item-to-rack mappings
        Map<String, String> itemRackMap = new HashMap<>();
        itemRackMap.put("fresh produce", "Rack A");
        itemRackMap.put("apples", "Rack A 1st shelf");
        itemRackMap.put("bananas", "Rack A 2nd shelf");
        itemRackMap.put("strawberries", "Rack A 3rd shelf");
        itemRackMap.put("avocados", "Rack A 4th shelf");
        itemRackMap.put("bell Peppers", "Rack A 5th shelf");
        itemRackMap.put("carrots", "Rack A 6th shelf");
        itemRackMap.put("broccoli", "Rack A 7th shelf");
        itemRackMap.put("garlic", "Rack A 8th shelf");
        itemRackMap.put("lemon", "Rack A 9th shelf");
        itemRackMap.put("onion", "Rack A 10th shelf");
        itemRackMap.put("potatoes", "Rack A 10th shelf");
        itemRackMap.put("tomatoes", "Rack A 10th shelf");
        itemRackMap.put("grains", "Rack B");
        itemRackMap.put("bread", "Rack B 1st shelf");
        itemRackMap.put("pasta", "Rack B 2nd shelf");
        itemRackMap.put("rice", "Rack B 3rd shelf");
        itemRackMap.put("dosa rice", "Rack B 3rd shelf");
        itemRackMap.put("idli rice", "Rack B 3rd shelf");
        itemRackMap.put("ragi", "Rack B 4th shelf");
        itemRackMap.put("wheat", "Rack B 5th shelf");
        itemRackMap.put("jowar", "Rack B 6th shelf");
        itemRackMap.put("noodles", "Rack B 7th shelf");
        itemRackMap.put("semolina", "Rack B 8th shelf");
        itemRackMap.put("clothes", "Rack C");
        itemRackMap.put("stationary items", "Rack D");
        itemRackMap.put("cereals", "Rack E");
        itemRackMap.put("detergent powder", "Rack F 1st shelf");
        itemRackMap.put("shampoo", "Rack F 2nd shelf");
        itemRackMap.put("soap", "Rack F 3rd shelf");
        itemRackMap.put("toothpaste", "Rack F 4th shelf");
        itemRackMap.put("hairoil", "Rack G 1st shelf");
        itemRackMap.put("face wash", "Rack G 2nd shelf");
        itemRackMap.put("shower gel", "Rack G 3rd shelf");
        itemRackMap.put("cosmetics", "Rack G 4th shelf");
        itemRackMap.put("snacks", "Rack H 1st shelf");



        // Add more items and racks as needed

        while (true) {
            System.out.println("Enter the product you're looking for (or 'quit' to exit):");
            String product = scanner.nextLine().toLowerCase();

            if (product.equals("quit")) {
                break;
            }

            String rack = itemRackMap.get(product);
            if (rack != null) {
                System.out.println(product + " is found in " + rack + ".");
            } else {
                System.out.println("Sorry, we don't have " + product + " in stock.");
            }
        }

        System.out.println("Thank you for using shop it easy!");
    }
}

