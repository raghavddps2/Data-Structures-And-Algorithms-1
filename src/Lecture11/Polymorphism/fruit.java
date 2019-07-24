package Polymorphism;
/**
 * fruit
 */
public class fruit {

    String color;
    String shape;
    float weight;

    fruit(String color,String shape,float weight){
        this.color =color;
        this.shape = shape;
        this.weight = weight;
    }

    void print_info(){
        System.out.println("Inside fruit class");
        System.out.println("Color: "+color);
        System.out.println("Shape: "+shape);
        System.out.println("Weight: "+weight);
    }
}