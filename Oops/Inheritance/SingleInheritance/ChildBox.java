package Oops.Inheritance.SingleInheritance;

public class ChildBox extends ParentBox{
    int weight;

    public ChildBox(int weight) {
        this.weight = weight;
    }

    public ChildBox(double l, double w, double h, int weight) {
        super(l, w, h);     // what is this? call the parent class constructor
//        used to initialize values present in parent class
//        All those sub class includes like the members of it's super class it will be allow you to access that are private
        this.weight = weight;
    }

    public static void main(String[] args) {

        ParentBox threeParamConstBox = new ParentBox(3,2,1);
        System.out.println(threeParamConstBox.h + " " + threeParamConstBox.l + " " + threeParamConstBox.w);

        ParentBox box = new ParentBox(threeParamConstBox);
        System.out.println(box.h + " " + box.l + " " + box.w);

        ChildBox box1 = new ChildBox(90);
        System.out.println(box1.h + " " + box1.l + " " + box1.w + " " + box1.weight);

        ChildBox box2 = new ChildBox(4,2,7,90);
        System.out.println(box2.h + " " + box2.l + " " + box2.w + " " + box2.weight);

        ParentBox box3 = new ChildBox(2,3,4,80);       // can access parent vars or methods
        // System.out.println(box3.l);     //if parent vars are private then not able to access
        System.out.println(box3.w);



        /*
         there are many variables in both parent and child classes
         you are given access to variables that are in the ref type i.e childBox
         hence, you should have access to weight variable
         this also means, that the once you are trying to access should be initialised
         but here, when the obj itself is of type parent class, how will you call the constructor
         this is why error
         */
        // ChildBox box4 = new ParentBox();         // error
        // System.out.println(box4);

    }

}
