package Lecture11;

/**
 * VehicleUse
 */
public class VehicleUse {

    public static void main(String[] args) {
        
        Car c = new Car();
        c.print_c();
        c.print_v();
        Car c1; //=>> ref is imp.
        //System.out.println(c1); //This will give an error.
    }
}