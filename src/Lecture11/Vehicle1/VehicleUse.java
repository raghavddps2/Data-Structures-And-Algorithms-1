package Vehicle1;
import Vehicle1.*;

/**
 * VehicleUse
 */
public class VehicleUse {

    public static void main(String[] args) {
        
        // Car c = new Car();
        // c.print_c();
        // c.print_v();
        // Car c1; //=>> ref is imp.
        //System.out.println(c1); //This will give an error.


        //This is freakin important. Have a look at it very very nicely.
        Car c2 = new Car("Sakaram",true,"blue");
        c2.setGears(4);
        c2.print_info();

        Vehicle v1 = new Vehicle("black");
        v1.setGears(6);
        v1.print_info();
    }
}