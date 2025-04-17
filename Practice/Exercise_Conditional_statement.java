package Practice;

public class Exercise_Conditional_statement {
    public static void main(String[] args) {
        
        int price = 50;

        if (price < 100) {
            System.out.println("price is lessthan 100");
        }

        if (price > 20) {
            System.out.println("price is greaterthan 20");
        }

        if(price<=50)
            System.out.println("price is lessthan or equal to 50");

        int quantity = 10;
        if (price * quantity == 500) {
            System.out.println(quantity + " price is 500" );
        }

        if (true) {
            System.out.println("Condition is true with boolean");
        }

        // if (1) {        // error
            
        // }

        // if ("true") {       //error with other types except boolean
            
        // }

        boolean bool = false;
        if (true) {
            System.out.println("first condition is true");
            bool = true;
            if (bool) {
                System.out.println(bool);
            }
        }

        if(true)
            System.out.println("hello world from first if");
            if(true)
            System.out.println("hello world is from second if condition");

        if(false)
        System.out.println("false");
        else
        System.out.println("condition failing");

        if (15>100) {
            System.out.println("condition false");
        }

        price =400;
        quantity = 20;
        if(price*quantity < 10000){
            System.out.println("our order price is high");
        } else
            System.out.println("order price is low");

        price = 100;
        if(price == 100){
            System.out.println("price is equal to 100");
        }

        if(price >= 100)
        System.out.println("price is greaterthan or equal to 100.");

        if(price<=1000)
        System.out.println("price lessthan or equal to 1000");

        if (price != 1000) {
            System.out.println("price is not equal to 1000.");
        }

        // else if

        if (price > 1000) 
            System.out.println("price is greaterthan 1000");
        else if (price >= 1000)
            System.out.println("price is greaterthan or = 1000");
        else if(price < 1000)
            System.out.println("price is lessthan 1000");
        else
            System.out.println("all condition is worng");

        String day = "Monday";
        if (day.equals("Mon")) {
            System.out.println("Today is Monday");
        } else if (day.equals("Monday")) {
            if(price!=10)
            day = "Tuesday";
            System.out.println("Today is Monday tomorrow is "+day);
        } else if (day.equals("Tuesday")){
            System.out.println("Today is Tuesday");
        }
        System.out.println(day);
    }
}
