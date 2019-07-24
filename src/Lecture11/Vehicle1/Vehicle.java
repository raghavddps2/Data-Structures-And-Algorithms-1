package Vehicle1;
import Vehicle1.*;
/**
 * Vehicle
 */
public class Vehicle {


    String color;
    private int numberOfGears;
    protected boolean airbags;

    protected Vehicle(String color,boolean airbags){
        this.airbags = airbags;
        this.color =color;
    }
    public void setGears(int n){
        this.numberOfGears = n;
    }
    public int getGears(){
        return this.numberOfGears;
    }

    protected void print_info(){
       // System.out.println("Vehicle Class");
        System.out.println("Color is: "+color);
        System.out.println("Gears are: "+getGears());
        System.out.println("Airbags are there: "+airbags);
    }
}