public class StaticVariable {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 2000;
        // obj1.name = "Anroid";
        Mobile.name = "Anroid";
        
        Mobile obj2 = new Mobile();
        obj2.brand = "IQOO";
        obj2.price = 4000;
        // obj2.name = "Iphone";
        Mobile.name = "Iphone";

        obj1.show();        // every obj will have different values, but if you want to common value for all the obj use static that's why static vars are called with className itself
        obj2.show();
    }
}

class Mobile{

    // instance variable / if it is inside a method that's local variable
    String brand;
    int price;
    // String name;
    static String name;     // common value for all objs.

    public void show(){
        System.out.println(brand + " " +price+" : "+name);
    }
}