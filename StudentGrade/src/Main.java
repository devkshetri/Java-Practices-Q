import java.util.ArrayList; // import ArrayLists

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();  // Create an ArrayList


        scores.add(100);  // full marks
        scores.add(70);  // 1st division
        scores.add(35);  // Fail
        scores.add(45);  // just Pass
        scores.add(89);  // Distinction

        for (int score : scores) {

            // for-each loop
            if (score >= 90) {   // 90 or above
                System.out.println("Score " + score + ": Distinction");
            }

            else if (score >= 40) { // // 40 or above
                System.out.println("Score " + score + ": Pass");
            }

            else { // fail
                System.out.println("Score " + score + ": Fail");
            }
        }
    }

    }
