package Oops.ObjectClass;

public class ObjectPrint {

    /**
     * by default in Java, every class has extended with 'Object' class which is having 'toString' method
     * when we tried to print the object it will give some random value like below.
     * com.java.oops.polyMorphism.ObjectPrint@1b6d3586
     
    // Orginal toString from object class for reference
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

     * So that's the reason why we are generating toString in the class is to get an value of that object(the below overridden method will be executed)
     */
    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }


    @Override       // toString is override here from 'Object' class
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint objectPrint = new ObjectPrint(85);
        System.out.println(objectPrint);

        int[] arr = {1,2,3,4};
        System.out.println(arr.toString());
    }
}