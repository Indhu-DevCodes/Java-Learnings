package ConditionalStatements_04;

import java.util.Scanner;

public class SwitchUpdated {
    
    public static void main(String[] args) {
        
        String day = "Wednesday";

        // switch can use statements
        switch (day) {
            case "Saturday","Sunday":
                System.out.println("Wake me at 8 AM");
                break;
            case "Monday":
                System.out.println("Wake me at 6 AM");

            default:
                System.out.println("Wake me at 7 AM");
                break;
        }
        //  switch can use expression 
        // to avoid multiple break statements for each and every case statement
        switch (day) {
            case "Saturday","Sunday" -> System.out.println("Wake me at 8 AM");
            case "Monday" -> System.out.println("Wake me at 6 AM");
            default -> System.out.println("Wake me at 7 AM");
        }

        // simplify -> switch can use expression 
        String result = null;
        result = switch (day) {
            case "Saturday","Sunday" -> "Wake me at 8 AM";
            case "Monday" -> "Wake me at 6 AM";
            default -> "Wake me at 7 AM";
        };

        System.out.println(result);

        // Nested Switch 
        String paymentMode = null;
        String appName = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter local grocery app name at chennai: ");
        appName = scanner.next();
        System.out.println("which Payment method you want to use: ");
        paymentMode = scanner.next();

        switch (appName) {
            case "Zepto":
                switch (paymentMode) {
                    case "Upi":
                        System.out.println("payment done through UPI.");
                        break;
                        case "Credit card":
                        System.out.println("payment done through Credit card.");
                        break;
                        case "Debit card":
                        System.out.println("payment done through Debit card.");
                        break;
                    default:
                        System.out.println("payment done through cash");
                        break;
                }
                break;
            case "blinkIt":
            System.out.println("payment done through Cash.");
            default:
                System.out.println("wrong app name entered.");
                break;
        }
    }
}
