package Oops.Inheritance.MultilevelInheritance;


class GrantParentBox {

    double l;
    double w;
    double h;

    public GrantParentBox() {

    }

    public GrantParentBox(int side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

}

class ParentBox extends GrantParentBox {

    int weight;

    public ParentBox(int side, int weight) {
//        super(); //default value will be print bez it refers to no-args constructor of a parent class
        super(side);
        this.weight = weight;
    }
}

public class Box extends ParentBox{

    int price;

    public Box(int side, int weight, int price) {
        super(side, weight);
        this.price = price;
    }

    public static void main(String[] args) {

        Box box = new Box(5, 72, 300);
        System.out.println("side-length "+box.l+ " side-height- "+box.h +" side-width- "+ box.w +" weight- "+box.weight+" price- "+box.price);
    }
}
