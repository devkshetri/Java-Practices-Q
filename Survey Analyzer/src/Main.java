public class Main {
    public static void main(String[] args) {

        int[] responses = {1, 5, 3, 2, 5, 1, 4, 3, 5, 2};

        // Index 0
        int[] freq = new int[6];

        // Count
        for (int rating : responses) {
            freq[rating]++;
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Rating " + i + ": " + freq[i]);
        }
    }
}
