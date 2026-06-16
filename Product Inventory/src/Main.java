public class Main {

    public static void main(String[] args) {

        // Create our array

        Electronics[] inventory = {
                new Electronics("Laptop", 200000.0),
                new Electronics("phone", 150000.0)
        };

        System.out.println("--- Black Friday Sale: 10% OFF EVERYTHING! ---");

        // Loop
        for (Electronics e : inventory) {

            e.applyDiscount(10.0);

        }
    }
}
