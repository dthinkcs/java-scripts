
/**
 * Write a description of DemoBoxWeigh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThreeDemoBoxWeightFourREFtype {
     public static void main() {
         BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
         BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
         double vol;
         vol = mybox1.volume();
         System.out.println("Volume of mybox1 is " + vol);
         System.out.println("Weight of mybox1 is " + mybox1.weight);
         System.out.println();
         vol = mybox2.volume();
         System.out.println("Volume of mybox2 is " + vol);
         System.out.println("Weight of mybox2 is " + mybox2.weight);
         
         // ------------------------------------------------------
         BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
         Box plainbox = new Box();

         vol = weightbox.volume();
         System.out.println("Volume of weightbox is " + vol);
         System.out.println("Weight of weightbox is " +
         weightbox.weight);
         System.out.println();
         // assign BoxWeight reference to Box reference
         plainbox = weightbox;
         vol = plainbox.volume(); // OK, volume() defined in Box
         System.out.println("Volume of plainbox is " + vol);
         /* The following statement is invalid because plainbox
         does not define a weight member. 
         That is,
            when a reference to a subclass object is assigned to a superclass reference variable, you will
            have access only to those parts of the object defined by the superclass.
            
            This is why plainbox
            can’t access weight even when it refers to a BoxWeight object. If you think about it, this
            makes sense, because the superclass has no knowledge of what a subclass adds to it. This is
            why the last line of code in the preceding fragment is commented out. It is not possible for
            a Box reference to access the weight field, because Box does not define one.
            
            
            Although the preceding may seem a bit esoteric, it has some important practical
            applications—two of which are discussed later in this chapter
         
         */
         // System.out.println("Weight of plainbox is " + plainbox.weight);
         
         //
     }
}

// This program uses inheritance to extend Box.
class Box {
     double width;
     double height;
     double depth;
     
     // construct clone of an object
     Box(Box ob) { // pass object to constructor
         width = ob.width;
         height = ob.height;
         depth = ob.depth;
     }
     
     // constructor used when all dimensions specified
     Box(double w, double h, double d) {
         width = w;
         height = h;
         depth = d;
     }
     
     // constructor used when no dimensions specified
     Box() {
         width = -1; // use -1 to indicate
         height = -1; // an uninitialized
         depth = -1; // box
     }
     
     // constructor used when cube is created
     Box(double len) {
         width = height = depth = len;
     }
     
     // compute and return volume
     double volume() {
         return width * height * depth;
     }
}

class BoxWeight extends Box // BoxwithWeight
{
    double weight;
    
    BoxWeight(double w, double h, double d, double m) {
         /*
         width = w;
         height = h;
         depth = d;
         */
         super(w, h, d);
         weight = m;
    }
}

class ColoredBox extends BoxWeight
{
    String color;
    ColoredBox(double w, double h, double d, double m, String c)
    {
        super(w, h, d, m);
        color = c;
    }
}