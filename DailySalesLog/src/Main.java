import java.io.FileWriter;
import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) {

        // Create our array
        double[] sales = {150, 1000, 120, 300, 95, 450, 210};


        try {
            // create 'weekly_sales.txt'
            FileWriter File = new FileWriter("weekly_sales.txt");


            BufferedWriter helper = new BufferedWriter(File);

            // Loop
            for (double todaysSale : sales) {

                helper.write(String.valueOf(todaysSale));
                helper.newLine();
            }


            helper.close();

            System.out.println("All sales were saved to weekly_sales.txt");

        } catch (Exception e) {

            System.out.println("We couldn't save the file.");
        }
    }
}