import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Create guest list
        ArrayList<String> guests = new ArrayList<>();
        guests.add("Dev");
        guests.add("Deni");
        guests.add("Grace");
        guests.add("Dev");


        System.out.println("Checking for duplicates...");


        for (int i = 0; i < guests.size(); i++) {

            // Loop

            for (int j = i + 1; j < guests.size(); j++) {

                 // Compare names

                if (guests.get(i).equals(guests.get(j))) {

                    System.out.println("Found duplicate name: " + guests.get(i));

                }
            }
        }
    }
}