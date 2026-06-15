public class Main {

    public static void main(String[] args) {


        ColdBox FridgeBox = new ColdBox(19, 500.5);


        System.out.println("Created Box ID: " + FridgeBox.id);
        System.out.println("Capacity: " + FridgeBox.capacity);


        FridgeBox.adjustTemp(-17);
        FridgeBox.adjustTemp(-22);
    }
}