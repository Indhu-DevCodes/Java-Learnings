package JavaKeywords.thisANDsuper;

public class Human {

    private int age = 18;
    
    public int getAge(){
        return age;
    }

    // public void setAge(int age){
    //     age = age;      // refers only local variable
    // }

    // public void setAge(int age, Human obj){
    //     Human obj1 = obj;
    //     obj1.age = age;   // means current obj
    // }

    // instead of passing obj we have 'this' 
    public void setAge(int age){
        this.age = age;      // this refers current obj
    }


}

class HumanMain {

    public static void main(String[] args) {
        Human obj = new Human();
        // obj.setAge(21, obj);      // passing obj in setter method
        obj.setAge(21);  
        System.out.println("My Age is " + obj.getAge());
    }
    
}