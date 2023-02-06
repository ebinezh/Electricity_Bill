import java.lang.*;
import java.util.*;

class ex1 {
    public static void main(String... args) {
        String consumer_no, consumer_name;
        double prev_month_reading, current_month_reading, no_units;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the consumer no :");
        consumer_no = scan.nextLine();
        System.out.println("Enter the consumer name :");
        consumer_name = scan.nextLine();
        System.out.println("Enter the previous month reading :");
        prev_month_reading = scan.nextFloat();
        System.out.println("Enter the current month reading :");
        current_month_reading = scan.nextFloat();
        no_units = current_month_reading - prev_month_reading;
        System.out.println("Select the type of electricity bill :");
        System.out.println("1.Domestic");
        System.out.println("2.Commercial");
        int opt = scan.nextInt();
        switch (opt) {
            case 1:
                System.out.println("---------------------------------------------");
                System.out.println(" ElectricityBill ");
                System.out.println("---------------------------------------------");
                System.out.println("Consumer name : " + consumer_name);
                System.out.println("Consumer no : " + consumer_no);
                System.out.println("No.of units : " + no_units);
                System.out.println("Electricity Bill : Rs." + domestic(no_units));
                System.out.println("---------------------------------------------");
                break;

            case 2:
                System.out.println("---------------------------------------------");
                System.out.println(" ElectricityBill ");
                System.out.println("---------------------------------------------");
                System.out.println("Consumer name : " + consumer_name);
                System.out.println("Consumer no : " + consumer_no);

                System.out.println("No.of units : " + no_units);
                System.out.println("Electricity Bill : Rs." + commercial(no_units));
                System.out.println("---------------------------------------------");
                break;
            default:
                System.out.println("Select the appropriate option!");
                break;
        }
    }

    public static double domestic(double no_units) {
        double cost = 1;
        if (no_units <= 100) {
            cost = no_units * 1;
        } else if (no_units >= 101 && no_units <= 200) {
            cost = no_units * 2.50;
        } else if (no_units >= 201 && no_units <= 500) {
            cost = no_units * 4;
        } else {
            cost = no_units * 6;
        }
        return cost;
    }

    public static double commercial(double no_units) {
        double cost = 1;
        if (no_units <= 100) {
            cost = no_units * 2;
        } else if (no_units >= 101 && no_units <= 200) {
            cost = no_units * 4.50;
        } else if (no_units >= 201 && no_units <= 500) {
            cost = no_units * 6;
        } else {
            cost = no_units * 7;
        }
        return cost;
    }
}
