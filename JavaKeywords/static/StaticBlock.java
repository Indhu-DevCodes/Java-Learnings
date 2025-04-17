public class StaticBlock {

    static int a = 4;
    static int b;


    /*
    // static variables values are created once in a memory, this is not like obj which we can create mutiple values with multiple obj in memory.
    // static block is for initializing a variables. This block will call only once irrespectively howmany objs you create.
    // static block will only run once, when the first obj is create. i.e.  when the class is loaded for 
    // the first time.
     */ 
    static{
        System.out.println("I am in static block");
        b = a * b;
    }

   public static void main(String[] args) throws ClassNotFoundException {
    StaticBlock sb1 = new StaticBlock();
    System.out.println(StaticBlock.a + " " + StaticBlock.b);

    StaticBlock.a += 3;

    StaticBlock sb2 = new StaticBlock();  //if the second obj is created and loaded then it won't run the static block,
    // this will run only once a time of creating a obj at first time
    System.out.println(StaticBlock.a + " " + StaticBlock.b);

    //To load your class
    // Class.forName("StaticBlock");


   }
}


// NOTE : order of execution
// Obj creation >> Class loading happens (Static block will execute first) >> create a obj (calling constructor)
