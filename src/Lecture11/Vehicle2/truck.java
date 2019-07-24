
package Vehicle2;
import Vehicle1.Vehicle;
/**
 * truck
 */
public class truck extends Vehicle{
        int wheels;
        truck(int wheels,boolean airbags,String color){
            super(color,airbags);
            this.wheels = wheels;
        }
        void print_fun(){
            System.out.println(this.airbags);
        }
}   

