public class StaticMethod {

    int age;  // non static var
    static int salary; // non static var

    public static void main(String[] args) {
        // greeting();  // error - you cant use this because it requires an instance
        // -- static method can only access static data. It cannot access non static data. bez we know that something which is not static, belongs to an object
       

        // You cant access non static stuff without referencing their instances in a static context
        // hence, here I am referencing it
        StaticMethod obj = new StaticMethod();
        obj.greeting();
    }

    void greeting(){
        System.out.println("Good Morning.");
        System.out.println("Age from greeting()(Non static method) : "+this.age);

    }

    // this is not dependent on objects
    static void fun(){
        System.out.println("Hello world");
        // System.out.println("Age from fun() (static method) : "+ this.age);  //error --bez This represends a objects
     }

    void fun2(){
        greeting(); // can call a non static method inside non static without creating a object 
    }
}


// NOTE: from static we cannot use NON static staffs. 
