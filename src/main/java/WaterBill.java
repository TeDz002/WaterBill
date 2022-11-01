import java.util.Scanner;


public class WaterBill {

    public static double calculateWaterBill(double gallonsUsage) {
        double bill = 18.84;
        double ccf = 748;
        double ccf_used = Math.ceil(gallonsUsage / ccf);

        if (gallonsUsage > 0) {
            if (ccf_used > 2.0) {
                for (int i=0; i<ccf_used-2; i++) {
                    bill += 3.9;
                }
            }
        }
        return (double) Math.round(bill * 100) / 100;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water " +
                "did you use this month?");
        double usage = scanner.nextDouble();
        System.out.println("Your water bill is " +
                calculateWaterBill(usage));
    }
}
