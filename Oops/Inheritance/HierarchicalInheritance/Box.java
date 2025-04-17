package Oops.Inheritance.HierarchicalInheritance;

public class Box {

    double l;
    double b;
    double h;

    public Box() {

    }

    public Box(int side) {
        this.l = side;
        this.b = side;
        this.h = side;
    }

}

class BoxA extends Box{

    int weight;

    public BoxA(int side, int weight) {
//        super(); //default value will be print bez it refers to no-args constructor of a parent class
        super(side);
        this.weight = weight;
    }
    
}

class BoxB extends Box{

    int price;

    public BoxB(int side, int price) {
        super(side);
        this.price = price;
    }
}

class BoxC extends Box{

    String color;

    public BoxC(int side, String color) {
        super(side);
        this.color = color;
    }
}

class BoxMain {

    public static void main(String[] args) {

        BoxA box1 = new BoxA(5, 67);
        System.out.println("BoxA is ------>> " + "side- " + box1.l + " weight- " + box1.weight);
    
        BoxB box2 = new BoxB(5, 700);
        System.out.println("BoxB is ------>> " + "side- " + box2.l + " price- " + box2.price);

        BoxC box3 = new BoxC(5, "red");
        System.out.println("BoxC is ------>> " + "side- " + box3.l + " color- " + box3.color);
    }

}
