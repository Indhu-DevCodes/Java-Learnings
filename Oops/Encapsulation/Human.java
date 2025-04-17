package Oops.Encapsulation;

public class Human {

    private int age = 18;
    private String name = "Indu";
    private String location = "Salem";
    
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this. age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

class HumanMain {

    public static void main(String[] args) {
        Human obj = new Human();
        String str = obj.getName();
        str = "Gopu";
        obj.setAge(21);

        // System.out.println(obj.setAge(30));  // error
        
        System.out.println(str+ " " +obj.getAge());
    }
    
}