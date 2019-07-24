package Polymorphism;
/**
 * apple
 */
public class apple extends fruit {

    String state;
    int redIntensity;

    apple(String color,String shape,float weight){
        super(color,shape,weight);
    }

    void makeItCustardApple(){
        this.redIntensity = 1;
    }

    void print_info(){
        //super.print_info();
        System.out.println("State "+state);
        this.makeItCustardApple(); // Will work here as the compiler will see it at run time.
        System.out.println("redIntensigty: "+redIntensity);
    }
}