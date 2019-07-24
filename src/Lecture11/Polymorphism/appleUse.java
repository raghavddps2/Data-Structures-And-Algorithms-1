package Polymorphism;

import Polymorphism.fruit;

/**
 * appleUse
 */
public class appleUse {

    public static void main(String[] args) {
        

        //This is actuallly compile time polymorphism here. we have a reference of type fruit and we 
        //are actually assigning a apple here. 

        fruit f = new apple("red","sphere",200); 
        //NOw you create an method in apple and try accessing it, you won't be able to access it 
        // as we have the actual reference of a fruit.
        
       // f.makeItCustardApple();  # ===> Proves i can't access it.
        //Here, when it comes to runtime it will access the apple class functions only.
        f.print_info();

        //This is purely an error as you are creating a refernce of apple and stroing fruit in the same.
       // apple a = new fruit("red","sphere",200);

    }
}