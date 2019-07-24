package Vehicle1;
import Vehicle1.*;
/**
 * Car
 */
public class Car extends Vehicle {

    boolean sideCar;
    String name;

    Car(String name,boolean sideCar,String color,boolean airbags){
        super(color,airbags);
        this.name = name;
        this.sideCar = sideCar;
        this.color = color;
    }
    void print_info(){
    //    System.out.println("Car class");
        super.print_info();
        System.out.println("Side car: "+sideCar);
        System.out.println("Name: "+name);

    }
     
}