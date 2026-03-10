import java.util.*;

class FoodItem {
    private String name;
    private double price;
    private double rating; 

    public FoodItem(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() { 
        return name; 
    }
    public double getPrice() { 
        return price; 
    }
    public double getRating() { 
        return rating; 
    }
    public String toString() {
        return String.format("%s (₹%.2f, rating: %.1f)", name, price, rating);
    }
}
class Main {
    public static void main(String[] args) {
        List<FoodItem> menu = new ArrayList<>();
        menu.add(new FoodItem("Paneer Tikka", 220.0, 4.6));
        menu.add(new FoodItem("Veg Biryani", 150.0, 4.6));
        menu.add(new FoodItem("Butter Chicken", 320.0, 4.8));
        menu.add(new FoodItem("Masala Dosa", 120.0, 4.4));
        menu.add(new FoodItem("Gulab Jamun", 80.0, 4.2));

        Comparator<FoodItem> byRatingDescThenPriceAsc =
            Comparator.comparingDouble(FoodItem::getRating).reversed()
                      .thenComparingDouble(FoodItem::getPrice);

        List<FoodItem> sortedByRating = new ArrayList<>(menu);
        sortedByRating.sort(byRatingDescThenPriceAsc);

        System.out.println("Sorted by rating (highest first), ties -> lower price first:");
        for (FoodItem f : sortedByRating) {
            System.out.println(f);
        }

        List<FoodItem> sortedByName = new ArrayList<>(menu);
        sortedByName.sort(Comparator.comparing(FoodItem::getName, String.CASE_INSENSITIVE_ORDER));

        System.out.println("\nSorted alphabetically by name (A - Z):");
        for (FoodItem f : sortedByName) {
            System.out.println(f);
        }
    }
}