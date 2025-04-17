

public class StaticInnerClass {
    
    static class Test {
        
    
        public void a(){
            System.out.println( "Innerclass: I am from a method.. ");
        }

        public static void b(){
            System.out.println( "Innerclass: I am from b method & static.. ");
        }
    }

    public void a(){
        System.out.println( "Outerclass: I am from a method.. ");
    }

    public static void b(){
        System.out.println( "Outerclass: I am from b method & static.. ");
    }

    public static void main(String[] args) {
        StaticInnerClass obj = new StaticInnerClass();
        obj.a();
        StaticInnerClass.b(); 
    }
}


/*
 -- Outside class cannot be static because it is not itself dependent on any other class but inner class can be static.
 -- 
 */
