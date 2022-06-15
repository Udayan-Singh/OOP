//A parent class passes on its properties that can be
//used by its child class.

//Child class inherits properties of parent and has some additional
//properties of its own.
public class Inheritance {
    public static void main(String[] args) {
        Box b1 = new Box(1,2,3);
        System.out.println(b1.l + " " + b1.w + " " + b1.h);
    }
}

class Box{
    double l;
    double w;
    double h;

    Box() {
        this.h = -1;
        this.w = -1;
        this.l = -1;
    }

    //Cube
    Box(double side){
        this.h = side;
        this.w = side;
        this.l = side;
    }

    //Cuboid
    Box(double l, double w, double h){
        this.h = h;
        this.w = w;
        this.l = l;
    }

    Box(Box object){
        this.h = object.h;
        this.l = object.l;
        this.w = object.w;
    }
}

class BoxWeight extends Box{
     
}



