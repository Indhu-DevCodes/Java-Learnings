package JavaKeywords.thisANDsuper;

class A{
    public A(){
                  //every constructor the first statement is super() even you are not specify
        System.out.println("from A");
    }

    public A(int a){
        super();
        System.out.println("from A class with single param");
    }
}

class B extends A{
    public B(){
        System.out.println("from B");
    }

    public B(int b){
        // this();    // refers current class construtor if you want you can pass parameter
                 // this() and super() anyone should be first, both won't work
        // super();   // super() refers parent class constructor
        super(b);    // if you want to call parent's parameterized constructor then pass the value in super() method.
        System.out.println("from B class with single param "+b);
    }
}

public class This_Super {
    public static void main(String[] args) {
        B obj1 = new B();
        B obj2 = new B(5);

    }
}
